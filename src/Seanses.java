import java.awt.*;
import java.util.ArrayList;

/**
 * Created by IIS on 10.09.2015.
 */
public class Seanses {
    private String film;
    private String TimeSeanses;
    private int Hall;
    int count = 0;
    ArrayList<Point> reserv = new ArrayList<Point>();

    public Seanses(String film, String TimeSeanses, int hall) {
        this.film = film;
        this.TimeSeanses = TimeSeanses;
        this.Hall = hall;
    }


////    void add (Point newpoint) {
////        reserv[count] = newpoint;
////        count++;
//    }
    public String getfilm() {
        return film;
    }

    public String getTimeSeanses() {
        return TimeSeanses;
    }

    public int getHall() {
        return Hall;
    }

    @Override
    public String toString() {
        return "name = " + film + ", phone = " + TimeSeanses + ",mail = " + Hall;
    }


//    boolean[][] reserv;
//    reserv = new boolean[seats.length][];

}
