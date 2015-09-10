/**
 * Created by IIS on 10.09.2015.
 */
public class Cinema {
    private Hall[] halls;//залы
    private Seanses [] seanseses;

    public Cinema(Hall[] halls, Seanses[] seanseses) {
        this.halls = halls;
        this.seanseses = seanseses;
    }

    void print() {
        for (Seanses sean : seanseses) {
            System.out.println(sean);
        }
    }
   /* void printHall() {
        for (Hall
                Seanses seansese : seanseses) {
            System.out.println(seansese);
        }
    }*/

    public static void main(String[] args) {
        Hall[] halls = {new Hall(10, 20)};
        Seanses[] seanseses = {new Seanses("Терминатор","21:00",1)};
        Cinema My = new Cinema(halls,seanseses);
        My.print();

    }
}
