import java.util.Scanner;

public class PremiumUser extends Observer{

    public PremiumUser(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
        this.prState = this.subject.getState();
    }

    @Override
    public void update() {
        if(prState==0 && subject.getState()==1){
            System.out.println("Premium User:\nThe server has gone from Operational to Partially Down !");
            System.out.println("What Do you want?");
            System.out.println("[1] Service from Both servers (partially from ABC & partially from DEF)");
            System.out.println("[2] Service fully from DEF");
            Scanner scn = new Scanner(System.in);
            if(scn.nextInt()==1){
                subState=1;
                System.out.println("Giving Service from Both servers (partially from ABC & partially from DEF)");
            }
            else{
                subState=2;
                System.out.println("Giving Service fully from DEF");
            }
        }

        else if(prState==0 && subject.getState()==2){
            System.out.println("Premium User:\nThe server has gone from Operational to Fully Down !");
            System.out.println("The service is now provided fully by our partner DEF");
        }

        else if(prState==1 && subject.getState()==0 ){
            System.out.println("Premium User:\nThe server has gone from Partially Down to Operational !");
            System.out.println("The service is now provided fully by ABC");
        }

        else if(prState==1 && subject.getState()==2){
            System.out.println("Premium User:\nThe server has gone from Partially Down to Fully Down !");
            System.out.println("The service is now provided fully by our partner DEF");
        }

        else if(prState==2 && subject.getState()==0){
            System.out.println("Premium User:\nThe server has gone from Fully Down to Operational !");
            System.out.println("The service is now provided fully by ABC");
        }

        else if(prState==2 && subject.getState()==1){
            System.out.println("Premium User:\nThe server has gone from Fully Down to Partially Down !");
            System.out.println("What Do you want?");
            System.out.println("[1] Service from Both servers (partially from ABC & partially from DEF)");
            System.out.println("[2] Keep Using Service fully from DEF");
            Scanner scn = new Scanner(System.in);
            if(scn.nextInt()==1){
                subState=1;
                System.out.println("Giving Service from Both servers (partially from ABC & partially from DEF)");
            }
            else{
                subState=2;
                System.out.println("Giving Service fully from DEF");
            }
        }

        System.out.println();
        prState = subject.getState();
    }
}
