package HW_10.Tests;

import HW_10.Family;
import HW_10.Human;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import HW_10.FamilyService;

import java.util.List;


public class FamilyServiceNegativeTests {

    private FamilyService familyService;

    @Before
    public void setUp() {
        familyService = new FamilyService();
    }

    @Test
    public void testCreateNewFamilyWithInvalidData() {
        Human father = new Human("Nadiia", "Homenko", 33, 99);
        Human mother = new Human("Ivan", "Homenko", 44, 88);
        Family newFamily = new Family(father, mother);

        newFamily.addChild(new Human("Klubnika", "Sluva", 10, 55));
        newFamily.addChild(new Human("Malina", "Apple", 5, 44));
        familyService.createNewFamily(newFamily);

        List<Family> families = familyService.displayAllFamilies();
        assertNotNull(families);

        assertEquals(0, families.size());
    }

    @Test
    public void testCreateNewFamily() {
        List<Family> families = familyService.displayAllFamilies();
        assertNotNull(families);

        assertEquals(0, families.size());

        Human father = new Human("Oleg", "Liakhov", 33, 99);
        Human mother = new Human("Emma", "Liakhova", 44, 88);
        Family newFamily = new Family(father, mother);
        familyService.createNewFamily(newFamily);

        families = familyService.displayAllFamilies();
        assertNotNull(families);

        assertEquals(1, families.size());
    }

    @Test
    public void testGetFamiliesBiggerThan() {
        List<Family> families = familyService.getFamiliesBiggerThan(-1000);
        assertNotNull(families);

        assertEquals(0, families.size());
    }

    @Test
    public void testGetFamiliesLessThan() {
        assertThrows(IllegalArgumentException.class, () -> {
            familyService.getFamiliesLessThan(-1);
        });
    }

    @Test
    public void testCountFamiliesWithMemberNumber() {
        long count = familyService.countFamiliesWithMemberNumber(3);

        assertEquals(0, count);
    }
}
