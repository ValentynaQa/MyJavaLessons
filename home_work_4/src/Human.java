public class Human extends Pet {
    /*Опис класу Human*/
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String [][] schedule;

    /*Переопределите метод toString()*/
    public String toString(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String [][] schedule) {
        return "Human " + "{" + name + '\'' + surname + '\'' + year + iq + mother + father + pet.getSpecies() + "{" + pet.getNickname() + '\'' + pet.getAge() + pet.getTrickLevel() + pet.getHabits() + "}}";
    }
    private void greetPet () {
        System.out.println("Привіт, " + pet.getNickname());
    }
    private void describePet () {
        System.out.println("У мене є " + pet.getSpecies() + "йому " + pet.getAge() + " років" +"він " + pet.getHabits());
    }

    /* конструктори*/
    public Human (String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public Human (String name, String surname, int year, Human mother, Human father){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }
    public Human (String name, String surname, int year, Human mother, Human father, String [][] schedule){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }
    public Human() {
    }
    /* геттери*/
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getYear() {
        return year;
    }
    public int getIq() {
        return iq;
    }
    public Pet getPet() {
        return pet;
    }
    public Human getMother() {
        return mother;
    }
    public Human getFather() {
        return father;
    }
    public String[][] getSchedule() {
        return schedule;
    }
    /* Сеттери */
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
}
