package pl.kurs.Zadanie1.models;

import java.util.Objects;

public class Prostokat extends Figura {

    private int a;
    private int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double obliczPole() {
        return a * b;
    }

    public double obliczObwod() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return super.toString() + "Prostokat o bokach " + a + "x" + b + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prostokat prostokat = (Prostokat) o;
        return a == prostokat.a && b == prostokat.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
