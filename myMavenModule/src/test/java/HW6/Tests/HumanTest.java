package HW6.Tests;

import HW6.Man;
import HW6.Woman;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class HumanTest {

    // позитивна перевірка того, чи дійсно жінка і чоловік наслідують клас Human
    @Test
    public void testManExtends() {
        Man man = new Man("Назар", "Василенко", 32, 100);
        Assertions.assertEquals("Назар", man.getName());
        Assertions.assertEquals("Василенко", man.getSurname());
        Assertions.assertEquals(32, man.getYear());
        Assertions.assertEquals(100, man.getIq());
    }

    @Test
    public void testWomanExtends() {
        Woman woman = new Woman("Valya", "Vasylenko", 27, 100);
        assertEquals("Valya", woman.getName());
        assertEquals("Vasylenko", woman.getSurname());
        assertEquals(27, woman.getYear());
        assertEquals(100, woman.getIq());
    }

    // негативна перевірка
    @Test
    public void testManNegative() {
        Man man = new Man(" ", " ", -32, 789);
        Assertions.assertEquals("Назар", man.getName());
        Assertions.assertEquals("Василенко", man.getSurname());
        Assertions.assertEquals(32, man.getYear());
        Assertions.assertEquals(100, man.getIq());
    }

    @Test
    public void testWomanNegative() {
        Woman woman = new Woman(" ", " ", -27, -100);
        assertEquals("Valya", woman.getName());
        assertEquals("Vasylenko", woman.getSurname());
        assertEquals(27, woman.getYear());
        assertEquals(100, woman.getIq());
    }

}
