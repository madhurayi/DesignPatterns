package DesignBookMyShow;

import DesignBookMyShow.Enums.City;

import java.util.List;

public class Theatre {
    int theatreID;
    String address;
    List<Screen> screens;
    List<Show> shows;
    City city;
    public int getTheatreID() {
        return theatreID;
    }
    public void setTheatreID(int theatreID) {
        this.theatreID = theatreID;

    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<Screen> getScreens() {
        return screens;
    }
    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }
    public List<Show> getShows(){
        return shows;
    }
    public  City getCity(){
        return city;
    }
    public void setCity(City city){
        this.city = city;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
