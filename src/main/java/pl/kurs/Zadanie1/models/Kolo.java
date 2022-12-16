package pl.kurs.Zadanie1.models;

import java.util.Objects;

public class Kolo extends Figura {

    private int r;

    public Kolo(int r) {
        super();
        this.r = r;
    }

    public double obliczPole() {
        return Math.round(Math.PI * r * r * 100.00) / 100.00;
    }

    public double obliczObwod() {
        return Math.round(2 * Math.PI * r * 100.00) / 100.00;
    }

    @Override
    public String toString() {
        return super.toString() + "Kolo o promieniu " + r + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kolo kolo = (Kolo) o;
        return r == kolo.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }


}
