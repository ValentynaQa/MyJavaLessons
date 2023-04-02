package testsLesson5;

import static org.junit.Assert.*;
import org.junit.Test;

public class CountFamilyTest {

    // позитивна перевірка +
    @Test
    public void testCountFamily() {
        Human fatherSasha = new Human("Sasha", "Gryn", 40, 90);
        Human motherHana = new Human("Hana", "Gryn", 36, new String[][]{{"Вівторок", "Шопінг"}, {"Четвер", "Зустріч з клієнтом"}, {"Неділя", "Похід до Адвоката"}});
        Human childSofia = new Human("Sofia", "Gryn", 4, new String[][]{{"Понеділок", "Примірка сукні"}, {"Середа", "Стоматолог"}, {"Субота", "Відвідати бабусю"}, {"Неділя", "Похід в театр"}});
        Human childMaria = new Human("Maria", "Vasylenko", 6, new String[][]{{"Понідлок", "Акробатика"}, {"Середа", "Похід до лікаря"}, {"Субота", "Малювання"}});

        Family family = new Family(fatherSasha, motherHana);
        family.addChild(childSofia);
        family.addChild(childMaria);
        int expectedCount = 4;
        int actualCount = family.countFamily();
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountFamilyNegative() {
        Human fatherSasha = new Human("Sasha", "Gryn", 40, 90);
        Human motherHana = new Human("Hana", "Gryn", 36, new String[][]{{"Вівторок", "Шопінг"}, {"Четвер", "Зустріч з клієнтом"}, {"Неділя", "Похід до Адвоката"}});
        Human childSofia = new Human("Sofia", "Gryn", 4, new String[][]{{"Понеділок", "Примірка сукні"}, {"Середа", "Стоматолог"}, {"Субота", "Відвідати бабусю"}, {"Неділя", "Похід в театр"}});

        Family family = new Family(fatherSasha, motherHana);
        family.addChild(childSofia);
        int expectedCount = 4;
        int actualCount = family.countFamily();
        assertEquals(expectedCount, actualCount);
    }

}
