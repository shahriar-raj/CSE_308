import java.util.ArrayList;
import java.util.List;

public class SoftwareCompany implements Entity{
    String name;
    List<ProjectManager> projectManagers = new ArrayList<>();
    public SoftwareCompany(){

    }

    public SoftwareCompany(String name){
        this.name = name;
    }

    @Override
    public void details() {
        System.out.println("Company_Component.details:\n");
        System.out.println("Name: "+this.name);
        System.out.println("Number of Projects/ Project Managers: "+projectManagers.size());
    }

    @Override
    public void hierarchy(int a){
        System.out.println("\nCompany_Composite.hierarchy:\n");
        System.out.println("- "+this.name);
        for(ProjectManager p:projectManagers){
            System.out.print("\t");
            p.hierarchy(1);
        }
    }

    public void addProjectManager(ProjectManager projectManager){
        projectManagers.add(projectManager);
    }

    public void removeProjectManager(int index,boolean y){
        if(!y) {
            projectManagers.get(index).removeAllDevelopers();
            System.out.println(projectManagers.get(index).name+" removed from " + name);
            projectManagers.remove(projectManagers.get(index));
        }
        else{
            System.out.println(projectManagers.get(index).name+" removed from " + name);
            projectManagers.remove(projectManagers.get(index));
        }
    }

    public  void removeAllProjectManagers(){
        for(int i=0;i<projectManagers.size();i++){
            removeProjectManager(i,false);
        }
    }
}
