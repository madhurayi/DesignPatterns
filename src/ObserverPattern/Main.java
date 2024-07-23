package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable=new IphoneObservableImpl();

        NotificationAlertObserver observer1= new EmailAlertObserverImpl("xyz@gamil.com",iphoneStockObservable);
        NotificationAlertObserver observer2= new EmailAlertObserverImpl("abc@gamil.com",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.setStockCount(0);

    }
}
