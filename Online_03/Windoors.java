public class Windoors implements OS{
    String name = "Windoors";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void store() {
        System.out.println("Storing in windoors store module");
    }

    @Override
    public void communicate() {
        System.out.println("Communicating with windoors communication module");
    }

    @Override
    public void interact() {
        System.out.println("Interacting with windoors interact module");
    }
}
