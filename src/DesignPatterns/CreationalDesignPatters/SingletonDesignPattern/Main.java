package DesignPatterns.CreationalDesignPatters.SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        SingleTonPattern s1= SingleTonPattern.getInstance();
        s1.simpleMethod();

        SingleTonPattern s2= SingleTonPattern.getInstance();
        s2.simpleMethod();


    }
}
