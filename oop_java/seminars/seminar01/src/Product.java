public class Product {

    private final String name;
    private int price;


    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

        @Override
    public String toString() {
            return String.format("%s, %d", this.name, this.price);


    }
}
//public class Product {
//    public String getName() {
//        return name;
//    }
//
//    public Integer getCost() {
//        return cost;
//    }
//
//    private String name;
//
//    public void setCost(Integer cost) {
//        this.cost = cost;
//    }
//
//    private Integer cost;
//
//
//    public Product(String name, Integer cost) {
//        this.name = name;
//        this.cost = cost;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s, %d",name, cost);
//
//    }
//}