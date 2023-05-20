package lsp;

public class OrderBonus extends AbstractOrder{
    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    }

    @Override
    public int getAmount() {
        return qnt*price;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, цена с учетом скидки = %d",qnt, price );
    }
}
