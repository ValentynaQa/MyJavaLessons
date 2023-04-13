package HW7.Tests;

import HW7.Family;
import HW7.Human;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.lang.Integer;

import static org.junit.Assert.*;

public class Int_index_deleteChild_Test {

    Human fatherNazar = new Human("Nazar", "Vasylenko", 32, Map.of("З Понеділка по П'ятницю", "Робота", "Субота", "Час для родини", "Неділя", "Похід в кіно"));
    Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
    Human childMaria = new Human("Maria", "Vasylenko", 6, Map.of("Понедлок", "Акробатика", "Середа", "Похід до лікаря", "Субота", "Малювання"));
    Human childSofia = new Human("Sofia", "Gryn", 4, Map.of("Понеділок", "Примірка сукні", "Середа", "Стоматолог", "Субота", "Відвідати бабусю", "Неділя", "Похід в театр"));

    @Test
    public void testInt_indexDeleteChildPositive (){
        Family family = new Family(fatherNazar, matherValya);

        List<Human> children = new ArrayList<>(Arrays.asList(childMaria, childSofia));
        family.setChildren(children);

        int index = 1;
        Human childToRemove = family.getChildren().get(index);
            assertTrue(family.deleteChild(index));
            assertFalse(family.getChildren().contains(childToRemove));
            assertEquals(1, family.getChildren().size());
    }

    @Test
    public void testInt_indexDeleteChildNegative (){
        Family family = new Family(fatherNazar, matherValya);
        List<Human> children = new ArrayList<>(Arrays.asList(childMaria, childSofia));
        family.setChildren(children);

        int index = 5;
            assertFalse(family.deleteChild(index));
            assertEquals(5, family.getChildren().size());
    }

    @Test
    public void testInt_indexDeleteChildOutOfRangePositive () {
        List<Human> children = new ArrayList<>(Arrays.asList(childMaria, childSofia));
        Family family = new Family(fatherNazar, matherValya, children);

        int invalidIndex = children.size();
        boolean result = family.deleteChild(invalidIndex);

            assertFalse(result);
            assertEquals(children, family.getChildren());
        }

        @Test
        public void testInt_indexDeleteChildOutOfRangeNegative () {
        List<Human> children = new ArrayList<>(Arrays.asList(childMaria, childSofia));
        Family family = new Family(fatherNazar, matherValya, children);

        assertEquals(2, family.getChildrenNumber());
        boolean result = family.deleteChild(0);

            assertTrue(result);
            assertEquals(2, family.getChildrenNumber());
            assertEquals(childSofia, family.getChildren().get(0));
            assertFalse(family.deleteChild(1));
        }
}
