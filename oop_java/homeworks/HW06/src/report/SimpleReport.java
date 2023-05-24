package report;

public class SimpleReport extends Report{

    @Override
    public void report(String text) {
        System.out.println("Report for user: " + text);
    }
}
