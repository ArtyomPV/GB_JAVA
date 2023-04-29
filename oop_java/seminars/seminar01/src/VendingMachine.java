import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    List<Product> products = new ArrayList<>();

    public int getAmount() {
        return amount;
    }

    private int amount = 0;

    public VendingMachine addProduct(Product product){
        products.add(product);
        return this;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product findProduct(String string){
        for (int i = 0; i < getProducts().size(); i++) {
            if(getProducts().get(i).getName().equals(string)){
                return getProducts().get(i);
            }
        }
        return  null;
    }

    public Product sellProduct(Product product){
        try {
            Product prodFound = findProduct(product.getName());
            getProducts().remove(prodFound);
            amount += prodFound.getPrice();

            return prodFound;
        } catch(Exception e) {
            throw new RuntimeException("Товар не найден!");
        }

    }
}

//    public Product sellProduct(Product product){
//        try{
//            Product prodFound = findProduct(product.getName());
//            getList().remove(prodFound);
//            amount += prodFound.getCost();
//            return prodFound;
//
//        } catch(Exception ex) {
//            throw new RuntimeException("Product not found");
//
//        }
//
//
//    }
