package models;

import java.util.Scanner;

public class InputFromConsole implements InputFrom{
    @Override
    public Order input() {
            String clientName = prompt("Client name: ");
            String product = prompt("Product name: ");
            int qnt = Integer.parseInt(prompt("Quantity: "));
            int price = Integer.parseInt(prompt("Price: "));
        return new Order(clientName, product, qnt, price);
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
