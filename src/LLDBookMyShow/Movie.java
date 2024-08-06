package LLDBookMyShow;

public class Movie {
    int movieId;
    String name;
    int movieDurationInMinutes;

    public int getMovieId() {
        return movieId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public String getMovieName() {
        return name;
    }
    public void setMovieName(String movieName) {
        this.name = movieName;
    }
    public int getMovieDurationInMinutes() {
        return movieDurationInMinutes;
    }
    public void setMovieDurationInMinutes(int movieDurationInMinutes) {
        this.movieDurationInMinutes = movieDurationInMinutes;
    }

}
