package DesignPatterns.CreationalDesignPatters.AbstractFactoryPattern;

public class TraineeProfessionAbstractFactory extends AbstractFactory{
    public Profession getProfession(String typeOfProffesion){
        if(typeOfProffesion==null){
            return null;
        }
        else if(typeOfProffesion=="Engineer"){
            return new TraineeEngineer();
        }
        else if(typeOfProffesion=="Teacher"){
            return new TraineeTeacher();
        }
        return null;
    }
    
}
