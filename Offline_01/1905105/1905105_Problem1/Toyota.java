public class Toyota implements Car{
    @Override
    public String getModel() {
        return "Toyota";
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getCountry() {
        return "Japan";
    }

    @Override
    public String getEngine() {
        return "Hydrogen fuel cells";
    }

    @Override
    public String getDriveTrain() {
        return "Rear-wheel";
    }

}
