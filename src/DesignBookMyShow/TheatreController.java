package DesignBookMyShow;

import DesignBookMyShow.Enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheatre;
    List<Theatre> allTheatre;
    public TheatreController() {
        cityVsTheatre = new HashMap<>();
        allTheatre = new ArrayList<>();
    }
    void addTheatre(Theatre theatre,City city) {
        allTheatre.add(theatre);
        List<Theatre> theatres= cityVsTheatre.getOrDefault(city,new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatre.put(city,theatres);
        System.out.println(theatre.getShows().get(0));
    }
    Map<Theatre,List<Show>> getAllShow(Movie movie, City city){
        Map<Theatre,List<Show>> theatrVsShows= new HashMap<>();
        List<Theatre> theatres= cityVsTheatre.get(city);
        for( Theatre theatre: theatres ){
            List<Show> givenMovieShows= new ArrayList<>();
            List<Show> shows= theatre.getShows();
            for(Show show: shows){
                if(show.getMovie().getMovieId()==movie.getMovieId()){
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()){
                theatrVsShows.put(theatre,givenMovieShows);
            }
        }
        return theatrVsShows;
    }
}
