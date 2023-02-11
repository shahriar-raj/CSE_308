public class ChocolateSauce extends CondimentDecorator{
    Beverage beverage;

    public ChocolateSauce(Beverage beverage) {
        this.beverage = beverage;
        this.description = "Chocolate Sauce";
    }

    @Override
    public double Cost() {
        return beverage.Cost()+60;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+description+", ";
    }
}
