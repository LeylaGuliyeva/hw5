public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String schedule[][];
    private Family family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString(){
        return "Human{name='" + this.name + "', surname='" + this.surname + "', year=" + this.year + ", iq=" + this.iq +"}";
    }


    Human() {

    }
    Human(String nm, String snm, int yr) {
        this.name = nm;
        this.surname = snm;
        this.year = yr;
    }

    Human(String nm, String snm, int yr, byte iq,String sdle[][],Family fam) {
        this.name = nm;
        this.surname = snm;
        this.year = yr;
        this.iq=iq;
        this.schedule=sdle;
        this.family=fam;
    }


}
