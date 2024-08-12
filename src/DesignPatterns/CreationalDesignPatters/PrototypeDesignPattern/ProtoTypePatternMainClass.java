package DesignPatterns.CreationalDesignPatters.PrototypeDesignPattern;

public class ProtoTypePatternMainClass {
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();

        Profession dProfession= ProfessionCache.getCloneNewProfession(1);
        System.out.println(dProfession);
        
        Profession engProfession= ProfessionCache.getCloneNewProfession(2);
        System.out.println(engProfession);

        Profession teachProfession= ProfessionCache.getCloneNewProfession(3);
        System.out.println(teachProfession);

    }
}
