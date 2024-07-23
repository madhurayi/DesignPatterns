package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

import java.util.Observer;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StockObservable observable;
    public MobileAlertObserverImpl(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName,"product is in stock hurry up!");
    }
    private void sendMsgOnMobile(String userName,String msg){
        System.out.println("mail sent to " + userName);
        // send the actual email to the end user
    }
}
