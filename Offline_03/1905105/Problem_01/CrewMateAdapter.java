public class CrewMateAdapter implements GoodPeople{
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_WHITE = "\u001B[37m";
    Imposter imposter = new Imposter();
    @Override
    public void ClearAsteroids() {
        System.out.println(ANSI_WHITE+"Clearing the Asteroids from the path of Spaceship.");
        System.out.print(ANSI_RED + "("); imposter.Kill(); System.out.println(ANSI_RED+ ")");
    }

    @Override
    public void FixWire() {
        System.out.println(ANSI_WHITE+"Fixing the Electricity Wires.");
        System.out.print(ANSI_RED + "("); imposter.Sabotage(); System.out.println(ANSI_RED+ ")");
    }

    @Override
    public void CleanVent() {
        System.out.println(ANSI_WHITE+"Cleaning the Vent.");
        System.out.print(ANSI_RED + "("); imposter.EscapeVent(); System.out.println(ANSI_RED+ ")");
    }
}
