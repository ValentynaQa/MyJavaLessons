package HW_9;

import HW_8.Family;
import HW_8.Pet;

import java.text.ParseException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import java.util.Map;


public class Human {
    /*Опис класу Human*/
    private String name;
    private String surname;
    private long birthDate;
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
                ", date of birth=" + LocalDate.ofEpochDay(birthDate).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + // змінено в ДЗ9
                ", iq=" + iq +
                ", schedule=" + scheduleStr +
                '}';
    }

// Додано в ДЗ9
    public String describeAge() {
        LocalDate birthDate = LocalDate.ofEpochDay(this.birthDate);
        LocalDate now = LocalDate.now();
        Period age = Period.between(birthDate, now);
        return age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days";
    }

    // Додано в ДЗ 9 конструктор

    public Human(String name, String surname, String birthDate, int iq){
        this.name = name;
        this.surname = surname;
        this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")).toEpochDay();
        this.iq = iq;
    }
    /*public Human(String name, String surname, long birthDate, int iq) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDate  = birthDate;
        this.iq = iq;
    }*/

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

    public Human(String name, String surname, long birthDate, Map<String, String> schedule) throws ParseException { /*HW7 */
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate ;
        this.schedule = schedule;
    }

    public Human(String name, String surname, long birthDate, Map<String, String> schedule, Family family) throws ParseException { /* HW 7 */
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.schedule = schedule;
        this.family = family;
    }

    public Human() throws ParseException {
    }

    /* геттери*/
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getBirthDate() {
        return birthDate;
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

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
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
