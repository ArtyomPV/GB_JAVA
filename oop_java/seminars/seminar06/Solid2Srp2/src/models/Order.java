package models;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public void saveToJson() {
        String fileName = "oop_java\\seminars\\seminar06\\Solid2Srp2\\src\\models\\order.json";
        System.out.println(fileName);

        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            fileWriter.write("{\n");
            fileWriter.write("\"clientName\":\"" + clientName + "\",\n");
            fileWriter.write("\"product\":\"" + product + "\",\n");
            fileWriter.write("\"quantity\":\"" + qnt + "\",\n");
            fileWriter.write("\"price\":\"" + price + "\"\n");
            fileWriter.write("}\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;
        }
    }
    public void inputFromConsole(){
        clientName = prompt("Client name: ");
        product = prompt("Product name: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
