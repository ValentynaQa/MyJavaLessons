package testsLesson5.TestsHW5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import testsLesson5.Family;
import testsLesson5.Human;

import static org.junit.Assert.assertEquals;

public class EddChildTest {

    @Test
    public void testAddChildPositive() {
        Family family = new Family();
        Human childMaria = new Human("Maria", "Vasylenko", 6, new String[][]{{"Понідлок", "Акробатика"}, {"Середа", "Похід до лікаря"}, {"Субота", "Малювання"}});
        Human childSofia = new Human("Sofia", "Gryn", 4, new String[][]{{"Понеділок", "Примірка сукні"}, {"Середа", "Стоматолог"}, {"Субота", "Відвідати бабусю"}, {"Неділя", "Похід в театр"}});

        // перед додаванням дітей їх тут 0
        assertEquals(0, family.getChildrenNumber());

        // Додала Марію, перевірила, що стало 1
        family.addChild(childMaria);
        assertEquals(1, family.getChildrenNumber());

        // Додала Софію, перевірила, що стало 2 дітей
        family.addChild(childSofia);
        assertEquals(2, family.getChildrenNumber());

        // Перевірка того, чи 2 дитини є в масиві
        Human[] children = family.getChildren();
        assertEquals(childMaria, children[0]);
        assertEquals(childSofia, children[1]);
    }

}

