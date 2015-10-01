import java.awt.*;
import java.util.ArrayList;

/**
 * Created by IIS on 10.09.2015.
 */
public class Seanses {

    private int id;
    private String name;
    private String time;
    private int hallNumber;


    public Seanses(int id, String name, String time, int hallNumber) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.hallNumber = hallNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    @Override
    public String toString() {
        return id + ". " + name + ", " + time + ", в зале" + hallNumber;
    }

}
//    private String film;
//    private String TimeSeanses;
//    private int Hall;
//    int count = 0;
//    ArrayList<Point> reserv = new ArrayList<Point>();
//
//    public Seanses(String film, String TimeSeanses, int hall) {
//        this.film = film;
//        this.TimeSeanses = TimeSeanses;
//        this.Hall = hall;
//    }
//
//
//////    void add (Point newpoint) {
//////        reserv[count] = newpoint;
//////        count++;
////    }
//    public String getfilm() {
//        return film;
//    }
//
//    public String getTimeSeanses() {
//        return TimeSeanses;
//    }
//
//    public int getHall() {
//        return Hall;
//    }
//
//    @Override
//    public String toString() {
//        return "name = " + film + ", phone = " + TimeSeanses + ",mail = " + Hall;
//    }
//

//    boolean[][] reserv;
//    reserv = new boolean[seats.length][];


