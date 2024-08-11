package DesignPatterns.CreationalDesignPatters.AbstractFactoryPattern;

//This is Factory of Factory, gives u factory instance which will inturn give you required class object
public class AbstractFactoryProducer {

    public AbstractFactory getProfession(boolean isTrainee) {
        if(isTrainee)
        {
            return new TraineeProfessionAbstractFactory();
        }
        else {
           return new ProfessionAbstractFactory();
        }
    }
    
}
