package isp;

import isp.interfaces.PayCreditCard;
import isp.interfaces.PayPhoneNumber;
import isp.interfaces.PayWebMoney;
import isp.interfaces.Payable;

public class InternetPaymentService implements Payable, PayPhoneNumber {
    public InternetPaymentService() {
    }

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Pay by credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("Pay by phone number %d\n", amount);
    }




}
