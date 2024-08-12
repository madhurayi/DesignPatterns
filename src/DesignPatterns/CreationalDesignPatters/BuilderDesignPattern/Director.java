package DesignPatterns.CreationalDesignPatters.BuilderDesignPattern;

public class Director {
    Builder builder;
    Director(Builder builder){
        this.builder=builder;
    }

    public Home getComplexObjectHome(){
        return this.builder.getComplexHomeObject();
    }

    public void manageRequiredHomeConstruction(){
        this.builder.buildFloor();
        this.builder.buildTerrace();
        this.builder.buildWalls();
    }
}
