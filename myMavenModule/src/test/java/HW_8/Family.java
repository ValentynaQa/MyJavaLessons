package HW_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Family { /*тут не впевнена */
    private Human mother;
    private Human father;
    private List<Human> children;
    private Pet pet;

    /* геттери*/
    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    /* Сеттери */

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    @Override
    public String toString() {
        return "Family{" +
                mother +
                ", " + father +
                ", " + children +
                + '}';
    }

    /* Конструктор */
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, List<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(Human mother, Human father, List<Human> children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family() {
    }

    /* Методи */
    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);
    }
    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.size()) { // перевірка дійсності індексу
            return false; // повернути false, якщо індекс не дійсний
        }
        Human child = children.remove(index); // видалити дитину зі списку за індексом
        if (child != null) { // перевірка, чи був видалений елемент
            child.setFamily(null); // встановити null посилання на сім'ю для видаленої дитини
            return true; // повернути true, якщо видалення було успішним
        }
        return false; // повернути false, якщо елемент не був видалений з будь-якої причини
    }

    public boolean deleteChild(Human child) {
        if (children == null || !children.contains(child)) {
            return false;
        }
        children.remove(child);
        child.setFamily(null);
        return true;
    }

    public int countFamily() {
        return children.size() + 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Family family = (Family) obj;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father);
    }

    @Override
    protected void finalize() {
        System.out.println("УВАГА! Видалення об'єкту - " + this);
    }

    public int getChildrenNumber() {
        return 0;
    }

    /*public boolean deleteChild(int i) {
        if (i < 0 || i >= children.size()) {
            return false;
        }
        Human child = children.remove(i);
        child.setFamily(null);
        return true;
    }*/

    public static class DeleteChild_intIndex_Test {
    }

    /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    МЕТОДИ ДЛЯ ДЗ

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

    // реалізація методу  getFamilyByIndex
    @Override
    public Family getFamilByIndex (int index) {
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
    }*/

}




