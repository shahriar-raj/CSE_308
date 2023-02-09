import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExamController extends Mediator{
    Random random = new Random();
    private List<Student> students;
    private List<Script> scripts;
    private List<Script> recheck = new ArrayList<>();
    private Examiner examiner;

    public void setStudents(List<Student> students, boolean re){
        this.students = new ArrayList<>();
        this.students.addAll(students);
        if(re){
            System.out.println("\nExamController has got the recheck requests");
            for(Student student: this.students){
                Send(student);
            }
            examiner.Send(recheck, true);
        }
    }

    public void setExaminer(Examiner examiner){
        this.examiner = examiner;
    }

    @Override
    public void Send(Examiner examiner, List<Script> scripts, boolean re) {
        if(re){
            System.out.println("\nExamController has received the scripts from Examiner after recheck");
            System.out.println("\nExamController is notifying the students");
            for(Script script: scripts){
                for(Student student: students){
                    if(script.getId() == student.getId()){
                        student.setMarks(script.getMarks());
                        student.notify("ID: "+ student.getId()+ " " +script.getMsg()+ " to "+student.getMarks());
                    }
                }
            }
        }
        else {
            this.scripts = scripts;
            System.out.println("\nExamController has received the scripts from Examiner. Here are the primary marks:");
            for (Script s : scripts) {
                System.out.println("ID: " + s.getId() + " Primary Marks: " + s.getMarks());
            }
            boolean f = false;
            System.out.println("\nMistakes Found:");
            while (true) {
                for (Script s : scripts) {
                    boolean r = random.nextBoolean();
                    if (r) {
                        while (true) {
                            int m = (random.nextInt(100));
                            if (m == s.getMarks())
                                continue;
                            System.out.println("ID: " + s.getId() + " Previous Marks: " + s.getMarks() + " Revised Marks: " + m);
                            s.setMarks(m);
                            f = true;
                            break;
                        }
                    }
                }
                if (f)
                    break;
            }
            System.out.println("\nExamController is notifying the students");
            for (Script s : scripts) {
                for (Student s1 : students) {
                    if (s1.getId() == s.getId()) {
                        s1.setMarks(s.getMarks());
                        s1.notify("ID: " + s1.getId() + " has got " + s1.getMarks());
                    }
                }
            }
        }
    }

    @Override
    public void Send(Student student) {
        System.out.println("Re-examine request got from student id "+student.getId());
        for(Script s: scripts){
            if(s.getId()==student.getId())
                recheck.add(s);
        }
    }
}
