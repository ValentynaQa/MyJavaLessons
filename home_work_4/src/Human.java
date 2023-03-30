public class Human {
    /*Опис класу Human*/
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private String [][] schedule;
    private Family family;

    /*Переопределите метод toString()*/
    /*@Override
    public String toString() {
        return "Human " + "{" +
                "name=" + name +
                ", surname=" + surname +
                ", year=" + year +
                ", iq=" + iq +
                ", String [][] schedule=" + schedule[0][0] + " " + schedule[1][0] + " "+
                "}";
    }*/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Human{name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", year=").append(year);
        sb.append(", iq=").append(iq);
        sb.append(", pet=").append(pet);
        sb.append(", schedule=");
        if (schedule == null) {
            sb.append("null");
        } else {
            sb.append('[');
            for (int i = 0; i < schedule.length; i++) {
                sb.append('[');
                for (int j = 0; j < schedule[i].length; j++) {
                    sb.append(schedule[i][j]);
                    if (j < schedule[i].length - 1) sb.append(", ");
                }
                sb.append(']');
                if (i < schedule.length - 1) sb.append(", ");
            }
            sb.append(']');
        }
        sb.append(", family=").append(family);
        sb.append('}');
        return sb.toString();
    }

    public void greetPet () {
        System.out.println("Привіт, " + pet.getNickname());
    }

    public void describePet () {
        System.out.println("У мене є " + pet.getSpecies() + "йому " + pet.getAge() + " років" +"він " + pet.getHabits());
    }

    public void eatPet () {
        System.out.println(pet.getNickname() + ", іди їсти!");
    }

    /* конструктори*/
    public Human (String name, String surname, int year, int iq){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Human (String name, String surname, int year, String [][] schedule){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.schedule = schedule;
    }

    public Human (String name, String surname, int year, String [][] schedule, Family family){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.schedule = schedule;
        this.family = family;
    }

    public Human() {
    }

    /* геттери*/
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public Family getFamily() {
        return family;
    }

    /* Сеттери */
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Human)) {
            return false;
        }
        Human human = (Human) obj;
        return this.name.equals(human.getName()) &&
                this.surname.equals(human.getSurname()) &&
                this.iq == human.getIq();
    }

    @Override
    protected void finalize () {
        System.out.println("УВАГА! Видалення об'єкту - " + this);
    }
}
