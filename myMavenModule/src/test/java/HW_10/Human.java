package HW_10;

import HW_8.Pet;

import java.util.Map;


public class Human {
    /*Опис класу Human*/
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Map<String, String> schedule;
    private Family family;

    
    @Override
    public String toString() {
        String scheduleStr = (schedule != null) ? schedule.toString() : "No schedule";
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + scheduleStr +
                '}';
    }


    public void greetPet () {
        System.out.println("Привіт, " + pet.getNickname());
    }

    public void describePet () {
        String habitsStr = String.join(", ", pet.getHabits());
        System.out.println("У мене є " + pet.getSpecies() + "йому " + pet.getAge() + " " + " років " +" він " + habitsStr + ".");
    }

    public void eatPet () {
        System.out.println(pet.getNickname() + ", іди їсти!");
    }

    /* конструктори*/
    public Human(String name, String surname, int year, int iq){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Human(String name, String surname, int year, Map<String, String> schedule){ /*HW7 */
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, Map<String, String> schedule, Family family){ /* HW 7 */
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.schedule = schedule;
        this.family = family;
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

    public Map<String, String> GetSchedule() {
        return schedule;
    }

    public Family getFamily() {
        return family;
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

    public void setFamily(Family family) {
        this.family = family;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Human)) {
            return false;
        }
        Human human = (Human) obj;
        return this.name.equals(human.getName()) &&
                this.surname.equals(human.getSurname()) &&
                this.iq == human.getIq();
    }

    @Override
    protected void finalize () {
        System.out.println("УВАГА! Видалення об'єкту - " + this);
    }
}
