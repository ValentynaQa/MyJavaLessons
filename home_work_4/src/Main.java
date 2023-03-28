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
    /*public static void main(String[] args) {
        // Создаем несколько семей
        Human father1 = new Human("John", "Doe", 1975, new String[][]{{"Monday", "go to work"}, {"Tuesday", "go to work"}});
        Human mother1 = new Human("Jane", "Doe", 1978);
        Human child1 = new Human("Billy", "Doe", 2005, new String[][]{{"Monday", "go to school"}, {"Tuesday", "go to school"}});
        Pet pet1 = new Pet("Dog", "Rex", 3, 75, new String[]{"eat", "sleep", "play"});

        Human father2 = new Human("Mike", "Smith", 1980);
        Human mother2 = new Human("Lisa", "Smith", 1982, new String[][]{{"Monday", "go to work"}, {"Tuesday", "go to work"}});
        Human child2 = new Human("Tom", "Smith", 2008, new String[][]{{"Monday", "go to school"}, {"Tuesday", "go to school"}});
        Pet pet2 = new Pet("Cat", "Fluffy", 2, 60, new String[]{"sleep", "play"});

        // Выводим информацию о каждом человеке
        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(child1);
        System.out.println(father2);
        System.out.println(mother2);
        System.out.println(child2);

        // Создаем семью
        Family family = new Family(father1, mother1);
        family.addChild(child1);

        // Присваиваем ссылки
        child1.setFamily(family);
        child1.setPet(pet1);

        // Вызываем методы у ребенка и его питомца
        child1.greetPet();
        child1.describePet();
        child1.eatPet();
        System.out.println(child1.toString());
        System.out.println(pet1.toString());
    }
}*/
