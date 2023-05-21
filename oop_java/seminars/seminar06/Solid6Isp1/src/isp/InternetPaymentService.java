package isp;

public class InternetPaymentService implements Payable{
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
