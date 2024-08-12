package DesignPatterns.CreationalDesignPatters.BuilderDesignPattern;

public interface Builder {
    void buildWalls();
    void buildFloor();
    void buildTerrace();

    Home getComplexHomeObject();
}
