package HW6;

public class Dog extends Pet implements FoulMethod {

    //конструктор підкласу

    public Dog(SpeisesHW6 species, String nickname) {
        super(species, nickname);
    }

    /* конструктор "описывающий все поля животного"*/
    public Dog(SpeisesHW6 species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }
    @Override
    public void respond() {
        System.out.println("Привіт, господаре. Я " + getNickname() + ". Я скучив!");
    }

    @Override
    public void foul() {
        System.out.println("Потрібно добре замести сліди...");
    }
}
