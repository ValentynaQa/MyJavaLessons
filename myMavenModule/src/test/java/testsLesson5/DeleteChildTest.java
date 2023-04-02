package testsLesson5;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class DeleteChildTest {

    /*Позитивний - проверьте, что ребенок действительно удаляется из массива children  (если передать объект, еквивалентый хотябы одному элементу массива);*/
    @Test
    public void testDeleteChild() {
        Human fatherSasha = new Human("Sasha", "Gryn", 40, 90);
        Human motherHana = new Human("Hana", "Gryn", 36, new String[][]{{"Вівторок", "Шопінг"}, {"Четвер", "Зустріч з клієнтом"}, {"Неділя", "Похід до Адвоката"}});
        Human childSofia = new Human("Sofia", "Gryn", 4, new String[][]{{"Понеділок", "Примірка сукні"}, {"Середа", "Стоматолог"}, {"Субота", "Відвідати бабусю"}, {"Неділя", "Похід в театр"}});
        Human childMaria = new Human("Maria", "Vasylenko", 6, new String[][]{{"Понідлок", "Акробатика"}, {"Середа", "Похід до лікаря"}, {"Субота", "Малювання"}});
        Family family = new Family(motherHana, fatherSasha);
        family.addChild(childSofia);
        family.addChild(childMaria);
        assertTrue(family.deleteChild(childSofia));
        assertEquals(1, family.getChildren().length);
        Assertions.assertEquals(childMaria, family.getChildren()[0]);

        /*Позитивний - проверьте, что массив children остается без изменений (если передать объект, не еквивалентый ни одному элементу массива);*/
        Human otherChild = new Human("Valentyna", "Vasylenko", 28, 85);
        assertFalse(family.deleteChild(otherChild));
        assertEquals(1, family.getChildren().length);
        Assertions.assertEquals(childMaria, family.getChildren()[0]);
    }
    /*Негативний - проверьте, что ребенок действительно удаляется из массива children  (если передать объект, еквивалентый хотябы одному элементу массива);*/
    @Test
    public void testNegativeDeleteChild() {
        Human fatherSasha = new Human("Sasha", "Gryn", 40, 90);
        Human motherHana = new Human("Hana", "Gryn", 36, new String[][]{{"Вівторок", "Шопінг"}, {"Четвер", "Зустріч з клієнтом"}, {"Неділя", "Похід до Адвоката"}});
        Human childMaria = new Human("Maria", "Vasylenko", 6, new String[][]{{"Понідлок", "Акробатика"}, {"Середа", "Похід до лікаря"}, {"Субота", "Малювання"}});
        Family family = new Family(motherHana, fatherSasha);
        family.addChild(childMaria);
        assertFalse(family.deleteChild(new Human("Sofia", "Gryn", 4, new String[][]{{"Понеділок", "Примірка сукні"}, {"Середа", "Стоматолог"}, {"Субота", "Відвідати бабусю"}, {"Неділя", "Похід в театр"}})));
        Assertions.assertEquals(2, family.getChildren().length);
    }

        /*Негативний - проверьте, что массив children остается без изменений (если передать объект, не еквивалентый ни одному элементу массива);*/
        @Test
        public void testDeleteChildNegative() {
            Human fatherNazar = new Human("Nazar", "Vasylenko", 32, new String[][]{{"З Понеділка по П'ятницю", "Робота"}, {"Субота", "Час для родини"}, {"Неділя", "Похід в кіно"}});
            Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
            Human childMaria = new Human("Maria", "Vasylenko", 6, new String[][]{{"Понідлок", "Акробатика"}, {"Середа", "Похід до лікаря"}, {"Субота", "Малювання"}});
            Human childSofia = new Human("Sofia", "Gryn", 4, new String[][]{{"Понеділок", "Примірка сукні"}, {"Середа", "Стоматолог"}, {"Субота", "Відвідати бабусю"}, {"Неділя", "Похід в театр"}});
            Family family = new Family(fatherNazar, matherValya);
            family.addChild(childMaria);
            family.addChild(childSofia);
            Human otherChild = new Human("Sasha", "Gryn", 40, 90);
            assertFalse(family.deleteChild(otherChild));
            assertEquals(3, family.getChildren().length);
        }
}


