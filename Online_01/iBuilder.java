public class iBuilder {
        public Product product = new Product();
        void AddBase(){
            product.Add(new Bun());
            product.Add(new Bun());
            product.Add(new Patty());
        }
        void AddComponents(int N){
            if(N==1){
                product.Add(new Bun());
            }
            else if(N==2){
                product.Add( new Patty());
            }
            else if(N==3){
                product.Add( new Cheese());
            }
            else if(N==4){
                product.Add( new BBQ_Sauce());
            }
            else if(N==5){
                product.Add( new Salad());
            }
        }

        public Product getBurger(){
            return product;
        }
}
