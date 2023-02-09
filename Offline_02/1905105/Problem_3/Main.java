import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int state;
        Random random = new Random();
        int c = random.nextInt(5)+5;
        int p = random.nextInt(99)+1;
        VendingMachine vendingMachine = new VendingMachine(c,p);
        state = vendingMachine.getMessage();
        while(state != 5){
            Scanner Mon = new Scanner(System.in);
            vendingMachine.addMoney(Mon.nextInt());
            state = vendingMachine.getMessage();
        }
    }
}
