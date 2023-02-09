import java.util.List;

public abstract class Mediator {
    public abstract void Send(Examiner examiner, List<Script> scripts,boolean re);
    public abstract void Send(Student student);
}
