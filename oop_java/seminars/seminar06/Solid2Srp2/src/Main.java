import models.InputFrom;
import models.InputFromConsole;
import models.Order;
import models.SaverToJson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input order ");
        InputFrom inputFrom = new InputFromConsole();

        Order order = inputFrom.input();
        SaverToJson saver = new SaverToJson(order);

        saver.save();
    }
}