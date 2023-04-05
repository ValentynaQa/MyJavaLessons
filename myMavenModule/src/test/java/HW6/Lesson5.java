package HW6;

public class Lesson5 {
    public static void main(String[] args) {
        int number = 0;
        Human[] humans = new Human[1000000];
        try {
            for (int i = 0; i < humans.length; i++) {
                humans[i] = new Human();
                number++;
                if (number % 10000 == 0) {
                    System.out.println("Створено " + number + " людей.");
                }
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Створено " + number + " - пам'ять закінчується.");
        }
    }
}