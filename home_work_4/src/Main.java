import java.util.Objects;
public class Main {
    public static void main (String[] args) {

        Human fatherNazar = new Human("Nazar", "Vasylenko", 32, new String[][]{{"from Monday to Friday", "working"}, {"Saturday, Sunday", "time for family"}});
        Human matherValya = new Human("Valentyna", "Vasylenko", 28, 85);
        Human childMaria = new Human("Maria", "Vasylenko", 6, new String[][]{{"from Monday to Friday", "go to school"}, {"Saturday, Sunday", "relax"}});
        Pet petNika = new Pet("Dog", "Nika", 8, 100, new String[]{"eat", "sleep", "play"});

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
        Human motherHana = new Human("Hana", "Gryn", 36, new String[][]{{"Monday", "visit a doctor"}, {"Tuesday", "go to the restaurant"}});
        Human childSofia = new Human("Sofia", "Gryn", 4, new String[][]{{"Friday", "meet with granny"}, {"Wednesday", "go to kindergarten"}});
        Pet petPolly = new Pet("Cat", "Polly", 2, 60, new String[]{"sleep", "play"});

        System.out.println(fatherSasha);
        System.out.println(motherHana);
        System.out.println(childSofia);
        System.out.println(petPolly);

        Family family2 = new Family(fatherSasha, motherHana);
        family.addChild(childSofia);

        /* посилання */
        childMaria.setFamily(family);
        childMaria.setPet(petNika);

        childSofia.setFamily(family);
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

