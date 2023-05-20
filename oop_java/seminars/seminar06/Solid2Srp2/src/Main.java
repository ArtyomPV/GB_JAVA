import models.Order;
import models.SaverToJson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input order ");
        Order order = new Order("", "", 0, 0);
        SaverToJson saver = new SaverToJson(order);

        order.inputFromConsole();
        saver.save();
    }
}