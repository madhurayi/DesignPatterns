package DesignPatterns.DecoratoryPattern;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee= new SimpleCoffee();
        CoffeeDecorator dec=new WithBadam(new WithMilk(coffee));
        System.out.println(dec.getDescription());
    }
}
