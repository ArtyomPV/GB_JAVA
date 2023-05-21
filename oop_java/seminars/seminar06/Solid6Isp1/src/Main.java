import isp.InternetPaymentService;
import isp.TerminalPaymentService;

public class Main {
    public static void main(String[] args) {
        InternetPaymentService internetPaymentService = new InternetPaymentService();
        internetPaymentService.payPhoneNumber(10);
        internetPaymentService.payCreditCard(10);
        internetPaymentService.payWebMoney(10);
        TerminalPaymentService terminalPaymentService = new TerminalPaymentService();
        terminalPaymentService.payPhoneNumber(15);
        terminalPaymentService.payCreditCard(15);
        terminalPaymentService.payWebMoney(15);
    }
}