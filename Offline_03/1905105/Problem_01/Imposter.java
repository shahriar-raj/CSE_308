public class Imposter implements BadPeople{
    final String ANSI_RED = "\u001B[31m";
    @Override
    public void Kill() {
        System.out.print(ANSI_RED+"Killing CrewMates.");
    }

    @Override
    public void Sabotage() {
        System.out.print(ANSI_RED+"Sabotaging system.");
    }

    @Override
    public void EscapeVent() {
        System.out.print(ANSI_RED+"Escaping through vents.");
    }
}
