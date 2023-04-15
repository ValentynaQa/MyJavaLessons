package HW_8;

import java.util.List;

public class FamilyService {
    private FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) { //конструктор
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies() { // получить список всех семей.
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {  //  вывести на экран все семьи (в индексированном списке) со всеми членами семьи.
        List<Family> families = familyDao.getAllFamilies();
        for (int i = 0; i < families.size(); i++) {
            System.out.println("Сім'я під номером " + i);
            System.out.println(families.get(i));
        }
    }
    public void getFamiliesBiggerThan(int count) {  //виводить всі сім'ї, де кількість членів сім'ї більше вказаної кількості count.
        List<Family> families = familyDao.getFamiliesBiggerThan(count);
        for (int i = 0; i < families.size(); i++) {
            System.out.println("Сім'я під номером " + i);
            System.out.println(families.get(i));
        }
    }
    public void getFamiliesLessThan(int count) {  //виводить всі сім'ї, де кількість членів сім'ї менше вказаної кількості count.
        List<Family> families = familyDao.getFamiliesLessThan(count);
        for (int i = 0; i < families.size(); i++) {
            System.out.println("Сім'я під номером " + i);
            System.out.println(families.get(i));
        }
    }

}
