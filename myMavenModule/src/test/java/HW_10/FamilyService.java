package HW_10;

import HW_8.Pet;

import java.util.*;
import java.util.stream.Collectors;


public class FamilyService {
    private FamilyDao familyDao;

    public FamilyService() {
        this.familyDao = new CollectionFamilyDao();
    }

    public List<Family> getAllFamilies() { // отримати список всіх сімей
        return familyDao.getAllFamilies();
    }

    public List<Family> displayAllFamilies() { // вивести на екран список всіх сімей
        List<Family> families = familyDao.getAllFamilies();
        families.forEach(System.out::println);
        return families;
    }
    public List<Family> getFamiliesBiggerThan(int count) { // отримати список сімей, де кількість членів більше count
        return familyDao.getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() > count)
                .collect(Collectors.toList());
    }
    public List<Family> getFamiliesLessThan(int count) { // отримати список сімей, де кількість членів менше count
        return familyDao.getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() < count)
                .collect(Collectors.toList());
    }

    public long countFamiliesWithMemberNumber(long number) { // підрахувати кількість сімей з кількістю членів, що дорівнює number
        return familyDao.getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() == number)
                .count();
    }

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

    public Family bornChild(Family family, String boyName, String girlName) {
        String childName;
        String childSurname = family.getFather().getSurname();

        Random random = new Random();
        int rand = random.nextInt(2);

        if (rand == 0) {
            childName = boyName;
            System.out.println("Народився хлопчик. Його звати " + boyName);
        } else {
            childName = girlName;
            System.out.println("Народилась дівчинка. Її звати " + girlName);
        }

        if (family.getChildren() == null) {
            family.setChildren(new ArrayList<>());
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

    public void deleteAllFamilies() {
    }

    public void createNewFamily(Family family3) {
    }

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }
}