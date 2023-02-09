import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String name;
    private int price;

    public Subject(String name, int price){
        this.setName(name);
        this.setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        if(this.price!=price) {
            this.price = price;
            notifyAllObservers();
        }
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.removeIf(o -> o == observer);
    }

    public void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update(this.name,this.price);
        }
    }
}
