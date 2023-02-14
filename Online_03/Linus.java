public class Linus implements OS{
    String name = "Linus";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void store() {
        System.out.println("Storing in Linus store module");
    }

    @Override
    public void communicate() {
        System.out.println("Communicating with Linus communication module");
    }

    @Override
    public void interact() {
        System.out.println("Interacting with Linus interact module");
    }
}
