public abstract class Observer {
    protected Subject subject;
    protected int prState, subState;
    public abstract void update();
}
