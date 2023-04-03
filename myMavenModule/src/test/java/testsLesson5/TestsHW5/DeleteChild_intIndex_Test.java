package testsLesson5.TestsHW5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testsLesson5.Family;
import testsLesson5.Human;

import static org.junit.Assert.*;

public class DeleteChild_intIndex_Test {

    @Test
    public void DeleteChildNumber() {
        Human fatherNazar = new Human("Nazar", "Vasylenko", 32, new String[][]{{"З Понеділка по П'ятницю", "Робота"}, {"Субота", "Час для родини"}, {"Неділя", "Похід в кіно"}});
        Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
        Human childMaria = new Human("Maria", "Vasylenko", 6, new String[][]{{"Понідлок", "Акробатика"}, {"Середа", "Похід до лікаря"}, {"Субота", "Малювання"}});
        Human childSofia = new Human("Sofia", "Gryn", 4, new String[][]{{"Понеділок", "Примірка сукні"}, {"Середа", "Стоматолог"}, {"Субота", "Відвідати бабусю"}, {"Неділя", "Похід в театр"}});

        Family family = new Family(fatherNazar, matherValya);
        family.addChild(childMaria);
        family.addChild(childSofia);

        // перевіряємо розмір масиву children до видалення
        assertEquals(2, family.getChildrenNumber());
        // видаляємо дитину за індексом 1 (тобто другу дитину)
        boolean result = family.deleteChild(2);
        assertTrue(result);

        // перевіряємо, що розмір масиву зменшився до 1
        assertEquals(2, family.getChildrenNumber());

        // перевіряємо, що залишилася тільки перша дитина
        assertEquals(childSofia, family.getChildren()[0]);
        // проверяем, что метод возвращает верное значение, если удалить несуществующего ребенка
        assertFalse(family.deleteChild(1));
    }
}
