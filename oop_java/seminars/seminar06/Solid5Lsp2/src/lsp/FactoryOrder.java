package lsp;

public class FactoryOrder {
    public AbstractOrder create(int qnt, int price, boolean isBonus){
        if(isBonus){
            return new OrderBonus(qnt, price);
        }
        return new Order(qnt, price);
    }
}
