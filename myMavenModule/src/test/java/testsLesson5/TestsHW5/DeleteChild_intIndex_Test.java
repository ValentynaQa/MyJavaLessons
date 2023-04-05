package testsLesson5.TestsHW5;

import org.junit.jupiter.api.Test;
import testsLesson5.Family;
import testsLesson5.Human;

import static org.junit.Assert.*;

public class DeleteChild_intIndex_Test {

    @Test
    public void DeleteChildNumber() { //позитивна перевірка
        Human fatherNazar = new Human("Nazar", "Vasylenko", 32, new String[][]{{"З Понеділка по П'ятницю", "Робота"}, {"Субота", "Час для родини"}, {"Неділя", "Похід в кіно"}});
        Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
        Human childMaria = new Human("Maria", "Vasylenko", 6, new String[][]{{"Понідлок", "Акробатика"}, {"Середа", "Похід до лікаря"}, {"Субота", "Малювання"}});
        Human childSofia = new Human("Sofia", "Gryn", 4, new String[][]{{"Понеділок", "Примірка сукні"}, {"Середа", "Стоматолог"}, {"Субота", "Відвідати бабусю"}, {"Неділя", "Похід в театр"}});

        Family family = new Family(fatherNazar, matherValya);
        family.addChild(childMaria);
        family.addChild(childSofia);

        assertEquals(2, family.getChildrenNumber()); // зараз

        boolean result = family.deleteChild(0); // після видалення дитини
        assertTrue(result);

        // перевіряю, що розмір масиву зменшився до 1
        assertEquals(1, family.getChildrenNumber());
        assertEquals(childSofia, family.getChildren()[0]);
        assertFalse(family.deleteChild(1));
    }

    @Test
    public void DeleteChildNumberNegative() { //негативна перевірка
        Human fatherNazar = new Human("Nazar", "Vasylenko", 32, new String[][]{{"З Понеділка по П'ятницю", "Робота"}, {"Субота", "Час для родини"}, {"Неділя", "Похід в кіно"}});
        Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
        Human childMaria = new Human("Maria", "Vasylenko", 6, new String[][]{{"Понідлок", "Акробатика"}, {"Середа", "Похід до лікаря"}, {"Субота", "Малювання"}});
        Human childSofia = new Human("Sofia", "Gryn", 4, new String[][]{{"Понеділок", "Примірка сукні"}, {"Середа", "Стоматолог"}, {"Субота", "Відвідати бабусю"}, {"Неділя", "Похід в театр"}});

        Family family = new Family(fatherNazar, matherValya);
        family.addChild(childMaria);
        family.addChild(childSofia);

        assertEquals(2, family.getChildrenNumber()); // зараз

        boolean result = family.deleteChild(0); // після видалення дитини
        assertTrue(result);

        // перевіряю, що розмір масиву зменшився до 1
        assertEquals(2, family.getChildrenNumber());
        assertEquals(childSofia, family.getChildren()[0]);
        assertFalse(family.deleteChild(1));
    }
}
