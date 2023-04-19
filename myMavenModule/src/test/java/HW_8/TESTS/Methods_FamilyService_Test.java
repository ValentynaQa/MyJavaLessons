package HW_8.TESTS;

import HW_8.*;
import org.junit.jupiter.api.Test;

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

        List<Family> families = familyService.getAllFamilies();

        assertTrue(families.contains(family1));
        assertTrue(families.contains(family2));
    }

    @Test
    public void testGetAllFamiliesNegative() {
        FamilyService familyService = new FamilyService();

        familyService.deleteAllFamilies();
        List<Family> families = familyService.getAllFamilies();

        assertTrue(families.isEmpty());
    }
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -


    @Test
    public void testCreateNewFamilyPositive() {
        Human father = new Human("Ivan", "Frolov", 36, 89);
        Human mother = new Human("Nadiia", "Frolova", 35, 99);
        FamilyService familyService = new FamilyService();

        familyService.createNewFamily(mother, father);

        List<Family> families = familyService.getAllFamilies();
        assertEquals(1, families.size());
        Family family = families.get(0);
        assertEquals(father, family.getFather());
        assertEquals(mother, family.getMother());
    }

    @Test
    public void testCreateNewFamilyNegative() {
        Human father = new Human("Ivan", "Frolov", 36, 89);
        Human mother = null;
        FamilyService familyService = new FamilyService();

        familyService.createNewFamily(father, mother);

        List<Family> families = familyService.getAllFamilies();
        assertTrue(1 == families.size());
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @Test
    public void testDeleteFamilyByIndex() {
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
