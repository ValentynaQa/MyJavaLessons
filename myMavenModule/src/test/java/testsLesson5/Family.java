package testsLesson5;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private int ArraysChildren;

    /* геттери*/
    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
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

    public void setChildren(Human[] children) {
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
                ", " + ArraysChildren
                + '}';
    }

    /* Конструктор */
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family() {
    }

    /* Методи */

    public void addChild(Human child) {
        if (children == null) {
            children = new Human[1];
            children[0] = child;
        } else {
            Human[] newChildren = new Human[children.length + 1];
            System.arraycopy(children, 0, newChildren, 0, children.length);
            newChildren[newChildren.length - 1] = child;
            child.setFamily(this);
            children = newChildren;
        }
    }

    /*public void addChild(Human child) {
        if (children == null) {
            children = new Human[] { child };
        } else {
            Human[] newChildren = Arrays.copyOf(children, children.length + 1);
            newChildren[children.length] = child;
            child.setFamily(this);
            children = newChildren;
        }
    }*/

    public boolean deleteChild(Human child) {
        int childIndex = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                childIndex = i;
                break;
            }
        }
        if (childIndex == -1) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, k = 0; i < children.length; i++) {
            if (i != childIndex) {
                newChildren[k++] = children[i];
            }
        }
        children = newChildren;
        child.setFamily(null);
        return true;
    }

    public int countFamily() {
        return children.length + 2;
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
        if (children == null) {
            return 0;
        }
        return children.length;
    }

    public boolean deleteChild(int i) {
        if (i < 0 || i >= children.length) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        int k = 0;
        for (int j = 0; j < children.length; j++) {
            if (j != i) {
                newChildren[k++] = children[j];
            }
        }
        children = newChildren;
        return true;
    }

    public static class DeleteChild_intIndex_Test {
    }
}




