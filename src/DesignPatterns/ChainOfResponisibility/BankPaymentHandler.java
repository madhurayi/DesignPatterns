package DesignPatterns.ChainOfResponisibility;

public class BankPaymentHandler extends PaymentHandler{

    @Override
    public void handlePayment(double amount) {
        if(amount <= 100){
            System.out.println("Paid amount using bank account: Rs. "+amount);
        }
        else{
            nextHandler.handlePayment(amount);
        }
    }
}
