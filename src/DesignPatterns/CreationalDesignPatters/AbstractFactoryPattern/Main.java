package DesignPatterns.CreationalDesignPatters.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        //First Get Factory instance from factory of factory class, if u want trainees.
        AbstractFactoryProducer abs= new AbstractFactoryProducer();
        AbstractFactory fact=abs.getProfession(true);
        Profession p= fact.getProfession("Engineer");
        p.print();
    }
}
