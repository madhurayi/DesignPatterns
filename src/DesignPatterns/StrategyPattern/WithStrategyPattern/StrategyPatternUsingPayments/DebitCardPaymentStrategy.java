package DesignPatterns.StrategyPattern.WithStrategyPattern.StrategyPatternUsingPayments;

public class DebitCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void payment() {
       System.out.println("DebitCard Payment Strategy");
    }
    
}
