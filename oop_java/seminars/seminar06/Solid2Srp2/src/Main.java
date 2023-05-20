import models.Order;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input order ");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        order.saveToJson();
    }
}