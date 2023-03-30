import java.util.Objects;
public class Main {
    public static void main (String[] args) {

        String[][] schedule = new String[7][2];
        schedule[0][0] = DayOfWeek.MONDAY.name();
        schedule[0][1] = "Робота";
        schedule[1][0] = DayOfWeek.TUESDAY.name();
        schedule[1][1] = "Дитячий гурток";
        schedule[2][0] = DayOfWeek.WEDNESDAY.name();
        schedule[2][1] = "Спортивний зал";
        schedule[3][0] = DayOfWeek.THURSDAY.name();
        schedule[3][1] = "Похід до стоматолога";
        schedule[4][0] = DayOfWeek.FRIDAY.name();
        schedule[4][1] = "Похід в кіно";
        schedule[5][0] = DayOfWeek.SATURDAY.name();
        schedule[5][1] = "Сімейний день";
        schedule[6][0] = DayOfWeek.SUNDAY.name();
        schedule[6][1] = "Підготовка до нового тижня";

        String[][] schedule2 = new String[7][2];
        schedule[0][0] = DayOfWeek.MONDAY.name();
        schedule[0][1] = "Похід до лікаря";
        schedule[1][0] = DayOfWeek.TUESDAY.name();
        schedule[1][1] = "Танці";
        schedule[2][0] = DayOfWeek.WEDNESDAY.name();
        schedule[2][1] = "Піцца";
        schedule[3][0] = DayOfWeek.THURSDAY.name();
        schedule[3][1] = "Прибирання";
        schedule[4][0] = DayOfWeek.FRIDAY.name();
        schedule[4][1] = "Поїздка в парк";
        schedule[5][0] = DayOfWeek.SATURDAY.name();
        schedule[5][1] = "Сімейний день";
        schedule[6][0] = DayOfWeek.SUNDAY.name();
        schedule[6][1] = "Стрижка";



        Human fatherNazar = new Human("Nazar", "Vasylenko", 32, schedule);
                /*new String[][]{{"from Monday to Friday", "working"}, {"Saturday, Sunday", "time for family"}});*/
        Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
        Human childMaria = new Human("Maria", "Vasylenko", 6, schedule);
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
        Human motherHana = new Human("Hana", "Gryn", 36, schedule2);
        Human childSofia = new Human("Sofia", "Gryn", 4, schedule2);
        Pet petPolly = new Pet(Speises.CAT, "Polly", 2, 60, new String[]{"sleep", "play"});

        System.out.println(fatherSasha);
        System.out.println(motherHana);
        System.out.println(childSofia);
        System.out.println(petPolly);

        Family family2 = new Family(fatherSasha, motherHana);
        family.addChild(childSofia);
        System.out.println(family2);

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

