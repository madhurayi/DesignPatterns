package DesignPatterns.DecoratoryPattern;

public class WithMilk extends CoffeeDecorator {


    WithMilk(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription()+"with milk";
    }

    public double cost(){
        return cost()+5.0;
    }
    
}
