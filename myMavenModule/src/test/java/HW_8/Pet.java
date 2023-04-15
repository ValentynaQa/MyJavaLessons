package HW_8;

import HW6.SpeisesHW6;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pet {
    /*Опис класу Pet*/
    private SpeisesHW6 species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;

    public static void main (String[] args) {
        Set<String> habits = new HashSet<>();
        habits.add("Їсти");
        habits.add("Спати");
        habits.add("Гратися");
    }
    public void respond() {

    }

    /*Переопределите метод toString()*/
    @Override
    public String toString() {
        return "Pet {" +
                "species= " + species +
                ", nickname= " + nickname +
                ", age " + age +
                ", trickLevel= " + trickLevel +
                ", habits= " + habits.toString() + /* HW-7 */
                '}';
    }

    /* Перечисляю habits тварини */

    /*методи класу Pet*/
    public void eat() {
        System.out.println("Я їм!");
    }

    /* конструктор і значення вкладаю в клас Human*/

    /* пустий конструктор*/
    public Pet() {
    }

    public Pet(SpeisesHW6 species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    /* конструктор "описывающий все поля животного"*/
    public Pet(SpeisesHW6 species, String nickname, int age, int trickLevel, Set<String> habits) { /* HW-7 */
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    /* геттери*/
    public SpeisesHW6 getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public Set<String> getHabits() {  /* HW-7 */
        return habits;
    }

    /* Сеттери */
    public void setSpecies(SpeisesHW6 species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pet pet = (Pet) obj;
        return Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname);
    }

    @Override
    protected void finalize() {
        System.out.println("УВАГА! Видалення об'єкту - " + this);
    }
}
