package LLDBookMyShow;

import LLDBookMyShow.Enums.City;
import LLDBookMyShow.Enums.SeatCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {
    MovieController movieController;
    TheatreController theatreController;
    BookMyShow(){
        movieController= new MovieController();
        theatreController= new TheatreController();
    }

    public static void main(String[] args){
        BookMyShow bookMyShow= new BookMyShow();
        bookMyShow.initialize();
        System.out.println("Initialized");
        bookMyShow.createBooking(City.Bengaluru, "KALKI");


//        bookMyShow

    }
    private void createBooking(City city,String movieName){

        //Search moview by my location
        List<Movie> movies= movieController.getMoviesByCity(city);

        //Select the movie which you want to see
        Movie interestedMovie=null;
        for(Movie movie:movies){
            if(movie.getMovieName().equals(movieName)){
                interestedMovie=movie;
            }
        }

        //Get all shows of this movie in the use location
        Map<Theatre,List<Show>> showsTheaterWise= theatreController.getAllShow(interestedMovie,city);

        //Select the particular show use is interest in
        Map.Entry<Theatre,List<Show>> entry= showsTheaterWise.entrySet().iterator().next();
        List<Show> runningShows= entry.getValue();
        Show interestedShow= runningShows.get(0);

        //Select the seat
        int seatNumber=30;
        List<Integer> bookedSeats=interestedShow.getBookedSeatIds();
        if(!bookedSeats.contains(seatNumber)){
            bookedSeats.add(seatNumber);

            Booking booking= new Booking();
            List<Seat> myBookedSeats=new ArrayList<>();
            for(Seat screenSeat: interestedShow.getScreen().getSeats()){
                if(screenSeat.getSeatId()==seatNumber){
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setBookedSeats(myBookedSeats);
            booking.setShow(interestedShow);
        }else{
            System.out.println("Seat already booked, try again");
            return;
        }
        System.out.println("Booking Successful");

    }
    private void initialize(){
        createMovies();
        //Create Theatre with Screens, seats and shows
        createTheatre();
    }
    private void createTheatre(){
        Movie kalki= movieController.getMovieByName("KALKI");
        Theatre inoxTheatre= new Theatre();
        inoxTheatre.setTheatreID(1);
        inoxTheatre.setScreens(createScreen());
        inoxTheatre.setCity(City.Bengaluru);
        List<Show> inoxShows= new ArrayList<>();
        Show inoxMorningShow= createShow(1,inoxTheatre.getScreens().get(0),kalki,8);
        Show inoxEveningShow= createShow(2,inoxTheatre.getScreens().get(0),kalki,16);
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheatre.setShows(inoxShows);
//        System.out.println("hii "+inoxShows.g);
        theatreController.addTheatre(inoxTheatre,City.Bengaluru);
//        System.out.println(theatreController.getAllShow(kalki,City.Bengaluru));
    }
    private Show createShow(int showId, Screen screen, Movie movie,int showStarTime){
        Show show = new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setShowStartTime(showStarTime);
        return show;
    }
    private List<Screen> createScreen(){
        List<Screen> screens= new ArrayList<>();
        Screen screen1= new Screen();
        screen1.setScreenIid(1);
        screen1.setSeats(createSeats());
        screens.add(screen1);
        return screens;
    }
    private List<Seat> createSeats(){
        List<Seat> seats   =new ArrayList<>();

        //1 to 40 SILVER
        for(int i=0;i<40;i++){
            Seat seat= new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

        //41 to 70 GOLD
        for(int i=41;i<70;i++){
            Seat seat= new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        //41 to 70 PLATINUM
        for(int i=70;i<100;i++){
            Seat seat= new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }
        return seats;
    }
    private void createMovies(){
        //create Movies1
        Movie kalki= new Movie();
        kalki.setMovieId(1);
        kalki.setMovieName("KALKI");
        kalki.setMovieDurationInMinutes(180);

        //create Movies2
        Movie bahubali= new Movie();
        bahubali.setMovieId(2);
        bahubali.setMovieName("BAHUBALI");
        bahubali.setMovieDurationInMinutes(190);

        //Add Movies against the cities
        movieController.addMovie(kalki, City.Bengaluru);
        movieController.addMovie(kalki, City.Hyderabad);

        movieController.addMovie(bahubali, City.Bengaluru);
        movieController.addMovie(bahubali, City.Hyderabad);
        System.out.println(movieController.getMoviesByCity(City.Bengaluru).get(0).getMovieName());
    }
}
