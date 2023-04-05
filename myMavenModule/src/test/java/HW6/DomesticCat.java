package HW6;

public class DomesticCat extends Pet implements FoulMethod {

    public DomesticCat(SpeisesHW6 species, String nickname) {
        super(species, nickname);
    }
    @Override
    public void respond() {
        System.out.println("Міу... Вітаю. Я" + getNickname() + ". Я люблю ласку!");
    }

    @Override
    public void foul() {
        System.out.println("Міу... приберіть за мною=)");
    }
}
