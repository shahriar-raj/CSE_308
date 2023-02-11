public class CinnamonPowder extends CondimentDecorator{
    Beverage beverage;

    public CinnamonPowder(Beverage beverage) {
        this.beverage = beverage;
        this.description = "Cinnamon Powder";
    }

    @Override
    public double Cost() {
        return beverage.Cost()+50;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+description+", ";
    }
}
