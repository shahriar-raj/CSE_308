public abstract class Orange {
    OS os;
    public void set(String osName){
        if(osName.equalsIgnoreCase("Windoors")){
            os = new Windoors();
        }
        else{
            os = new Linus();
        }
    }
    public void store(){
        os.store();
    }
    public void communicate(){
        os.communicate();
    }
    public void interact(){
        os.interact();
    }
    public void switch_(){
        if(os.getName().equalsIgnoreCase("Windoors")){
            os = new Linus();
        }
        else {
            os = new Windoors();
        }
    }
}
