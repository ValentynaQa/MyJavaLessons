package HW_8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface FamilyDao {

    // реалізація цих методів в класі Family (записані в самому кінці коду)
    List<Family> getAllFamilies();


    Family getFamilByIndex(int index);


    boolean deleteFamily(int index);


    boolean deleteFamily1(Family family);


    boolean saveFamily(Family family);


    List<Family> getFamiliesBiggerThan(int count);


    List<Family> getFamiliesLessThan(int count);


    // реалізація методу countFamiliesWithMemberNumber - подсчитать число семей с количеством людей равное переданному числу.
    int countFamiliesWithMemberNumber(int number);



}
