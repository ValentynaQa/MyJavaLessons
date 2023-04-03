package testsLesson5;

import testsLesson5.enumsHW5.Speises;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    /*Опис класу Pet*/
    private Speises species;
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
    private void eat() {
        System.out.println("Я їм!");
    }

    private void respond() {
        System.out.println("Привіт, господаре. Я" + nickname + ". Я скучив!");
    }

    private void foul() {
        System.out.println("Потрібно добре замести сліди...");
    }

    /* конструктор і значення вкладаю в класHuman*/
    public Pet(Speises species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    /* конструктор "описывающий все поля животного"*/
    public Pet(Speises species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    /* пустий конструктор*/
    public Pet() {
    }

    /* геттери*/
    public Speises getSpecies() {
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
    public void setSpecies(Speises species) {
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
    protected void finalize () {
        System.out.println("УВАГА! Видалення об'єкту - " + this);
    }
}
