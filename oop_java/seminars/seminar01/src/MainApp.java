public class MainApp {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.addProduct(new Product("Milk", 25))
                .addProduct(new Product("Water", 5))
                .addProduct(new Yougurt("Danone", 25, "sweet"))
                .addProduct(new Wine("WhiteRose", 55, "Russia"));

        for (int i = 0; i < vendingMachine.getProducts().size(); i++) {
            System.out.println(vendingMachine.getProducts().get(i));
        }

        Product found = vendingMachine.findProduct("Water");
        System.out.println(found);

        Product sold = vendingMachine.sellProduct(found);
        System.out.println(sold);
        System.out.println(vendingMachine.getAmount());

        for (int i = 0; i < vendingMachine.getProducts().size(); i++) {
            System.out.println(vendingMachine.getProducts().get(i));
        }

        Product wine = vendingMachine.sellProduct(vendingMachine.findProduct("WhiteRose"));
        System.out.println(wine);
        System.out.println(" Rest of goods");
        for (int i = 0; i < vendingMachine.getProducts().size(); i++) {
            System.out.println(vendingMachine.getProducts().get(i));
        }
        System.out.println("Money: ");
        System.out.println(vendingMachine.getAmount());
        try {
            Product wine1 = vendingMachine.sellProduct(vendingMachine.findProduct("WhiteRose"));
            System.out.println(wine1);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());

        }

    }
}