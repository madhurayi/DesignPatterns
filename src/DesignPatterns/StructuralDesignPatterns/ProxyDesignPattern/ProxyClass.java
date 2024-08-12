package DesignPatterns.StructuralDesignPatterns.ProxyDesignPattern;

public class ProxyClass extends RealSubject {
    public void method(){
        System.out.println("hii am proxy, I will perform security checks");

        //logic to check if user is authenticated or not . I f yes then call real object

        System.out.println("Calling real method of real subject implementing after class is authenticated");
        super.method();
    }
}
