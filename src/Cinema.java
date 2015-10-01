import java.awt.*;
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
//
//public class Cinema {
//    private Hall[] halls;//залы
//    private Seanses[] seanseses;
//    int count = 0;
//
//    public Cinema(Hall[] halls, Seanses[] seanseses) {
//        this.halls = halls;
//        this.seanseses = seanseses;
//    }
//
//    void print() {
//        for (Seanses sean : seanseses) {
//            System.out.println(sean);
//        }
//    }
//
//    ArrayList<Seanses> find(String str) {
//        ArrayList<Seanses> found = new ArrayList<Seanses>();
//
//        int[] find(String str){
//            int resultCount = 0;
//
//            for (int i = 0; i < count; i++) {
//                if (list[i].getName().startsWith(str)) {
//                    resultCount++;
//                }
//            }
//            int[] found = new int[resultCount];
//            int founds = 0;
//            for (int i = 0; i < count; i++) {
//                if (list[i].getName().startsWith(str)) {
//                    //resultCount++;
//                    found[founds] = i;
//                    founds++;
//                }
//            }
//
//        }
//        // todo
//        return found;
//    }
//
//
//
//    public static void main(String[] args) {
//        Hall[] halls = {new Hall(10, 15)};
//        Seanses[] seanseses = {new Seanses("Терминатор", "21:00", 1)};
//        Cinema My = new Cinema(halls, seanseses);
//        My.print();
//    }
//
//
//    public static void main1(String[] args) {
//        Hall[] halls = {new Hall(10, 20)};
//        Seanses[] seanseses = {new Seanses("Терминатор", "21:00", 1)};
//        Cinema My = new Cinema(halls, seanseses);
//        Scanner s = new Scanner(System.in);
//        while (true) {
//            System.out.println(
//                    "1. Поиск фильма\n" +
//                            "2. Поиск записей (дополнительно запрашиватеся имя для поиска)\n" +
//                            "3. Вывод всех записей\n" +
//                            "4. Удаление записи (дополнительно запрашивается индекс записи для удаления)\n" +
//                            "5. Изменение записи (дополнительно запрашивается индекс изменяемой записи, новые имя, телефон и e-mail)\n" +
//                            "6. Выход из программы");
//            // поиск печать выход
//            int command = s.nextInt();
//            switch (command) {
//                case 1:
//                    System.out.println("Ввведите название фильма");
//                    String film = s.next();// чтение с клавиатуры и запись в переемнную film
//                    ArrayList<Seanses> found = My.find(film);
//                    for (Seanses seanse : found) {
//                        System.out.println(seanse);
//                    }
//                    break;
//                default:// если ввели неверное число выводится это сообщение
//                    System.out.println("Ошибка\n" + "Введите число от 1 до 6");
//                    break;
//            }
//
//
//        }
//
//
//    }

   /* void printHall() {
        for (Hall
                Seanses seansese : seanseses) {
            System.out.println(seansese);
        }
    }*/

//    public static void main(String[] args) {
//        Hall[] halls = {new Hall(10, 20)};
//        Seanses[] seanseses = {new Seanses("Терминатор","21:00",1)};
//        Cinema My = new Cinema(halls,seanseses);
//        My.print();

    //поиск по названию фильма
    //показ свободных мет

