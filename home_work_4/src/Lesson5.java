import java.util.ArrayList;
import java.util.List;

public class Lesson5 {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        int number = 0;

        try {
            while (true) {
                humanList.add(new Human());
                number++;
                if (number <= 10000) {
                    System.out.println("Створено " + number + " людей.");
                    }
                }
            } catch (OutOfMemoryError e) {
                System.out.println("Початок видалення старих об'єктів.");
            }
        }

    }

