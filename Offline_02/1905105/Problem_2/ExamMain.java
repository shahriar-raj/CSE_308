import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamMain {

    public static List<Student> recheckRequest(List<Student> students){
        List<Student> studentsRe = new ArrayList<>();
        System.out.println();
        for(Student s:students){
            System.out.println("Do "+s.getId()+" need recheck?[Y/N]");
            Scanner scn1 = new Scanner(System.in);
            String r = scn1.nextLine();
            if(r.equalsIgnoreCase("Y")){
                s.Send();
                studentsRe.add(s);
            }
        }
        return studentsRe;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Script> scripts = new ArrayList<>();
        ExamController EC = new ExamController();
        Examiner examiner = new Examiner(EC);
        students.add(new Student(EC,1905082));
        scripts.add(new Script(1905082));
        students.add(new Student(EC,1905084));
        scripts.add(new Script(1905084));
        students.add(new Student(EC,1905105));
        scripts.add(new Script(1905105));
        students.add(new Student(EC,1905067));
        scripts.add(new Script(1905067));
        students.add(new Student(EC,1905104));
        scripts.add(new Script(1905104));
        EC.setStudents(students,false);
        EC.setExaminer(examiner);
        examiner.Send(scripts,false);
        List<Student> studentsRe = new ArrayList<>();
        studentsRe = recheckRequest(students);
        EC.setStudents(studentsRe,true);
    }
}
