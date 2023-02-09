import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public Subject(){
        this.setState(0);
    }

    public int getState(){
        return state;
    }

    public void setState(int state) {
        if(state>=0 && state<=2 && this.state!=state) {
            this.state = state;
            notifyAllObservers();
        }
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update();
        }
    }
}
