public class Director {
    iBuilder myBuilder;
    public void Construct(iBuilder builder){
        myBuilder = builder;
        myBuilder.AddBase();
        myBuilder.BuildBase();
    }

    public void AddRam(iBuilder builder,int N){
        myBuilder = builder;
        myBuilder.AddRam(N);
    }

    public void AddGraphics(iBuilder builder,int N){
        myBuilder = builder;
        myBuilder.AddGraphicsCard(N);
    }
}
