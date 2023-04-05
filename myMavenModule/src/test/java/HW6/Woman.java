package HW6;

public final class Woman extends Human{

    //конструктор підкласу
    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Woman(String name, String surname, int year, String[][] schedule) {
        super(name, surname, year, schedule);
    }

    public Woman(String name, String surname, int year, String[][] schedule, Family family) {
        super(name, surname, year, schedule, family);
    }
    public void greetPet() {
        System.out.println("Привіт, " + this.getPet().getNickname() + "моя маленька!");
    }

    public void makeup () {
        System.out.println("Я фарбуюсь.");
    }

}
