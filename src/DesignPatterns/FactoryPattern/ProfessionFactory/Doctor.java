package DesignPatterns.FactoryPattern.ProfessionFactory;

public class Doctor implements Profession{

    @Override
    public void print() {
        System.out.println("I am a Doctor");
    }
    
}
