public class GrindedCoffee extends CondimentDecorator{
    Beverage beverage;

    public GrindedCoffee(Beverage beverage) {
        this.beverage = beverage;
        this.description = "Grinded Coffee";
    }

    @Override
    public double Cost() {
        return beverage.Cost()+30;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+description+", ";
    }
}
