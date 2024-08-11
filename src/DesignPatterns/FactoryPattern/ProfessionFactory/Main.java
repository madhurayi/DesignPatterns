package DesignPatterns.FactoryPattern.ProfessionFactory;

public class Main {
    public static void main(String[] args) {
        ProfessionFactory pFactory= new ProfessionFactory();
        Profession p= pFactory.getProfession("Doctor");
        p.print();
    }
}
