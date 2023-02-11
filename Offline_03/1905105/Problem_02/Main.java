import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_GREEN = "\u001B[32m";
        final String Reset = "\u001b[0m";
        while(true) {
            System.out.println(ANSI_RED+"কফির টং");
            System.out.print(Reset);
            System.out.println("Press 1 to start New Order");
            System.out.println("Press 2 to exit");
            Scanner scn = new Scanner(System.in);
            if(scn.nextInt()==2) {
                System.out.println(ANSI_WHITE+"Console Exited......");
                System.out.print(Reset);
                break;
            }
            List<Beverage> beverages = new ArrayList<>();
            while(true) {
                System.out.println(ANSI_RED+"\nকফির টং");
                System.out.println(ANSI_WHITE+"Coffee Menu: ");
                System.out.print(Reset);
                System.out.println("1.Americano \n2.Espresso \n3.Cappuccino \n4.Mocha \n5.Order Completed");
                Scanner scn2 = new Scanner(System.in);
                int l = scn2.nextInt();
                System.out.println(l);
                if(l==5){
                    System.out.println(ANSI_GREEN+"Generating Receipt...........\n");
                    System.out.print(Reset);
                    System.out.println(ANSI_RED+"কফির টং");
                    System.out.println("--------");
                    System.out.print(Reset);
                    int count =1;
                    double cost = 0;
                    for (Beverage B:beverages) {
                        System.out.println(count+". "+B.getDescription()+" Price: "+B.Cost()+" Taka");
                        cost += B.Cost();
                        count++;
                    }
                    System.out.println(ANSI_RED+"---------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Total: "+cost + " Taka\n");
                    System.out.print(Reset);
                    break;
                }
                Beverage beverage;
                switch (l){
                    case 1 : beverage = new BlackCoffee("Americano");
                             beverage = new GrindedCoffee(beverage);
                             beverages.add(beverage);
                             break;
                    case 2 : beverage = new BlackCoffee("Espresso");
                             beverage = new DairyCream(beverage);
                             beverages.add(beverage);
                             break;
                    case 3 : beverage = new MilkCoffee("Cappuccino");
                             beverage = new CinnamonPowder(beverage);
                             beverages.add(beverage);
                             break;
                    case 4 : beverage = new MilkCoffee("Mocha");
                             beverage = new ChocolateSauce(beverage);
                             beverages.add(beverage);
                             break;
                }
            }
        }
    }
}
