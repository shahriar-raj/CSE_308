import java.util.Scanner;

public class UserCar {
    public static void main(String[] args) {
        CarFactory carfactory = new CarFactory();
        System.out.print("Enter your Continent: ");
        Scanner scn = new Scanner(System.in);
        String a = (scn.nextLine()).trim();
        Car c = carfactory.getCar(a);
        if(c==null){
            System.out.println("Invalid Input!");
        }
        else{
            System.out.println("-------------Your Car's Description-------------");
            System.out.println("Model: "+c.getModel());
            System.out.println("Color: "+c.getColor());
            System.out.println("Manufacturing Country: "+c.getCountry());
            System.out.println("Engine: "+c.getEngine());
            System.out.println("Drive Train: "+c.getDriveTrain());
        }
    }
}
