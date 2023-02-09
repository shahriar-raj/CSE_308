public class Script {
    private int id, marks;
    private String msg;

    public Script(int id){
        this.id = id;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public int getId() {
        return id;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
