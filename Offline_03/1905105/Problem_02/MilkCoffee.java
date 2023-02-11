public class MilkCoffee extends Beverage{
    public MilkCoffee(String Name) {
        description = Name + "\nBase: Milk Coffee (Milk and Grinded Coffee Beans) , Added Ingredients: ";
    }

    @Override
    public double Cost() {
        return 180;
    }
}