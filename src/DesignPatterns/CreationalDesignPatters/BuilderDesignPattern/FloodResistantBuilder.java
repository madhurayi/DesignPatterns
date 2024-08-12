package DesignPatterns.CreationalDesignPatters.BuilderDesignPattern;

public class FloodResistantBuilder implements Builder{

    Home floodResistantBuilder= new Home();
    @Override
    public void buildWalls() {
        this.floodResistantBuilder.walls="Water Resistant Walls";
    }

    @Override
    public void buildFloor() {
        this.floodResistantBuilder.floors="Water Resistant Floors";
    }

    @Override
    public void buildTerrace() {
        this.floodResistantBuilder.terrace="Water Resistant Terrace";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.floodResistantBuilder;
    }
    
}
