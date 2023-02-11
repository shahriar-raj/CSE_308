public class BlackCoffee extends Beverage{
    public BlackCoffee(String Name) {
        description = Name + "\nBase: Black Coffee (Water and Grinded Coffee Beans) , Added Ingredients: ";
    }

    @Override
    public double Cost() {
        return 130;
    }
}
