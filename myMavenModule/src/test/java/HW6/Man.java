package HW6;

public final class Man extends Human{

    //конструктор підкласу

    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Man(String name, String surname, int year, String[][] schedule) {
        super(name, surname, year, schedule);
    }

    public Man(String name, String surname, int year, String[][] schedule, Family family) {
        super(name, surname, year, schedule, family);
    }
    public void greetPet() {
        System.out.println("Вітаю тебе, " + this.getPet().getNickname() + " !");
    }

    public void repairCar() {
        System.out.println("Я ремонтую авто.");
    }

}
