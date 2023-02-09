public class VendingMachine {
    int count, price, inside;
    States st;
    public VendingMachine(int count, int price){
        this.count = count;
        this.price = price;
        this.inside = 0;
        this.st = new NoMoney();
        st.assignVendingMachine(this);
    }

    public void addMoney(int money){
        st.addMoney(money);
    }

    public int getMessage(){
        System.out.println("\nOFFLINE VENDING MACHINE INC, 2023");
        return (st.giveMessage());
    }
}
