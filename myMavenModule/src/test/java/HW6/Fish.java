package HW6;

public class Fish extends Pet {

    public Fish(SpeisesHW6 species, String nickname) {
        super(species, nickname);
    }

    /* конструктор "описывающий все поля животного"*/
    public Fish(SpeisesHW6 species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }
    @Override
    public void respond() {
        System.out.println("Я" + getNickname() + ". Я завжди мовчу");
    }
}
