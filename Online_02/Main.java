public class Main {
    public static void main(String[] args) {
        Subject St1 = new Subject("GP",20);
        Subject St2 = new Subject("Bkash", 40);
        Client A = new Client(St1,1);
        Client B = new Client(St2, 2);
        A.addSub(St2);
        St1.setPrice(50);
        St2.setPrice(100);
    }
}
