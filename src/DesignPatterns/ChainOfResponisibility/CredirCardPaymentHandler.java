package DesignPatterns.ChainOfResponisibility;

public class CredirCardPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if(amount <= 1500){
            System.out.println("Paid amount using Credit Card: Rs. "+amount);
        }
        else{
            nextHandler.handlePayment(amount);
        }
    }
}
