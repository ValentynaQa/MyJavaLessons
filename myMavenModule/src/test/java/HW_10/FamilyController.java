package HW_10;

import java.util.List;

public class FamilyController {
    private final FamilyService familyService;


    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int count) {
        familyService.getFamiliesBiggerThan(count);
    }

    public void getFamiliesLessThan(int count) {
        familyService.getFamiliesLessThan(count);
    }

    public int countFamiliesWithMemberNumber(long number) {
        return (int) familyService.countFamiliesWithMemberNumber(number);
    }

    public void createNewFamily(Human father, Human mother, Human childS) {
        familyService.createNewFamily(father, mother);
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family, String boyName, String girlName) {
        return familyService.bornChild(family, boyName, girlName);
    }

    public Family adoptChild(Family family, Human child) {
        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThen(int age) {
        familyService.deleteAllChildrenOlderThen(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int id) {
        return familyService.getFamilyById(id);
    }
}
