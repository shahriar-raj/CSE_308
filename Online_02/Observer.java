import java.util.ArrayList;
import java.util.List;

public abstract class Observer {
    protected List<Subject> subjects = new ArrayList<>();
    protected int id;
    public abstract void update(String name, int price);
    public abstract void addSub(Subject subject);
    public abstract void remSub(Subject subject);
}