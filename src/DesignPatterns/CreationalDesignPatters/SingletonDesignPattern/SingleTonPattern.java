package DesignPatterns.CreationalDesignPatters.SingletonDesignPattern;

public class SingleTonPattern {
    private static SingleTonPattern singleTonPattern= new SingleTonPattern();
    private SingleTonPattern(){

    }

    //Get the only object available
    public static SingleTonPattern getInstance(){
        return singleTonPattern;
    }
    public void simpleMethod(){
        System.out.println("Hash code of the Instance "+singleTonPattern);
    }
}
