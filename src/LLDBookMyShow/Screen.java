package LLDBookMyShow;

import java.util.List;

public class Screen {
    public int screenIid;
    List<Seat> seats;

   public int getScreenIid(){
       return screenIid;
   }
   public void setScreenIid(int screenIid){
       this.screenIid = screenIid;
   }
   public List<Seat> getSeats(){
       return seats;
   }
   public void setSeats(List<Seat> seats){
       this.seats = seats;
   }
}
