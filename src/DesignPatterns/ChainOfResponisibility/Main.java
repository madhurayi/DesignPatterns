package DesignPatterns.ChainOfResponisibility;

public class Main {
    public static void main(String[] args) {
        PaymentHandler bank= new BankPaymentHandler();
        PaymentHandler credit= new CredirCardPaymentHandler();
        PaymentHandler paypal= new PayPalPaymentHandler();

        bank.setNextHandler(credit);
        credit.setNextHandler(paypal);

        bank.handlePayment(600);
        bank.handlePayment(500);
        bank.handlePayment(1200);
        bank.handlePayment(1600);

    }
}
