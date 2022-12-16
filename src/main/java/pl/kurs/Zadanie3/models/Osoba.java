package pl.kurs.Zadanie3.models;

public abstract class Osoba {

    private String imie;
    private String nazwisko;
    private String pesel;
    private String miasto;

    public Osoba(String imie, String nazwisko, String pesel, String miasto) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.miasto = miasto;
    }

    public String getPesel() {
        return pesel;
    }

    public abstract double getDochod();

    public Plec getPlec(String pesel) {
        int plecId = Integer.parseInt(String.valueOf(pesel.charAt(9)));
        return plecId % 2 == 0 ? Plec.KOBIETA : Plec.MEZCZYZNA;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", miasto='" + miasto + '\'';
    }
}
