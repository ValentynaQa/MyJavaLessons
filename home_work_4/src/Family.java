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

    public Human getFather(){
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
        return "Family{" + "mother=" + mother + ", father=" + father + ", children=" + ArraysChildren + '}';
    }

    /* Конструктор */
    public Family (Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family (Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family (Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family(){
    }

    /* Методи */

    public void addChild(Human child) {
        Human[] newChildren = new Human[children.length + 1];
        System.arraycopy(children, 0, newChildren, 0, children.length);
        newChildren[newChildren.length - 1] = child;
        child.setFamily(this);
        children = newChildren;
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        System.arraycopy(children, 0, newChildren, 0, index);
        System.arraycopy(children, index + 1, newChildren, index, children.length - index - 1);
        children = newChildren;
        return true;
    }

    public int countFamily() {
        return children.length + 2;
    }




    /*private void addChild (Human[] children) {
        this.children = children;
        } */

    /* Методи */
    /*@Override
    private void addChildren (Human[] children) {
        }
    public static String deleteChild () {
        return
    }*/


}
