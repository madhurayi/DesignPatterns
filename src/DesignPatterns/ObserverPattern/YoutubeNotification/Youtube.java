package DesignPatterns.ObserverPattern.YoutubeNotification;

public class Youtube {
    public static void main(String[] args) {
        Channel designPatters= new Channel("Madhu's Coading");
        Subscriber s1= new Subscriber("Madhu");
        Subscriber s2= new Subscriber("Priya");
        Subscriber s3= new Subscriber("Nikhi");
        designPatters.subscribe(s1);
        designPatters.subscribe(s2);
        designPatters.subscribe(s3);

        designPatters.unsubscribe(s3);

        s1.subscribeChannel(designPatters);
        s2.subscribeChannel(designPatters);
        s3.subscribeChannel(designPatters);

        designPatters.uploadVideo("Observer Design Pattern Video");
    }
}
