package DesignPatterns.ObserverPattern.YoutubeNotification;

import java.util.List;

public class Subscriber {
    private String name;
    List<Channel> channel;
    public Subscriber(String name) {
        super();
        this.name = name;
    }
    public void update(String title){
        System.out.println("Hey "+name+", video uploaded "+title);
    }
    public void subscribeChannel(Channel ch){
        channel.add(ch);
    }

}