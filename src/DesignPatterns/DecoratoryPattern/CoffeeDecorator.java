package DesignPatterns.DecoratoryPattern;

public class CoffeeDecorator implements Coffee{
    Coffee coffee;
    CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;
    }
    @Override
    public String getDescription() {
       return this.coffee.getDescription();
    }

    @Override
    public double cost() {
        return this.coffee.cost();
    }
    
}
