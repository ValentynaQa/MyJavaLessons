package HW7.Tests;

import HW7.Human;
import HW7.Family;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


public class AddChild_Test {
    Human fatherNazar = new Human("Nazar", "Vasylenko", 32, Map.of("З Понеділка по П'ятницю", "Робота", "Субота", "Час для родини", "Неділя", "Похід в кіно"));
    Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
    Human childMaria = new Human("Maria", "Vasylenko", 6, Map.of("Понеділок", "Акробатика", "Середа", "Похід до лікаря", "Субота", "Малювання"));
    Human childSofia = new Human("Sofia", "Gryn", 4, Map.of("Понеділок", "Примірка сукні", "Середа", "Стоматолог", "Субота", "Відвідати бабусю", "Неділя", "Похід в театр"));

    @Test
    public void AddChildPositive() { /*перевірка чи додалась нова дитина */

        Family family = new Family(fatherNazar, matherValya);
        List<Human> children = new ArrayList<>(Arrays.asList(childMaria));
        family.setChildren(children);

        family.addChild(childSofia);

        assertEquals(2, family.getChildren().size());
        assertTrue(family.getChildren().contains(childSofia));
        assertEquals(family, childSofia.getFamily());
    }

    @Test
    public void AddChildNegative() { /*перевірка чи додасться дитина в табличку, якщо має некоректно заповнені поля*/

        Family family = new Family(fatherNazar, matherValya);
        List<Human> children = new ArrayList<>(Arrays.asList(childMaria));
        family.setChildren(children);

        Human newChild = new Human("Dog", "Cat", -1, Map.of("Понеділок", "Сон"));
        family.addChild(newChild);

        assertEquals(2, family.getChildren().size());
        assertFalse(family.getChildren().contains(newChild));
        assertNull(newChild.getFamily());
    }


}
