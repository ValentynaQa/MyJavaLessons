package HW_8;

import HW6.SpeisesHW6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main (String[] args) {

        Human fatherNazar = new Human("Nazar", "Vasylenko", 32, Map.of("З Понеділка по П'ятницю", "Робота", "Субота", "Час для родини", "Неділя", "Похід в кіно"));
        Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
        Human childMaria = new Human("Maria", "Vasylenko", 6, Map.of("Понедлок", "Акробатика", "Середа", "Похід до лікаря", "Субота", "Малювання"));
        Pet petNika = new Pet(SpeisesHW6.DOG, "Nika", 8, 100, new HashSet<>(Arrays.asList("Їсти", "Гратися", "Спати"))){ };


        /* виводжу членів сім,ї */
        System.out.println(fatherNazar);
        System.out.println(matherValya);
        System.out.println(childMaria);
        System.out.println(petNika);

        /* створюю сім,ю */
        Family family = new Family(fatherNazar, matherValya);
        family.addChild(childMaria);
        System.out.println(family);


        Human fatherSasha = new Human("Sasha", "Gryn", 40, 90);
        Human motherHana = new Human("Hana", "Gryn", 36, Map.of("Вівторок", "Шопінг", "Четвер", "Зустріч з клієнтом", "Неділя", "Похід до Адвоката"));
        Human childSofia = new Human("Sofia", "Gryn", 4, Map.of("Понеділок", "Примірка сукні", "Середа", "Стоматолог", "Субота", "Відвідати бабусю", "Неділя", "Похід в театр"));
        Pet petPolly = new Pet(SpeisesHW6.CAT, "Polly", 2, 60, new HashSet<>(Arrays.asList("Муркотіти", "Пити молочко"))){ }; {

        };

        System.out.println(fatherSasha);
        System.out.println(motherHana);
        System.out.println(childSofia);
        System.out.println(petPolly);

        Family family2 = new Family(fatherSasha, motherHana);
        family2.addChild(childSofia);
        System.out.println(family2);

        Family family3 = new Family(fatherSasha, motherHana);
        family.addChild(childSofia);
        family.addChild(childMaria);
        System.out.println(family3);

        /* посилання */
        childMaria.setFamily(family);
        childMaria.setPet(petNika);

        childSofia.setFamily(family2);
        childSofia.setPet(petPolly);

        /* Методи */
        childMaria.greetPet();
        childMaria.describePet();
        childMaria.eatPet();

        childSofia.greetPet();
        childSofia.describePet();
        childSofia.eatPet();

    }
}

