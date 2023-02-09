public class Tesla implements Car{
    @Override
    public String getModel() {
        return "Tesla";
    }

    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public String getCountry() {
        return "US";
    }

    @Override
    public String getEngine() {
        return "Electric";
    }

    @Override
    public String getDriveTrain() {
        return "All wheel";
    }
}
