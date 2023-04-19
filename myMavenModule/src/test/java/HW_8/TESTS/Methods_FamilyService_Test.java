package HW_8.TESTS;

import HW_8.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class Methods_FamilyService_Test {

    @Test
    public void testGetAllFamiliesPositive() {
        FamilyService familyService = new FamilyService();

        // Створюємо дві сім'ї і зберігаємо їх в БД
        Human fatherIvan = new Human("Ivan", "Frolov", 36, 89);
        Human motherNadiia = new Human("Nadiia", "Frolova", 35, 99);
        Family family1 = new Family(motherNadiia, fatherIvan);
        familyService.createNewFamily(motherNadiia, fatherIvan);

        Human fatherNikola = new Human("Nikola", "Lahov", 40, 95);
        Human motherAlla = new Human("Alla", "Lahova", 39, 92);
        Family family2 = new Family(motherAlla, fatherNikola);
        familyService.createNewFamily(motherAlla, fatherNikola);

        // Отримуємо список всіх сімей з БД
        List<Family> families = familyService.getAllFamilies();

        // Перевіряємо, чи список містить обидві збережені сім'ї
        assertTrue(families.contains(family1));
        assertTrue(families.contains(family2));
    }

    @Test
    public void testGetAllFamiliesNegative() {
        FamilyService familyService = new FamilyService();

        // Видаляємо всі сім'ї з БД
        familyService.deleteAllFamilies();

        // Отримуємо список всіх сімей з БД
        List<Family> families = familyService.getAllFamilies();

        // Перевіряємо, що список порожній
        assertTrue(families.isEmpty());
    }
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -


    @Test
    public void testCreateNewFamilyPositive() {
        Human father = new Human("Ivan", "Frolov", 36, 89);
        Human mother = new Human("Nadiia", "Frolova", 35, 99);
        FamilyService familyService = new FamilyService();

        // Виклик методу, який ми хочемо протестувати
        familyService.createNewFamily(mother, father);

        // Перевірка того, що метод виконався коректно і сім'я збережена в БД
        List<Family> families = familyService.getAllFamilies();
        assertEquals(1, families.size());
        Family family = families.get(0);
        assertEquals(father, family.getFather());
        assertEquals(mother, family.getMother());
    }

    @Test
    public void testCreateNewFamilyNegative() {
        Human father = new Human("Ivan", "Frolov", 36, 89);
        Human mother = null; // намерено передаємо null замість матері
        FamilyService familyService = new FamilyService();

        // Виклик методу, який ми хочемо протестувати
        familyService.createNewFamily(father, mother);

// Перевірка того, що метод НЕ виконався коректно і сім'я НЕ збережена в БД
        List<Family> families = familyService.getAllFamilies();
        assertTrue(1 == families.size()); // сім'я не повинна бути збережена
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @Test
    public void testDeleteFamilyByIndex() {
        // Створюємо тестову сім'ю
        Human father = new Human("Ivan", "Frolov", 36, 89);
        Human mother = new Human("Nadiia", "Frolova", 35, 99);
        FamilyService familyService = new FamilyService();
        familyService.createNewFamily(father, mother);

        int index = 0;
        familyService.deleteFamilyByIndex(index);

        List<Family> families = familyService.getAllFamilies();
        assertFalse(families.contains(new Family(father, mother)));
    }
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -


}
