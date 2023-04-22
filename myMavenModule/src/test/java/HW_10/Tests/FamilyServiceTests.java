package HW_10.Tests;

import HW_10.Family;
import HW_10.FamilyService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class FamilyServiceTests {
    private FamilyService familyService;

    @Before
    public void setUp() {
        familyService = new FamilyService();
    }

    @Test
    public void testGetAllFamilies() {
        List<Family> families = familyService.getAllFamilies();
        assertNotNull(families);

        assertEquals(0, families.size());
    }

    @Test
    public void testDisplayAllFamilies() {
        List<Family> families = familyService.displayAllFamilies();
        assertNotNull(families);

        assertEquals(0, families.size());
    }

    @Test
    public void testGetFamiliesBiggerThan() {
        List<Family> families = familyService.getFamiliesBiggerThan(4);
        assertNotNull(families);

        assertEquals(0, families.size());
    }

    @Test
    public void testGetFamiliesLessThan() {
        List<Family> families = familyService.getFamiliesLessThan(2);
        assertNotNull(families);

        assertEquals(0, families.size());
    }

    @Test
    public void testCountFamiliesWithMemberNumber() {
        long count = familyService.countFamiliesWithMemberNumber(3);

        assertEquals(0, count);
    }
}