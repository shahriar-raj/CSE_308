public class Main {
    public static void main(String[] args) {
        SmartPhones sm1 = new SmartPhones("Windoors");
        NoteBook n1 = new NoteBook("Linus");
        sm1.store();
        n1.communicate();
        n1.switch_();
        n1.interact();
    }
}
