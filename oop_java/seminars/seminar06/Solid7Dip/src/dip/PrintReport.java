package dip;

import java.util.List;

public class PrintReport {
public void output(List<ReportItem> items){
    System.out.println("Outprint to print: ");
    for(ReportItem item: items){
        System.out.printf("Report %s - %f", item.getDescription(), item.getAmount());
    }
}
}
