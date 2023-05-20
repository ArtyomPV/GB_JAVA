package models;

import java.io.FileWriter;
import java.io.IOException;

public class SaverToJson implements SaveAs{
    Order order;
    public SaverToJson(Order order) {
        this.order = order;
    }

    @Override
    public void save() {
        String fileName = "oop_java\\seminars\\seminar06\\Solid2Srp2\\src\\models\\order.json";
        System.out.println(fileName);

        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            fileWriter.write("{\n");
            fileWriter.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            fileWriter.write("\"product\":\"" + order.getProduct() + "\",\n");
            fileWriter.write("\"quantity\":\"" + order.getQnt() + "\",\n");
            fileWriter.write("\"price\":\"" + order.getPrice() + "\"\n");
            fileWriter.write("}\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;
        }
    }
}
