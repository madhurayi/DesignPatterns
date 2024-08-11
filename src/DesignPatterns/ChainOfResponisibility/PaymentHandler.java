package DesignPatterns.ChainOfResponisibility;

public abstract class PaymentHandler {
    protected PaymentHandler nextHandler;
    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void handlePayment(double amount);
}
