package HW_8;

import java.util.*;


public class FamilyService {
    private FamilyDao familyDao;

    public FamilyService() { //конструктор
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies() { // получить список всех семей.
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {  //  вывести на экран все семьи (в индексированном списке) со всеми членами семьи.
        List<Family> families = familyDao.getAllFamilies();
        for (int i = 0; i < families.size(); i++) {
            System.out.println("Сім'я під номером " + i);
            System.out.println(families.get(i));
        }
    }
    public void getFamiliesBiggerThan(int count) {  //виводить всі сім'ї, де кількість членів сім'ї більше вказаної кількості count.
        List<Family> families = familyDao.getFamiliesBiggerThan(count);
        for (int i = 0; i < families.size(); i++) {
            System.out.println("Сім'я під номером " + i);
            System.out.println(families.get(i));
        }
    }
    public void getFamiliesLessThan(int count) {  //виводить всі сім'ї, де кількість членів сім'ї менше вказаної кількості count.
        List<Family> families = familyDao.getFamiliesLessThan(count);
        for (int i = 0; i < families.size(); i++) {
            System.out.println("Сім'я під номером " + i);
            System.out.println(families.get(i));
        }
    }

    public int countFamiliesWithMemberNumber(int number) {
        return familyDao.countFamiliesWithMemberNumber(number);
    } //  подсчитать число семей с количеством людей равное переданному числу.

    public void createNewFamily(Human father, Human mother) {
        Family family = new Family(father, mother);
        familyDao.saveFamily(family);
    }   // создать новую семью (принимает 2 параметра типа Human) - создает новую семью, сохраняет в БД.

    public void deleteFamilyByIndex(int index) {
        List<Family> families = familyDao.getAllFamilies();
        if (index >= 0 && index < families.size()) {
            Family family = familyDao.getFamilByIndex(index);
            if (familyDao.deleteFamily(index)) {
                System.out.println("Сім'я успішно видалена з бази даних.");
            } else {
                System.out.println("Не вдалося видалити сім'ю з бази даних.");
            }
        } else {
            System.out.println("Недійсний індекс.");
        }
    }

    public Family bornChild (Family family, String boyName, String girlName){
        Random random = new Random();
        int rand = random.nextInt(2);

        String childName;
        String childSurname = family.getFather().getSurname();

        if (rand == 0) {  //хлопчаче ім,я
            childName = boyName;
            System.out.println("Народився хлопчик. Його звати " + boyName);
        } else { // дівчаче ім,я
            childName = girlName;
            System.out.println("Народилась дівчинка. Її звати " + girlName);
        }

        Human child = new Human(childName, childSurname, 0, 0);
        family.addChild(child);
        familyDao.saveFamily(family);

        return family;
    }

    public Family adoptChild(Family family, Human child) { // всиновити
        family.addChild(child);
        familyDao.saveFamily(family);
        return family;
    }

    public void deleteAllChildrenOlderThen(int age) {
        List<Family> families = familyDao.getAllFamilies();
        for (Family family : families) {
            List<Human> children = family.getChildren();
            List<Human> newChildren = new ArrayList<>();
            for (Human child : children) {
                if (child.getYear() > age) {
                    continue;
                }
                newChildren.add(child);
            }
            family.setChildren(newChildren);
            familyDao.saveFamily(family);
        }
    }

    public int count() { // count - возвращает количество семей в БД.
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int id) { //принимает индекс семьи, возвращает Family по указанному индексу.
        return familyDao.getFamilByIndex(id);
    }

    public List<Pet> getPets(int familyIndex) { // принимает индекс семьи, возвращает список домашних животных, которые живут в семье.
        Family family = familyDao.getFamilByIndex(familyIndex);
        Set<Pet> petSet = (Set<Pet>) family.getPet();
        return new ArrayList<>(petSet);
    }

    public void addPet(int familyIndex, Pet pet) { // принимает индекс семьи и параметр Pet - добавляет нового питомца в семью, обновляет данные в БД.
        Family family = familyDao.getFamilByIndex(familyIndex);
        Set<Pet> pets = new HashSet<>((Collection) family.getPet());
        pets.add(pet);
        familyDao.saveFamily(family);
    }
}