import java.util.Scanner;

public class ServiceMain {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new PremiumUser(subject);
        new RegularUser(subject);
        while(true){
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter the State: ");
            subject.setState(scn.nextInt());
        }
    }
}
