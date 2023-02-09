public class Salad extends Components{
    int price = 10;
    String name = "Salad";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
