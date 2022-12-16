package pl.kurs.Zadanie1.app;

import pl.kurs.Zadanie1.models.Figura;

public class Runner {
    public static void main(String[] args) {

//        a)
        Figura[] figury = {Figura.stworzKwadrat(10), Figura.stworzKolo(10),
                Figura.stworzProstokat(10, 20), Figura.stworzKwadrat(15)};
        for (Figura f : figury) {
            System.out.println(f);
        }
        System.out.println();

//        b)
        znajdzFigureONajwiekszymPolu(figury);
        znajdzFigureONajwiekszymObwodzie(figury);
        System.out.println();

//        c)
        for (Figura f : figury) {
            if (f.equals(Figura.stworzProstokat(10, 20))) {
                System.out.println("tu powinno wejsc");
            }
        }
        System.out.println();

//        e)
        Figura[] figury2 = {Figura.stworzKwadrat(5), Figura.stworzKolo(-5),
                Figura.stworzProstokat(5, 10)};
        for (Figura f : figury2) {
            System.out.println(f);
        }

    }

    public static void znajdzFigureONajwiekszymObwodzie(Figura[] figury) {
        Figura figuraONajwiekszymObwodzie = figury[0];
        for (Figura f : figury)
            if (f != null)
                if (f.obliczObwod() > figuraONajwiekszymObwodzie.obliczObwod())
                    figuraONajwiekszymObwodzie = f;
        System.out.println("Figura o najwiekszym obwodzie to: " + figuraONajwiekszymObwodzie);
    }

    public static void znajdzFigureONajwiekszymPolu(Figura[] figury) {
        Figura figuraONajwiekszymPolu = figury[0];
        for (Figura f : figury)
            if (f != null)
                if (f.obliczPole() > figuraONajwiekszymPolu.obliczPole())
                    figuraONajwiekszymPolu = f;
        System.out.println("Figura o najwiekszym polu to: " + figuraONajwiekszymPolu);
    }


}
