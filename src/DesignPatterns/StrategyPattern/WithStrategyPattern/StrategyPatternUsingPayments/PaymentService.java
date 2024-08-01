package DesignPatterns.StrategyPattern.WithStrategyPattern.StrategyPatternUsingPayments;

public class PaymentService {
    PaymentStrategy paymentStrategy;
    PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void payment(double amount){
            paymentStrategy.payment();
    }

}
