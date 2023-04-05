package HW6;

public class RoboCat extends Pet {
    public RoboCat(SpeisesHW6 species, String nickname) {
        super(species, nickname);
    }

    /* конструктор "описывающий все поля животного"*/
    public RoboCat(SpeisesHW6 species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }
    @Override
    public void respond() {
        System.out.println("Доброго дня. Я" + getNickname() + ". Я зроблю все, що ти скажеш!");
    }
}
