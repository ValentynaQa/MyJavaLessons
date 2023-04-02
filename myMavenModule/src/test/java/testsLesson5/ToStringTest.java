package testsLesson5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import testsLesson5.enums.Speises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ToStringTest {
    /*для Pet*/
    @Test
    public void petPosotiveTest() {
        Pet petNika = new Pet(Speises.DOG, "Nika", 8, 100, new String[]{"eat", "sleep", "play"});
        String expected = "Pet{ species= DOG , nickname= Nika , age 8 , trickLevel= 100, habits= [eat, sleep, play]}";
        Assertions.assertEquals(expected, petNika.toString());
    }

    @Test
    public void petNegativeTest() {
        Pet petNika = new Pet(Speises.DOG, "Nika", -8, 100, new String[]{"eat", "sleep", "play"});
        String expected = "Неправильні дані, некоректно введено вік";
        String result = petNika.toString();
        Assertions.assertEquals(expected, result);
    }

    /* Для Human*/
    @Test
    public void humanPosotiveTest() {
        Human childMaria = new Human("Maria", "Vasylenko", 6, new String[][]{{"Понідлок", "Акробатика"}, {"Середа", "Похід до лікаря"}, {"Субота", "Малювання"}});
        String expected = "Human {name=Maria, surname=Vasylenko, year=6, iq=0, schedule=[[Понідлок, Акробатика], [Середа, Похід до лікаря], [Субота, Малювання]]}";
        Assertions.assertEquals(expected, childMaria.toString());
    }

    @Test
    public void humanNegativeTest() {
        Human childMaria = new Human("89", "Vasylenko", 6, new String[][]{{"Понідлок", "Акробатика"}, {"Середа", "Похід до лікаря"}, {"Субота", "Малювання"}});
        String expected = "Неправильні дані, некоректно введено ім'я";
        String result = childMaria.toString();
        Assertions.assertEquals(expected, result);
    }
}

