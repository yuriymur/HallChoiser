import java.util.ArrayList;

public class Cinema {

    private Hall[] halls;
    private Seanses[] seances;

    public Cinema(Hall[] halls, Seanses[] seances) {
        this.halls = halls;
        this.seances = seances;
    }

    public ArrayList<Seanses> find(String search) {
        ArrayList<Seanses> found = new ArrayList<Seanses>();
        for (Seanses seance : seances) {
            if (seance.getName().contains(search)) {
                found.add(seance);
            }
        }
        return found;
    }

    public Seanses findById(int searchId) {
        for (Seanses seance : seances) {
            if (seance.getId() == searchId) {
                return seance;
            }
        }
        return null;
    }

    public boolean reserve(Seanses seance, int row, int seat) {
        return false; // todo
    }
}