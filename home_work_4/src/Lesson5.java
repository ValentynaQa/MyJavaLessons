import java.util.ArrayList;
import java.util.List;

public class Lesson5 {
    /*public static void main (String [] args){
        List<Human> humanList = new ArrayList();
        int number = 0;  /* змінна з кількістю створених об'єктів

        while(true) {
            humanList.add(new Human()); /* новий об'єкт додаємо до списку
            number++;  /* збільшення на один

            if (number >= 10000) {
                System.out.println("Створено " + number + "об'єктів. ");
            }
        }
        catch (OutOfMemoryError) {
            System.out.println(number + "закінчується пам'ять");
        }

    }

} */
    public class Main {
        public static void main(String[] args) {
            List<Human> humanList = new ArrayList<>();
            int number = 0;
            try {
                while (true) {
                    humanList.add(new Human());
                    number++;
                    if (number % 10000 == 0) {
                        System.out.println("Created " + number + " objects.");
                    }
                }
            } catch (OutOfMemoryError e) {
                System.out.println("Created " + number + " objects before running out of memory.");
            }
        }
    }
}

