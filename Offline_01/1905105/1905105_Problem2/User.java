import java.util.LinkedList;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Director director = new Director();
        while(true){
            Scanner scn = new Scanner(System.in);
            System.out.println("Press 'O' to start an  order and 'Q' to exit the system");
            String cmd = scn.nextLine();
            if(cmd.equalsIgnoreCase("O")){
                LinkedList<Product> products = new LinkedList<Product>();
                double t_cost = 0;
                for(int i=1; ;i++){
                    iBuilder PC = null;
                    boolean exit = false;
                    while(true) {
                        System.out.println("Select your PC:");
                        System.out.println("1. 11th Generation Intel Core i5 PC");
                        System.out.println("2. 11th Generation Intel Core i7 PC");
                        System.out.println("3. 11th Generation Intel Core i9 PC");
                        System.out.println("4. AMD Ryzen 7 5700X Gaming PC");
                        System.out.println("Press 'E' to Close your order. But you must buy at least one PC before closing the order.");
                        Scanner scn1 = new Scanner(System.in);
                        cmd = scn1.nextLine();
                        cmd = cmd.trim();
                        if (cmd.equalsIgnoreCase("1")) {
                            PC = new corei5();
                            break;
                        } else if (cmd.equalsIgnoreCase("2")) {
                            PC = new corei7();
                            break;
                        } else if (cmd.equalsIgnoreCase("3")) {
                            PC = new corei9();
                            break;
                        } else if (cmd.equalsIgnoreCase("4")) {
                            PC = new GPC();
                            break;
                        }
                        else if(cmd.equalsIgnoreCase("E") && i>1){
                            exit = true;
                            break;
                        }
                        else if(cmd.equalsIgnoreCase("O")){
                            System.out.println("You cannot open a new order before exiting this!");
                        }
                        else {
                            System.out.println("Invalid Input!");
                        }
                    }
                    if(exit){
                        break;
                    }
                    director.Construct(PC);
                    while(true) {
                        System.out.println("Added Components:");
                        System.out.println("1. 8 GB DDR4 RAM - 2666 MHz");
                        System.out.println("2. 8 GB DDR4 RAM - 3200 MHz");
                        System.out.println("3. 2GB Graphics Card");
                        System.out.println("4. 4GB Graphics Card");
                        System.out.println("Press 'E' to Close your order. Press 'S' to add current item to the order.");
                        Scanner scn1 = new Scanner(System.in);
                        cmd = scn1.nextLine();
                        cmd = cmd.trim();
                        if (cmd.equalsIgnoreCase("1")) {
                            director.AddRam(PC,1);
                        } else if (cmd.equalsIgnoreCase("2")) {
                            director.AddRam(PC,2);
                        } else if (cmd.equalsIgnoreCase("3")) {
                            director.AddGraphics(PC,3);
                        } else if (cmd.equalsIgnoreCase("4")) {
                            director.AddGraphics(PC,4);
                        }
                        else if(cmd.equalsIgnoreCase("S")){
                            break;
                        }
                        else if(cmd.equalsIgnoreCase("E")){
                            exit = true;
                            break;
                        }
                        else if(cmd.equalsIgnoreCase("O")){
                            System.out.println("You cannot open a new order before exiting this!");
                        }
                        else {
                            System.out.println("Invalid Input!");
                        }
                    }
                    Product p1 = PC.getPC();
                    products.addLast(p1);
                    System.out.println("Your item has been successfully added to the order!\n");
                    if(exit){
                        break;
                    }
                    i++;
                }
                for(int i=0; i< products.size();i++){
                    System.out.println("----------------------------------------------------");
                    System.out.println("PC "+(i+1)+":" + products.get(i).getName());
                    System.out.println("----------------------------------------------------");
                    products.get(i).Show();
                    System.out.println("----------------------------------------------------\n");
                    t_cost+=products.get(i).getCost();
                }
                System.out.println("Your Order's total Cost: "+String.format("%.0f", t_cost)+" BDT");
                System.out.println("----------------------------------------------------\n");
            }
            else if(cmd.equalsIgnoreCase("Q")){
                break;
            }
            else{
                System.out.println("Invalid Input");
            }
        }
    }
}
