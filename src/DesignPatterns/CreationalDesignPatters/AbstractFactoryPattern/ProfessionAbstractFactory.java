package DesignPatterns.CreationalDesignPatters.AbstractFactoryPattern;

public class ProfessionAbstractFactory extends AbstractFactory{
    public Profession getProfession(String typeOfProffesion){
        if(typeOfProffesion==null){
            return null;
        }
        else if(typeOfProffesion=="Engineer"){
            return new Engineer();
        }
        else if(typeOfProffesion=="Teacher"){
            return new Teacher();
        }
        return null;
    }
}
