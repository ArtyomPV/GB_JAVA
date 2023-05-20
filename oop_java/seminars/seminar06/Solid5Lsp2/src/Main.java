import lsp.AbstractOrder;
import lsp.FactoryOrder;
import lsp.Order;

public class Main {
    public static void main(String[] args) {
        FactoryOrder creator = new FactoryOrder();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(3, 2, false));
        calculator.add(creator.create(1, 3, true));

        for(AbstractOrder order: calculator){
            System.out.println(order);
        }

        System.out.printf("Сумма заказа %d", calculator.calcAmount());
    }
}