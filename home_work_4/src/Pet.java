public class Pet {
    /*Опис класу Pet*/
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    /*Переопределите метод toString()*/
    @Override
    public String toString() {
        return species + "{" + nickname + '\'' + age + trickLevel + habits + "}";
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
    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    /* конструктор "описывающий все поля животного"*/
    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
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
    public String getSpecies() {
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
    public void setSpecies(String species) {
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
}
