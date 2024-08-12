package DesignPatterns.CreationalDesignPatters.BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        EarthQuakeResistantBuilder earthQuakeResistantBuilder= new EarthQuakeResistantBuilder();
        Director dir= new Director(earthQuakeResistantBuilder);
        dir.manageRequiredHomeConstruction();
        Home homeConstructionAtEnd= dir.getComplexObjectHome();
        System.out.println(homeConstructionAtEnd);
        System.out.println(homeConstructionAtEnd.floors);

    }
}
