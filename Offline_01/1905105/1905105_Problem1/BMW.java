public class BMW implements Car{
    @Override
    public String getModel() {
        return "BMW";
    }

    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public String getCountry() {
        return "Germany";
    }

    @Override
    public String getEngine() {
        return "Electric";
    }

    @Override
    public String getDriveTrain() {
        return "Rear-wheel";
    }
}
