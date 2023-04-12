package HW7.Tests;

import HW7.Family;
import HW7.Human;
import HW7.Pet;
import org.junit.jupiter.api.Test;

import java.util.Map;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeleteChildTest {

    @Test
    public void testDeleteChildPositive() {
        Human fatherNazar = new Human("Nazar", "Vasylenko", 32, Map.of("З Понеділка по П'ятницю", "Робота", "Субота", "Час для родини", "Неділя", "Похід в кіно"));
        Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
        Human childMaria = new Human("Maria", "Vasylenko", 6, Map.of("Понедлок", "Акробатика", "Середа", "Похід до лікаря", "Субота", "Малювання"));
        Human childSofia = new Human("Sofia", "Gryn", 4, Map.of("Понеділок", "Примірка сукні", "Середа", "Стоматолог", "Субота", "Відвідати бабусю", "Неділя", "Похід в театр"));

        List<Human> children = new ArrayList<>(Arrays.asList(childMaria, childSofia));
        Family family = new Family(fatherNazar, matherValya, children);

        boolean result = family.deleteChild(childMaria);

        assertTrue(result);
        assertEquals(1, family.getChildren().size());
        assertFalse(family.getChildren().contains(childMaria));
    }

    @Test
    public void testDeleteChildPositive2() {
        Human fatherNazar = new Human("Nazar", "Vasylenko", 32, Map.of("З Понеділка по П'ятницю", "Робота", "Субота", "Час для родини", "Неділя", "Похід в кіно"));
        Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
        Human childMaria = new Human("Maria", "Vasylenko", 6, Map.of("Понедлок", "Акробатика", "Середа", "Похід до лікаря", "Субота", "Малювання"));
        Human childSofia = new Human("Sofia", "Gryn", 4, Map.of("Понеділок", "Примірка сукні", "Середа", "Стоматолог", "Субота", "Відвідати бабусю", "Неділя", "Похід в театр"));

        List<Human> children = new ArrayList<>();
        children.add(childMaria);
        children.add(childSofia);

        Family family = new Family(fatherNazar, matherValya, children);
        family.deleteChild(childMaria);

        assertFalse(family.getChildren().contains(childMaria));
        assertEquals(1, family.getChildren().size());
    }

    /*--------------------------------------------------------------------------------
    * Негативні перевірки*/
    @Test
    public void testDeleteChildNegative () {
        Human fatherNazar = new Human("Nazar", "Vasylenko", 32, Map.of("З Понеділка по П'ятницю", "Робота", "Субота", "Час для родини", "Неділя", "Похід в кіно"));
        Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
        Human childMaria = new Human("Maria", "Vasylenko", 6, Map.of("Понедлок", "Акробатика", "Середа", "Похід до лікаря", "Субота", "Малювання"));

        Human childOutside = new Human("Sasha", "Gryn", 40, 90); /*якась дитина не із сім'ї */

        List<Human> children = new ArrayList<>();
        children.add(childMaria);

        Family family = new Family(fatherNazar, matherValya, children);
        family.deleteChild(childOutside); /* видалення дитини не із сім'ї */

        assertFalse(family.getChildren().contains(childMaria));
    }

    @Test
    public void testDeleteChildNegative2 () {
        Human fatherNazar = new Human("Nazar", "Vasylenko", 32, Map.of("З Понеділка по П'ятницю", "Робота", "Субота", "Час для родини", "Неділя", "Похід в кіно"));
        Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
        Human childMaria = new Human("Maria", "Vasylenko", 6, Map.of("Понедлок", "Акробатика", "Середа", "Похід до лікаря", "Субота", "Малювання"));
        Human childSofia = new Human("Sofia", "Gryn", 4, Map.of("Понеділок", "Примірка сукні", "Середа", "Стоматолог", "Субота", "Відвідати бабусю", "Неділя", "Похід в театр"));

        Human childOutside = new Human("Sasha", "Gryn", 40, 90); /*якась дитина не із сім'ї */

        List<Human> children = new ArrayList<>();
        children.add(childMaria);
        children.add(childSofia);

        Family family = new Family(fatherNazar, matherValya, children);
        family.deleteChild(childOutside);

        assertFalse(family.getChildren().contains(childMaria));
        assertEquals(1, family.getChildren().size());
    }
}
