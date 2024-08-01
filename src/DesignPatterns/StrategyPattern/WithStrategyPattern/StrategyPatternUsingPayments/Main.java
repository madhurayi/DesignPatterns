package DesignPatterns.StrategyPattern.WithStrategyPattern.StrategyPatternUsingPayments;

public class Main {
    public static void main(String[] args) {
        
        PaymentService obj1= new PaymentService(new CreditCardPaymentStrategy());
        obj1.payment(100);
    }
    
}
