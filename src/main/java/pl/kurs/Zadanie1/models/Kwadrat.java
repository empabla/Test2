package pl.kurs.Zadanie1.models;

import java.util.Objects;

public class Kwadrat extends Figura {

    private int a;

    public Kwadrat(int a) {
        this.a = a;
    }

    public double obliczPole() {
        return a * a;
    }

    public double obliczObwod() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return super.toString() + "Kwadrat o boku " + a + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kwadrat kwadrat = (Kwadrat) o;
        return a == kwadrat.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
