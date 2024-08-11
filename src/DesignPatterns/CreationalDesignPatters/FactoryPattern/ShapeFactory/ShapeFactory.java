package DesignPatterns.CreationalDesignPatters.FactoryPattern.ShapeFactory;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType.equals("Circle"))
            return new Circle();
        else if(shapeType=="Rectangle")
            return new Rectangle();
        else
            return null;
    }
}
