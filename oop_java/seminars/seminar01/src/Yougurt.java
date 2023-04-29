public class Yougurt extends Product{

    private  final  String flavor;


    public Yougurt(String name, int price, String flavor) {
       super(name,price);
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.flavor;
    }
}
