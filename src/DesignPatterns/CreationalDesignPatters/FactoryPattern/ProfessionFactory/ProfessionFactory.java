package DesignPatterns.CreationalDesignPatters.FactoryPattern.ProfessionFactory;

public class ProfessionFactory {
    public Profession getProfession(String profession){
        if(profession.equals("Teacher")){
            return new Teacher();
        }
        else if(profession.equals("Engineer")){
            return new Engineer();
        }
        else if(profession.equals("Doctor")){
            return new Doctor();
        }
        return null;
    } 
}
