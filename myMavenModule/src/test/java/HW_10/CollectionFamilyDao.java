package HW_10;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {

    // реалізація методу getAllFamilies:
    private List<Family> familyList = new ArrayList<>();
    @Override
    public List<Family> getAllFamilies() {
        List<Family> families = new ArrayList<>();
        for (Family family: familyList) {
            families.add(family);
        }
        return families;
    }

    @Override
    public Family getFamilByIndex(int index) {
        return null;
    }

    // реалізація методу  getFamilyByIndex
    @Override
    public Family getFamilyByIndex(int index) {
        if (index >= 0 && index < familyList.size()) {
            return familyList.get(index);
        } else {
            return null;
        }
    }

    // реалізація методу deleteFamily (принимает индекс)
    @Override
    public boolean deleteFamily(int index) {
        if (familyList.size() > index && index >= 0) {
            familyList.remove(index);
            return true;
        } else {
            return false;
        }
    }

    // реалізація методу deleteFamily(Family family)
    @Override
    public boolean deleteFamily1(Family family) {
        if (familyList.contains(family)) {
            familyList.remove(family);
            return true;
        } else {
            return false;
        }
    }

    // реалізація методу saveFamily (принимает тип Family)
    @Override
    public boolean saveFamily(Family family) {
        if (familyList.contains(family)) {
            int index = familyList.indexOf(family);
            familyList.set(index, family);
            return true;
        } else {
            familyList.add(family);
            return true;
        }
    }

    // реалізація методу getFamiliesLessThan
    @Override
    public List<Family> getFamiliesBiggerThan(int count) {
        List<Family> result = new ArrayList<>();
        for (Family family : familyList) {
            if(family.countFamily() > count) {
                result.add(family);
            }
        }
        return result;
    }

    // реалізація методу getFamiliesLessThan - найти семьи с количеством людей меньше чем выводит информацию на экран.
    @Override
    public List<Family> getFamiliesLessThan(int count) {
        List<Family> result = new ArrayList<>();
        for (Family family : familyList) {
            if (family.countFamily() < count) {
                result.add(family);
            }
        }
        return result;
    }

    // реалізація методу countFamiliesWithMemberNumber - подсчитать число семей с количеством людей равное переданному числу.
    @Override
    public int countFamiliesWithMemberNumber(int number) {
        int count = 0;
        for (Family family : familyList) {
            if (family.countFamily() == number) {
                count++;
            }
        }
        return count;
    }
}