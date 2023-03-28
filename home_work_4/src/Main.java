public class Main {
    public static void main (String[] args) {
        Human fatherNazar = new Human("Nazar, ", "Vasylenko, ", 32, new String[][]{{"from Monday to Friday", "working"}, {"Saturday, Sunday", "time for family"}});
        Human matherValya = new Human("Valentyna ", "Vasylenko ", 28, 85);
        Human childMaria = new Human("Maria, ", "Vasylenko ,", 6, new String[][]{{"from Monday to Friday", "go to school"}, {"Saturday, Sunday", "relax"}});
        Pet petNika = new Pet("Dog" , "Nika, ", 8, 100, new String[]{"eat", "sleep", "play"});

        /* виводжу членів сім,ї */
        System.out.println(fatherNazar);
        System.out.println(matherValya);
        System.out.println(childMaria);
        System.out.println(petNika);

        /* створюю сім,ю */


    }
}

