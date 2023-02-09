
import java.util.LinkedList;

public class Product {

    int cost =0;
    private LinkedList<Components> c;
    public Product(){
        c = new LinkedList<>();
    }

    public void Add(Components a){
        c.addLast(new Components());
    }

    public void Show(){
        System.out.println("YOur Order:");
        for(int i=0; i<c.size(); i++){
            System.out.println( i+1 +". "+ c.get(i).getName()+" : "+c.get(i).getPrice() +" BDT");
            cost+=c.get(i).price;
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Total Cost: "+String.format("%.0f", cost) +" BDT");
    }
}

