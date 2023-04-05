package HW6;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    /*Опис класу Pet*/
    private SpeisesHW6 species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    /*Переопределите метод toString()*/
    @Override
    public String toString() {
        return "Pet{" +
                " species= " + species + " " +
                ", nickname= " + nickname + " " +
                ", age " + age + " " +
                ", trickLevel= " + trickLevel +
                ", habits= " + Arrays.toString(habits) +
                '}';
    }

    /*методи класу Pet*/
    public void eat() {
        System.out.println("Я їм!");
    }

    public abstract void respond();

    /* конструктор і значення вкладаю в клас Human*/

    /* пустий конструктор*/
    public Pet() {
    }

    public Pet(SpeisesHW6 species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    /* конструктор "описывающий все поля животного"*/
    public Pet(SpeisesHW6 species, String nickname, int age, int trickLevel, String[] habits) {
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

    public String[] getHabits() {
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

    public void setHabits(String[] habits) {
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
