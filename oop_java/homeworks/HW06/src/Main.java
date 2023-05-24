import Interfaces.Reportable;
import personal.model.Persister;
import personal.model.User;
import report.Report;
import report.SimpleReport;
import saver.Saver;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Report report = new SimpleReport();
        Persister persister = new Persister(user);
        Saver saver = new Saver(persister);

        report.report(user.getName());
        saver.save();

    }
}