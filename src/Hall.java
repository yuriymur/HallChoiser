public class Hall {

    private int[]hallid;
    private boolean[][] hall;

    public Hall(int[] hallid, boolean[][] hall) {
        this.hallid = hallid;
        this.hall = hall;

    }

    public boolean[][] getHall() {
        System.out.println(hall);
        return hall;
    }
}