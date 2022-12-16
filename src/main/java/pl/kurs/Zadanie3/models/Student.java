package pl.kurs.Zadanie3.models;

public class Student extends Osoba {

    private String grupa;
    private double stypendium;

    public Student(String imie, String nazwisko, String pesel, String miasto, String grupa, double stypendium) {
        super(imie, nazwisko, pesel, miasto);
        this.grupa = grupa;
        this.stypendium = stypendium;
    }

    public double getDochod() {
        return stypendium;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", grupa='" + grupa + '\'' +
                ", stypendium=" + stypendium;
    }
}
