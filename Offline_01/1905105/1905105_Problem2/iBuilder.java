public abstract class iBuilder {
    public Product product = new Product();
    abstract void BuildBase();
    void AddBase(){
        product.Add("CPU, motherboard, 1 TB HDD",70000);
    }
    void AddRam(int N){
        if(N==1){
            product.Add( "8 GB DDR4 RAM - 2666 MHz", 2620);
        }
        else if(N==2){
            product.Add( "8 GB DDR4 RAM - 3200 MHz", 2950);
        }
    }
    void AddGraphicsCard(int N){
        if(N==3){
            product.Add( "2GB Graphics Card", 6500);
        }
        else if(N==4){
            product.Add( "4GB Graphics Card", 7600);
        }
    }

    public Product getPC(){
        return product;
    }
}
