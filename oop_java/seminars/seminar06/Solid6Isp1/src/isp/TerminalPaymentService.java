package isp;
import isp.interfaces.PayCreditCard;
import isp.interfaces.PayWebMoney;
import isp.interfaces.Payable;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
public class TerminalPaymentService implements Payable {
    public TerminalPaymentService() {
    }

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Pay by credit card %d\n", amount);
    }


}
