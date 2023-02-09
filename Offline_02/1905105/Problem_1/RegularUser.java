import java.util.Random;
import java.util.Scanner;

public class RegularUser extends Observer{
    private int x;
    Random random = new Random();
    public RegularUser(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
        this.prState = this.subject.getState();
    }

    @Override
    public void update() {
        if(prState==0 && subject.getState()==1){
            System.out.println("Regular User:\nThe server has gone from Operational to Partially Down !");
            System.out.println("What Do you want?");
            System.out.println("[1] Continue Using Limited functionality from ABC server");
            System.out.println("[2] Pay $20 per hour to enjoy the full functionality taking service from server of DEF");
            Scanner scn = new Scanner(System.in);
            if(scn.nextInt()==1){
                subState=1;
                System.out.println("Giving Limited Service from ABC ");
            }
            else{
                subState=2;
                x=0;
                System.out.println("Transferring Data from ABC to DEF.....");
                System.out.println("Giving Full Service from DEF");
            }
        }

        else if(prState==0 && subject.getState()==2){
            System.out.println("Regular User:\nThe server has gone from Operational to Fully Down !");
            System.out.println("Do you want to pay $20 per hour to enjoy the full functionality taking service from server of DEF?");
            System.out.println("[1] YES");
            System.out.println("[2] NO");
            Scanner scn = new Scanner(System.in);
            if(scn.nextInt()==2){
                subState=1;
                System.out.println("!! ABC IS OUT OF SERVICE !!");
            }
            else{
                subState=2;
                x=0;
                System.out.println("Transferring Data from ABC to DEF.....");
                System.out.println("Giving Full Service from DEF");
            }
        }

        else if(prState==1 && subject.getState()==0 ){
            System.out.println("Regular User:\nThe server has gone from Partially Down to Operational !");
            if(subState==2){
                x = random.nextInt(100)+1;
                System.out.println("The total bill for getting service from DEF: $"+x);
            }
        }

        else if(prState==1 && subject.getState()==2 ){
            System.out.println("Regular User:\nThe server has gone from Partially Down to Fully Down !");
            if(subState==1){
                System.out.println("!! ABC IS OUT OF SERVICE !!");
            }
            else{
                System.out.println("Giving Full Service from DEF");
            }
        }

        else if(prState==2 && subject.getState()==0){
            System.out.println("Regular User:\nThe server has gone from Fully Down to Operational !");
            if(subState==2){
                x = random.nextInt(100)+1;
                System.out.println("The total bill for getting service from DEF: $"+x);
            }
        }

        else if(prState==2 && subject.getState()==1){
            System.out.println("Regular User:\nThe server has gone from Fully Down to Partially Down !");
            if(subState==1){
                System.out.println("Giving Limited Service from ABC ");
            }
            else{
                System.out.println("Giving Full Service from DEF");
            }
        }
        System.out.println();
        prState = subject.getState();
    }
}
