import java.awt.*;
import java.util.ArrayList;

public class Hall {
    private int rows;
    private int seats;

    public Hall(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
    }

    public String toString() {
        return rows + " " + seats;
    }
    public ArrayList<Point> reserve(int row, int seats) {
        ArrayList<Point> reserve = new ArrayList<Point>();

        return row, seats;
    }
}

/*
* ArrayList<Point> reserved
*
* class Point {
*
*
* int x
* int y
* }
* for(point p : reserved)
*
* */