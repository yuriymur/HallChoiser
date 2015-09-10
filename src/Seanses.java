/**
 * Created by IIS on 10.09.2015.
 */
public class Seanses {
    private String film;
    private String TimeSeanses;
    private int Hall;

    public Seanses(String film, String timeSeanses, int hall) {
        this.film = film;
        TimeSeanses = timeSeanses;
        this.Hall = hall;
    }
    public String toString(){
        return film + " " + TimeSeanses + " в зале номер "+ Hall;
    }
}
