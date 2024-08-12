package DesignPatterns.StructuralDesignPatterns.ProxyDesignPattern;

public class RealSubject implements Subject {

    @Override
    public void method() {
       System.out.println("Hii, I am an Actual Implementation of a real object, rest are proxies");
    }
    
}
