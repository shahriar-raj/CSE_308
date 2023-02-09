import java.util.Scanner;

public class Client extends Observer{

    public Client(Subject subject, int id){
        this.subjects.add(subject);
        subject.attach(this);
        this.id = id;
    }

    @Override
    public void update(String name, int price) {
        System.out.println("Client "+id+" :");
        System.out.println("The price of stock "+name+" has been updated to "+price);
    }

    @Override
    public void addSub(Subject subject) {
        this.subjects.add(subject);
        subject.attach(this);
    }

    @Override
    public void remSub(Subject subject) {
        subject.remove(this);
        subjects.removeIf(s -> s == subject);
    }


}