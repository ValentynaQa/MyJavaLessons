package HW6.Tests;
import HW6.*;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PetTest {
    // Перевірка что во всех подклассах были конструкторы суперкласса.
    @Test
    public void testPetConstructor() {
        Dog dog = new Dog(SpeisesHW6.DOG, "Бобік");
        assertNotNull(dog);

        DomesticCat cat = new DomesticCat(SpeisesHW6.DOMESTIC_CAT, "Барсік");
        assertNotNull(cat);

        Fish fish = new Fish(SpeisesHW6.FISH, "Дора");
        assertNotNull(fish);

        RoboCat roboCat = new RoboCat(SpeisesHW6.ROBO_CAT, "Future");
        assertNotNull(roboCat);
    }

}
