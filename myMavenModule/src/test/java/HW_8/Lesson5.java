package HW_8;

import testsLesson5.Human;

import java.util.List;
import java.util.Map;

public class Lesson5 {
    public static void main(String[] args) {

        FamilyController familyController = new FamilyController(new FamilyService());

        List<Family> allFamilies = familyController.getAllFamilies();
        familyController.displayAllFamilies();
        familyController.getFamiliesBiggerThan(2);
        familyController.getFamiliesLessThan(4);
        int count = familyController.countFamiliesWithMemberNumber(3);
        System.out.print("Кількість сімей зі значенням кількості членів сім'ї: " + count + " ");

        HW_8.Human fatherN = new HW_8.Human("Nazar", "Vasylenko", 32, Map.of("З Понеділка по П'ятницю", "Робота", "Субота", "Час для родини", "Неділя", "Похід в кіно").size());
        HW_8.Human motherV = new HW_8.Human("Valentyna", "Vasylenko", 28, 85);
        HW_8.Human childS = new HW_8.Human("Sosia", "Gryn", 5, Map.of("Вівторок", "Похід до лікаря").size());

        familyController.createNewFamily(fatherN, motherV, childS);
        familyController.deleteFamilyByIndex(0);

        Family family = new Family(fatherN, motherV);
        familyController.bornChild(family, "Bob", "Lisa");
        HW_8.Human child = new HW_8.Human("Sam", "Doe", 0, 0);

        familyController.adoptChild(family, child);
        familyController.deleteAllChildrenOlderThen(10);
        int totalFamilies = familyController.count();

        System.out.println("Загалом є: " + totalFamilies + " сімей");
        Family firstFamily = familyController.getFamilyById(1);

        if (firstFamily != null) {
            System.out.println("Перша сім'я: " + firstFamily.toString());
        } else {
            System.out.println("Перша сім'я відсутня.");
        }

        int number = 0;
        testsLesson5.Human[] humans = new testsLesson5.Human[1000000];
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