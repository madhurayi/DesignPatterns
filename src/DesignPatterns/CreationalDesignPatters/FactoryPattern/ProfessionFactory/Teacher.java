package DesignPatterns.CreationalDesignPatters.FactoryPattern.ProfessionFactory;

public class Teacher implements Profession{

    @Override
    public void print() {
        System.out.println("I am Teacher");
    }
    
}
