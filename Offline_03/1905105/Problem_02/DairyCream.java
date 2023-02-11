public class DairyCream extends CondimentDecorator{
    Beverage beverage;

    public DairyCream(Beverage beverage) {
        this.beverage = beverage;
        this.description = "Dairy Cream";
    }

    @Override
    public double Cost() {
        return beverage.Cost()+40;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+description+", ";
    }
}
