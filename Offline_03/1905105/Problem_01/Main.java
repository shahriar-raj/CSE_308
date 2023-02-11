public class Main {
    public static void main(String[] args) {
        CrewMate crewMate= new CrewMate();
        CrewMateAdapter imposter = new CrewMateAdapter();
        System.out.println("\nThe CrewMate is");
        crewMate.FixWire();
        crewMate.CleanVent();
        crewMate.ClearAsteroids();
        System.out.println("\u001b[0m"+"\nThe Imposter is");
        imposter.FixWire();
        imposter.CleanVent();
        imposter.ClearAsteroids();
    }
}
