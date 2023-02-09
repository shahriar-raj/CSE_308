import java.util.LinkedList;

public class Product {
    class pair{
        String part;
        int price;
        public pair(String a,int b){
            part = a;
            price = b;
        }
    }
    private double cost=0;
    private String name;
    private LinkedList<pair> parts;
    public Product(){
        parts = new LinkedList<pair>();
    }

    public void Add(String p, int pr){
        parts.addLast(new pair(p, pr));
    }

    public void Show(){
        System.out.println("PC Specs, Selected are below:");
        for(int i=0; i<parts.size(); i++){
            System.out.println( i+1 +". "+ parts.get(i).part+" : "+parts.get(i).price +" BDT");
            cost+=parts.get(i).price;
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Total Cost: "+String.format("%.0f", cost) +" BDT");
    }

    public double getCost() {
        return cost;
    }

    public String getName(){
        return name;
    }

    public void setName(String s1){
        name = s1;
    }
}
