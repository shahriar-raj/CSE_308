public class CrewMate implements GoodPeople{
    final String ANSI_WHITE = "\u001B[37m";
    @Override
    public void ClearAsteroids() {
        System.out.println(ANSI_WHITE+"Clearing the Asteroids from the path of Spaceship.");
    }

    @Override
    public void FixWire() {
        System.out.println(ANSI_WHITE+"Fixing the Electricity Wires.");
    }

    @Override
    public void CleanVent() {
        System.out.println(ANSI_WHITE+"Cleaning the Vent.");
    }
}
