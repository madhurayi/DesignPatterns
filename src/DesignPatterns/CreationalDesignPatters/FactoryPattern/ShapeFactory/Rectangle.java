package DesignPatterns.CreationalDesignPatters.FactoryPattern.ShapeFactory;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
