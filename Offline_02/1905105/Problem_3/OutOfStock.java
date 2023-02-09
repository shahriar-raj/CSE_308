public class OutOfStock implements States{
    VendingMachine ven;
    States st;
    @Override
    public void assignVendingMachine(VendingMachine ven) {
        this.ven = ven;
    }

    @Override
    public void addMoney(int money) {

    }

    @Override
    public int giveMessage() {
        System.out.println("!! OOPS !! We Ran Out Of Stock");
        return 5;
    }
}
