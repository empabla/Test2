package pl.kurs.Zadanie3.models;

public class Pracownik extends Osoba {

    private String stanowisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, String pesel, String miasto, String stanowisko, double pensja) {
        super(imie, nazwisko, pesel, miasto);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public double getDochod() {
        return pensja;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", stanowisko='" + stanowisko + '\'' +
                ", pensja=" + pensja;
    }

}
