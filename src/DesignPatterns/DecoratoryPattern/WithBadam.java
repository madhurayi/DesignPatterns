package DesignPatterns.DecoratoryPattern;

public class WithBadam extends CoffeeDecorator{

    WithBadam(Coffee coffee) {
        super(coffee);
    }
    public String getDescription() {
        return coffee.getDescription()+"with Badam";
    }

    public double cost(){
        return cost()+5.0;
    }
    
}
