public class HasMoney implements States{
    VendingMachine ven;
    States st;
    @Override
    public void assignVendingMachine(VendingMachine ven) {
        this.ven = ven;
    }

    @Override
    public void addMoney(int money) {
        if((ven.inside + money) == ven.price){
            ven.count--;
            System.out.println("Here is your product");
            if(ven.count>0) {
                ven.inside = 0;
                st = new NoMoney();
                st.assignVendingMachine(ven);
                ven.st = st;
            }
            else{
                ven.inside = 0;
                st = new OutOfStock();
                st.assignVendingMachine(ven);
                ven.st = st;
            }
        }
        else if(ven.price < (ven.inside + money)) {
            System.out.println("Returned extra " + ((ven.inside + money) - ven.price) + " taka");
            ven.count--;
            System.out.println("Here is your product");
            if(ven.count>0) {
                ven.inside = 0;
                st = new NoMoney();
                st.assignVendingMachine(ven);
                ven.st = st;
            }
            else{
                ven.inside = 0;
                st = new OutOfStock();
                st.assignVendingMachine(ven);
                ven.st = st;
            }
        }
        else{
            ven.inside += money;
            st = new HasMoney();
            st.assignVendingMachine(ven);
            ven.st = st;
        }
    }

    @Override
    public int giveMessage() {
        System.out.println("Inventory: "+ven.count);
        System.out.println("Currently there is " +ven.inside +" taka inside. The price of the product: "+ven.price+" taka");
        System.out.println("You have to give more "+(ven.price- ven.inside)+" taka");
        System.out.print("Enter Money: ");
        return 2;
    }
}
