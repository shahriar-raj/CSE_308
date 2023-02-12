public class Developer implements Entity{
    String name, projectName, Role="Developer";

    public Developer(){

    }

    public Developer(String name, String projectName){
        this.name = name;
        this.projectName = projectName;
    }

    @Override
    public void details() {
        System.out.println("Developer_Component.details:\n");
        System.out.println("Name: "+this.name);
        System.out.println("Role: "+this.Role);
        System.out.println("Current Project: "+projectName);
    }

    @Override
    public void hierarchy(int a) {
        System.out.println("- "+this.name);
    }

}
