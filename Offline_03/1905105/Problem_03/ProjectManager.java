import java.util.ArrayList;
import java.util.List;

public class ProjectManager implements Entity{
    String name, projectName, Role="Project Manager";
    List<Developer> developers = new ArrayList<>();

    public ProjectManager(){

    }

    public ProjectManager(String name, String projectName){
        this.name = name;
        this.projectName = projectName;
    }

    @Override
    public void details() {
        System.out.println("Manager_Component.details:\n");
        System.out.println("Name: "+this.name);
        System.out.println("Role: "+this.Role);
        System.out.println("Current Project: "+projectName);
        System.out.println("Number of Supervisees: "+developers.size());
    }

    @Override
    public void hierarchy(int a){
        System.out.println("- "+this.name+" ("+this.projectName+")");
        for(Developer d:developers){
            if(a==1){
                System.out.print("\t");
            }
            System.out.print("\t");
            d.hierarchy(0);
        }
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void removeDeveloper(int index)
    {
            System.out.println(developers.get(index).name+" removed from "+projectName);
            developers.remove(developers.get(index));
    }

    public  void removeAllDevelopers(){
        for(int i=0;i<developers.size();i++){
            removeDeveloper(i);
        }
    }
}
