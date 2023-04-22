package HW_10;

import java.util.List;


public interface FamilyDao {

    // реалізація цих методів в класі Family (записані в самому кінці коду)
    List<Family> getAllFamilies();


    Family getFamilByIndex(int index);


    // реалізація методу  getFamilyByIndex
    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);


    boolean deleteFamily1(Family family);


    boolean saveFamily(Family family);


    List<Family> getFamiliesBiggerThan(int count);


    List<Family> getFamiliesLessThan(int count);


    // реалізація методу countFamiliesWithMemberNumber - подсчитать число семей с количеством людей равное переданному числу.
    int countFamiliesWithMemberNumber(int number);

}
