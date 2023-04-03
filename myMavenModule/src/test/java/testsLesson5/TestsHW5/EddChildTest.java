package testsLesson5.TestsHW5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import testsLesson5.Family;
import testsLesson5.Human;

import static org.junit.Assert.assertEquals;

public class EddChildTest {
    @Test
    public void testAddChild() {
        Human fatherNazar = new Human("Nazar", "Vasylenko", 32, new String[][]{{"З Понеділка по П'ятницю", "Робота"}, {"Субота", "Час для родини"}, {"Неділя", "Похід в кіно"}});
        Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
        Family family = new Family(fatherNazar, matherValya);
        Human childMaria = new Human("Maria", "Vasylenko", 6, new String[][]{{"Понідлок", "Акробатика"}, {"Середа", "Похід до лікаря"}, {"Субота", "Малювання"}});
        family.addChild(childMaria);
        Assertions.assertEquals(1, family.getChildrenNumber());
        Assertions.assertEquals(childMaria, family.getChildren()[0]);
        Assertions.assertEquals(family, childMaria.getFamily());
    }
}
