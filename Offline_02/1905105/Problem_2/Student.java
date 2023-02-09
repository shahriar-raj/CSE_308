public class Student extends Person{
    private int id, marks;
    public Student(ExamController examController, int id){
        super(examController);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void Send(){
        System.out.println("Re-examine request sent from student id " +this.getId());
    }

    public void notify(String msg){
        System.out.println(msg);
    }
}
