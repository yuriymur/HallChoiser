import java.util.ArrayList;
import java.util.Scanner;

public class CinemaMain {
    public static void main(String[] args) {
        Hall[] halls = {new Hall(10, 20), new Hall(20, 20)};
        Seanses[] seances = {new Seanses(1, "Фильм 1", "18:00", 1), new Seanses(2, "Фильм 2", "18:00", 2)};
        Cinema cinemaMy = new Cinema(halls, seances);

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1. Поиск фильмов");
            System.out.println("2. Бронирование");
            System.out.println("3. Выход");
            int command = Integer.parseInt(in.nextLine());
            switch (command) {
                case 1:
                    System.out.println("Введите наименование фильма");
                    String name = in.nextLine();
                    ArrayList<Seanses> found = cinemaMy.find(name);
                    if (found.isEmpty()) {
                        System.out.println("Фильм не найден");
                    } else {
                        for (Seanses seance : found) {
                            System.out.println(seance);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Введите номер сеанса");
                    int id = Integer.parseInt(in.nextLine());
                    Seanses seanses = cinemaMy.findById(id);
                    if (seanses == null) {
                        System.out.println("Неверный номер сеанса");
                    } else {
                        System.out.println("выбран фильм"+seanses+  "\n Выберите место ");
                        int seats = Integer.parseInt(in.nextLine());
                        if (int i=1; i++){


                        }
                        else {

                        }

                        System.out.println("Выберите ряд");
                        int rows = Integer.parseInt(in.nextLine());
                        System.out.println(halls);




                    }
                    // todo
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Введите число от 1 до 3");
                    break;
            }
        }
    }
}