public class Director {
    iBuilder myBuilder;
    public void Construct(iBuilder builder){
        myBuilder = builder;
        myBuilder.AddBase();
    }

    public void AddComponents(iBuilder builder,int N){
        myBuilder = builder;
        myBuilder.AddComponents(N);
    }
}
