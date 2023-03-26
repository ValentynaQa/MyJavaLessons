public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

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
}
