package DesignPatterns.CreationalDesignPatters.FactoryPattern.ShapeFactory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
