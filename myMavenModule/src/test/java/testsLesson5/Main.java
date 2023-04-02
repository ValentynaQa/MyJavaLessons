package testsLesson5;

import testsLesson5.enums.DayOfWeek;
import testsLesson5.enums.Speises;

public class Main {
    public static void main (String[] args) {

        Human fatherNazar = new Human("Nazar", "Vasylenko", 32, new String[][]{{"З Понеділка по П'ятницю", "Робота"}, {"Субота", "Час для родини"}, {"Неділя", "Похід в кіно"}});
        Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
        Human childMaria = new Human("Maria", "Vasylenko", 6, new String[][]{{"Понідлок", "Акробатика"}, {"Середа", "Похід до лікаря"}, {"Субота", "Малювання"}});
        Pet petNika = new Pet(Speises.DOG, "Nika", 8, 100, new String[]{"eat", "sleep", "play"});

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
        Human motherHana = new Human("Hana", "Gryn", 36, new String[][]{{"Вівторок", "Шопінг"}, {"Четвер", "Зустріч з клієнтом"}, {"Неділя", "Похід до Адвоката"}});
        Human childSofia = new Human("Sofia", "Gryn", 4, new String[][]{{"Понеділок", "Примірка сукні"}, {"Середа", "Стоматолог"}, {"Субота", "Відвідати бабусю"}, {"Неділя", "Похід в театр"}});
        Pet petPolly = new Pet(Speises.CAT, "Polly", 2, 60, new String[]{"sleep", "play"});

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

