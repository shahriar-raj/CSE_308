public class CarFactory {
    public Car getCar(String Continent){
        if(Continent == null){
            return null;
        }
        else if(Continent.equalsIgnoreCase("Asia")){
            return new Toyota();
        }
        else if(Continent.equalsIgnoreCase("Europe")){
            return new BMW();
        }
        else if(Continent.equalsIgnoreCase("United States")){
            return new Tesla();
        }
        return null;
    }
}
