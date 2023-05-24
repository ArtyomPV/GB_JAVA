package dip;

import java.util.ArrayList;
import java.util.List;

public class Report {
    List<ReportItem> items;
    public void calculate(){
        items = new ArrayList<>();
        items.add(new ReportItem("First", (float)10));
        items.add(new ReportItem("Second", (float)5));
    }
    public void output(){
        PrintReport printReport = new PrintReport();
        printReport.output(items);
    }
}
