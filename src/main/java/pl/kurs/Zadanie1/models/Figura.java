package pl.kurs.Zadanie1.models;

import pl.kurs.Zadanie1.exceptions.NieprawidlowaWartoscArgumentuException;

public abstract class Figura {
    private static int licznik = 0;
    private int idFigury;

    public Figura() {
        idFigury = ++licznik;
    }

    public static Kwadrat stworzKwadrat(int a) {
        if (a <= 0)
            throw new NieprawidlowaWartoscArgumentuException("Bok kwadratu musi byc liczba dodatnia!");
        else
            return new Kwadrat(a);
    }

    public static Prostokat stworzProstokat(int a, int b) {
        if (a <= 0 || b <= 0)
            throw new NieprawidlowaWartoscArgumentuException("Bok prostokata musi byc liczba dodatnia!");
        else
            return new Prostokat(a, b);
    }

    public static Kolo stworzKolo(int r) {
        if (r <= 0)
            throw new NieprawidlowaWartoscArgumentuException("Promien kola musi byc liczba dodatnia!");
        else
            return new Kolo(r);
    }

    public abstract double obliczPole();

    public abstract double obliczObwod();

    @Override
    public String toString() {
        return "Figura nr " + idFigury + ": ";
    }
}
