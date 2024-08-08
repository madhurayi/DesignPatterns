package DesignPatterns.ChainOfResponisibility;

public class PayPalPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if(amount <= 2000){
            System.out.println("Paid amount using PayPal: Rs. "+amount);
        }
        else{
            nextHandler.handlePayment(amount);
        }
    }
}
