import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemMain {
    public static void main(String[] args) {
        List<SoftwareCompany> softwareCompanies = new ArrayList<>();
        SoftwareCompany softwareCompany = new SoftwareCompany();
        ProjectManager projectManager = new ProjectManager();
        Developer developer = new Developer();

        // Demo software companies
//        SoftwareCompany softwareCompany1 = new SoftwareCompany("Optimizely");
//        SoftwareCompany softwareCompany2 = new SoftwareCompany("Fifty Two");
//        ProjectManager projectManager1 = new ProjectManager("Abid","EEE 101");
//        ProjectManager projectManager2 = new ProjectManager("Reaz","CSE 306");
//        ProjectManager projectManager3 = new ProjectManager("Sadif","CSE 305");
//        Developer developer1 = new Developer("Reyazul","CSE 306");
//        Developer developer2 = new Developer("Raj","CSE 306");
//        softwareCompany1.addProjectManager(projectManager3);
//        softwareCompany1.addProjectManager(projectManager2);
//        softwareCompany2.addProjectManager(projectManager1);
//        projectManager2.addDeveloper(developer1);
//        projectManager2.addDeveloper(developer2);
//        softwareCompanies.add(softwareCompany1);
//        softwareCompanies.add(softwareCompany2);

        int page = 0;
        while(true) {
            if(page==0) { //System Homepage
                System.out.println("\n!Welcome To The System!");
                System.out.println("To get into a company, enter the corresponding number shown beside the company name");
                System.out.println("Enter 0 to Add A New Company. Enter -1 to Remove A Company");
                int i = 1;
                for (SoftwareCompany s : softwareCompanies) {
                    System.out.println((i++) + "." + s.name);
                }
                System.out.print("Enter Option: ");
                Scanner scn = new Scanner(System.in);
                String c = scn.nextLine();
                int ci = Integer.parseInt(c);
                if(ci==0){
                    page = 1;
                }
                else if(ci==-1){
                    page = 2;
                }
                else if(ci>softwareCompanies.size()||ci<-1){
                    System.out.println("Invalid Input");
                }
                else{
                    softwareCompany = softwareCompanies.get(ci-1);
                    page = 3;
                }
            }

            else if(page == 1){// Adding Company to the system Page
                System.out.println("\nAdd A software Company to the list");
                System.out.print("Enter Name: ");
                Scanner scn = new Scanner(System.in);
                String newS = scn.nextLine();
                softwareCompanies.add(new SoftwareCompany(newS));
                System.out.println("New Company \""+newS+"\" Added!");
                page = 0;
            }

            else if(page==2){// Removing Companies from the System Page
                System.out.println("\nEnter 0 to go back");
                if(softwareCompanies.size()==0){
                    System.out.println("There is no software company in the list!");
                    Scanner scn = new Scanner(System.in);
                    String si = scn.nextLine();
                    if(si.equalsIgnoreCase("0")){
                        page = 0;
                    }
                }
                else {
                    System.out.println("Remove A Software Company from the list");
                    int i = 1;
                    for (SoftwareCompany s : softwareCompanies) {
                        System.out.println((i++) + "." + s.name);
                    }
                    System.out.print("Enter Option: ");
                    Scanner scn = new Scanner(System.in);
                    int ci = scn.nextInt();
                    if(ci==0){
                        page = 0;
                    }
                    else if(ci>softwareCompanies.size()||ci<1){
                        System.out.println("Invalid Input!");
                    }
                    else if(softwareCompanies.get(ci - 1).projectManagers.size()!=0){
                        System.out.println("You cannot remove the software company as there are existing projects under the company!");
                        System.out.println("1.Back\n2.Delete all projects under the company and then delete the company");
                        System.out.print("Enter Option: ");
                        Scanner scn1 = new Scanner(System.in);
                        String ri = scn1.nextLine();
                        if(ri.equalsIgnoreCase("1")){
                            page = 2;
                        }
                        else if(ri.equalsIgnoreCase("2")){
                            softwareCompanies.get(ci - 1).removeAllProjectManagers();
                            System.out.println(softwareCompanies.get(ci - 1).name + " removed from the system!");
                            softwareCompanies.remove(softwareCompanies.get(ci - 1));
                            page = 2;
                        }
                    }
                    else{
                        System.out.println(softwareCompanies.get(ci - 1).name + " removed from the system!");
                        softwareCompanies.remove(softwareCompanies.get(ci - 1));
                    }
                }
            }

            else if(page==3){ // Company Page
                System.out.println("\n1. Company Details");
                System.out.println("2. Company Hierarchy");
                System.out.println("3. Projects");
                System.out.println("4. Back");
                System.out.print("Enter Option: ");
                Scanner scn = new Scanner(System.in);
                int ci = scn.nextInt();
                switch (ci){
                    case 1: page = 4;
                            break;
                    case 2: page = 5;
                            break;
                    case 3: page = 6;
                            break;
                    case 4: page = 0;
                            break;
                    default:
                            System.out.println("Invalid Input");
                            break;
                }
            }
            else if(page == 4){//Company Details Page
                softwareCompany.details();
                System.out.println("\nEnter any key to go back");
                Scanner scn = new Scanner(System.in);
                String si = scn.nextLine();
                page = 3;
            }
            else if(page == 5){// Company Hierarchy page
                softwareCompany.hierarchy(0);
                System.out.println("\nEnter any key to go back");
                Scanner scn = new Scanner(System.in);
                String si = scn.nextLine();
                page = 3;
            }
            else if(page == 6){// Project list inside a company page
                System.out.println("\n!Welcome To "+softwareCompany.name+ "!");
                System.out.println("To get into a project, enter the corresponding number shown beside the project/project manager name");
                System.out.println("Enter 0 to Add A New Project. Enter -1 to Remove A Project. Enter -2 to Go Back");
                int i = 1;
                for (ProjectManager p : softwareCompany.projectManagers) {
                    System.out.println((i++) + "." + p.projectName +" (Manager: "+p.name+")");
                }
                System.out.print("Enter Option: ");
                Scanner scn = new Scanner(System.in);
                String c = scn.nextLine();
                int ci = Integer.parseInt(c);
                if(ci==0){
                    page = 7;
                }
                else if(ci==-1){
                    page = 8;
                }
                else if(ci==-2){
                    page = 3;
                }
                else if(ci>softwareCompany.projectManagers.size()||ci<-1){
                    System.out.println("Invalid Input!");
                }
                else{
                    projectManager = softwareCompany.projectManagers.get(ci-1);
                    page = 9;
                }
            }

            else if(page == 7){// Adding Project to the Company Page
                System.out.println("\nAdd A New Project and Project Manager to the list");
                System.out.print("Enter Project Name: ");
                Scanner scn = new Scanner(System.in);
                String newPn = scn.nextLine();
                System.out.print("Enter Project Manager Name: ");
                Scanner scn1 = new Scanner(System.in);
                String newP = scn1.nextLine();
                softwareCompany.addProjectManager(new ProjectManager(newP, newPn));
                System.out.println("New Manager \""+newP+"\" Added!");
                page = 6;
            }

            else if(page==8){// Removing Projects from the Company Page
                System.out.println("\nEnter 0 to go back");
                if(softwareCompanies.size()==0){
                    System.out.println("There is no Project in the list!");
                    System.out.print("Enter Option: ");
                    Scanner scn = new Scanner(System.in);
                    String si = scn.nextLine();
                    if(si.equalsIgnoreCase("0")){
                        page = 6;
                    }
                }
                else {
                    System.out.println("Remove A Project from the list");
                    int i = 1;
                    for (ProjectManager p : softwareCompany.projectManagers) {
                        System.out.println((i++) + "." + p.projectName+" (Manager: "+p.name+")");
                    }
                    System.out.print("Enter Option: ");
                    Scanner scn = new Scanner(System.in);
                    int ci = scn.nextInt();
                    if(ci==0){
                        page = 6;
                    }
                    else if(ci>softwareCompany.projectManagers.size()||ci<1){
                        System.out.println("Invalid Input!");
                    }
                    else if(softwareCompany.projectManagers.get(ci - 1).developers.size()!=0){
                        System.out.println("You cannot remove the project as there are existing developers under the project!");
                        System.out.println("1.Back\n2.Delete all developers under the project and then delete the project");
                        System.out.print("Enter Option: ");
                        Scanner scn1 = new Scanner(System.in);
                        String ri = scn1.nextLine();
                        if(ri.equalsIgnoreCase("1")){
                            page = 8;
                        }
                        else if(ri.equalsIgnoreCase("2")){
                            softwareCompany.projectManagers.get(ci - 1).removeAllDevelopers();
                            softwareCompany.removeProjectManager((ci - 1),true);
                            page = 8;
                        }
                    }
                    else{
                        softwareCompany.removeProjectManager((ci - 1),true);
                        page = 8;
                    }
                }
            }

            else if(page==9){ // Project Manager Page
                System.out.println("\n1. Manager Details");
                System.out.println("2. Manager Hierarchy");
                System.out.println("3. Developers");
                System.out.println("4. Back");
                System.out.print("Enter Option: ");
                Scanner scn = new Scanner(System.in);
                int ci = scn.nextInt();
                switch (ci){
                    case 1: page = 10;
                        break;
                    case 2: page = 11;
                        break;
                    case 3: page = 12;
                        break;
                    case 4: page = 6;
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            }

            else if(page == 10){// Project Details Page
                projectManager.details();
                System.out.println("\nEnter any key to go back");
                Scanner scn = new Scanner(System.in);
                String si = scn.nextLine();
                page = 9;
            }

            else if(page == 11){// Project Hierarchy page
                System.out.println("\nManager_Composite.hierarchy:\n");
                projectManager.hierarchy(0);
                System.out.println("\nEnter any key to go back");
                Scanner scn = new Scanner(System.in);
                String si = scn.nextLine();
                page = 9;
            }

            else if(page == 12){// Developers list inside a company page
                System.out.println("\n!Welcome To "+projectManager.projectName+" of "+softwareCompany.name);
                System.out.println("To get the details of a developer, enter the corresponding number shown beside the developer's name");
                System.out.println("Enter 0 to Add A New Developer. Enter -1 to Remove A Developer. Enter -2 to Go Back");
                int i = 1;
                for (Developer d : projectManager.developers) {
                    System.out.println((i++) + "." + d.name);
                }
                System.out.print("Enter Number: ");
                Scanner scn = new Scanner(System.in);
                String c = scn.nextLine();
                int ci = Integer.parseInt(c);
                if(ci==0){
                    page = 13;
                }
                else if(ci==-1){
                    page = 14;
                }
                else if(ci==-2){
                    page = 9;
                }
                else if(ci>projectManager.developers.size()||ci<-1){
                    System.out.println("Invalid Input!");
                }
                else{
                    developer = projectManager.developers.get(ci-1);
                    developer.details();
                    System.out.println("\nEnter any key to go back");
                    Scanner scn1 = new Scanner(System.in);
                    String si = scn1.nextLine();
                    page = 12;
                }
            }

            else if(page == 13){// Adding Developer to the Project Page
                System.out.println("Add A Developer to the list");
                System.out.print("Enter Name: ");
                Scanner scn = new Scanner(System.in);
                String newD = scn.nextLine();
                projectManager.addDeveloper(new Developer(newD, projectManager.projectName));
                System.out.println("New Developer \""+newD+"\" Added!");
                page = 12;
            }

            else if(page==14){// Removing Projects from the Company Page
                System.out.println("Enter 0 to go back");
                if(softwareCompanies.size()==0){
                    System.out.println("There is no Developer in the list!");
                    System.out.print("Enter Option: ");
                    Scanner scn = new Scanner(System.in);
                    String si = scn.nextLine();
                    if(si.equalsIgnoreCase("0")){
                        page = 12;
                    }
                }
                else {
                    System.out.println("Remove A Project from the list");
                    int i = 1;
                    for (Developer d : projectManager.developers) {
                        System.out.println((i++) + "." + d.name);
                    }
                    System.out.print("Enter Option: ");
                    Scanner scn = new Scanner(System.in);
                    int ci = scn.nextInt();
                    if(ci==0){
                        page = 12;
                    }
                    else if(ci>projectManager.developers.size()||ci<1){
                        System.out.println("Invalid Input!");
                    }
                    else{
                        projectManager.removeDeveloper(ci - 1);
                        page = 12;
                    }
                }
            }
        }
    }
}

