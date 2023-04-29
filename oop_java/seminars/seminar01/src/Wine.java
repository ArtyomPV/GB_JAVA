public class Wine extends Product{
    private  final  String brand;

    public Wine(String name, int price, String brand) {
        super(name, price);
        this.brand = brand;

    }

    @Override
    public String toString() {
        return super.toString() + " " + this.brand;
    }
}
