package DesignPatterns.StrategyPattern.WithStrategyPattern.StrategyPatternUsingPayments;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void payment() {
        System.out.println("Credit Card Payment Method");
    }
    
}
