import dip.Report;

import java.nio.channels.ReadPendingException;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        report.output();
    }
}