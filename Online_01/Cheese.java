public class Cheese extends Components{
    int price = 30;
    String name = "Cheese";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
