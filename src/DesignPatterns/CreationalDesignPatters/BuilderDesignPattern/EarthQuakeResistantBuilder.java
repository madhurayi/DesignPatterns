package DesignPatterns.CreationalDesignPatters.BuilderDesignPattern;

public class EarthQuakeResistantBuilder implements Builder {

    Home earthQuakeResistantBuilder= new Home();
    @Override
    public void buildWalls() {
        this.earthQuakeResistantBuilder.walls="Wooden Floor";
    }

    @Override
    public void buildFloor() {
        this.earthQuakeResistantBuilder.floors="Wooden FLoors";
    }

    @Override
    public void buildTerrace() {
        this.earthQuakeResistantBuilder.terrace="Wooden Terrace";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.earthQuakeResistantBuilder;
    }
    
}
