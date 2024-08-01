package DesignPatterns.ObserverPattern.YoutubeNotification;

import java.util.ArrayList;
import java.util.List;

public class Channel {
     String channelName;
    public String title;
    List<Subscriber> subscribers=new ArrayList<>();
    public Channel(){

    }
    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    public void notifySubscriber(String title){
        for(Subscriber subscriber : subscribers){
            subscriber.update(title);
        }
    }
    public void uploadVideo(String title){
        this.title = title;
        notifySubscriber(title);
    }
}
