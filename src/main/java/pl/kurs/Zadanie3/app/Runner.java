package pl.kurs.Zadanie3.app;

import pl.kurs.Zadanie3.models.Osoba;
import pl.kurs.Zadanie3.models.Plec;
import pl.kurs.Zadanie3.models.Pracownik;
import pl.kurs.Zadanie3.models.Student;

public class Runner {
    public static void main(String[] args) {

        Student student1 = new Student("Adam", "Nowak", "96042749335", "Poznan",
                "10", 10_000);
        Student student2 = new Student("Anna", "Nowicka", "98040289247", "Wroclaw",
                "5", 1_000);
        Student student3 = new Student("Tomasz", "Norek", "98091644858", "Krakow",
                "6", 1_500);
        Student student4 = new Student("Kaja", "Ucho", "97010956269", "Warszawa",
                "11", 2_200);
        Student student5 = new Student("Maciej", "Lipski", "97261367698", "Wroclaw",
                "5", 3_000);
        Student student6 = new Student("Agnieszka", "Kot", "95111494981", "Krakow",
                "6", 500);
        Student student7 = new Student("Konrad", "Burek", "98052841937", "Poznan",
                "11", 1_300);
        Pracownik pracownik1 = new Pracownik("Filip", "Mysiak", "75082595254", "Poznan",
                "Wykladowca", 7_500);
        Pracownik pracownik2 = new Pracownik("Bartosz", "Robak", "60020862897", "Gdansk",
                "Wozny", 6_000);
        Pracownik pracownik3 = new Pracownik("Tymon", "Michalski", "86112435831", "Gdansk",
                "Profesor", 10_000);
        Pracownik pracownik4 = new Pracownik("Agata", "Nosowska", "73062792327", "Wroclaw",
                "Sekretarka", 6_000);
        Pracownik pracownik5 = new Pracownik("Helena", "Potocka", "86041413568", "Warszawa",
                "Sprzataczka", 4_500);
        Pracownik pracownik6 = new Pracownik("Maria", "Galek", "82051268321", "Warszawa",
                "Wykladowca", 7_000);
        Pracownik pracownik7 = new Pracownik("Krystyna", "Dul", "69020841527", "Poznan",
                "Sprzedawca w sklepiku", 4_500);
        Pracownik pracownik8 = new Pracownik("Mela", "Nowacka", "75302541345", "Krakow",
                "Profesor", 10_000);


        Osoba[] osoby = {student1, student2, student3, student4, student5, student6, student7, student7,
                pracownik1, pracownik2, pracownik3, pracownik4, pracownik5, pracownik6, pracownik7, pracownik8};

        System.out.println("Osoby z najwiekszym dochodem:");
        znajdzOsobeZNajwiekszymDochodem(osoby);
        System.out.println();

        System.out.println("Liczba kobiet = " + getLiczbaKobiet(osoby));

    }

    //osoba z najwiekszym dochodem
    public static void znajdzOsobeZNajwiekszymDochodem(Osoba[] osoby) {
        for (Osoba o : osoby)
            if (o != null)
                if (o.getDochod() == getMaxDochod(osoby))
                    System.out.println(o);
    }

    private static double getMaxDochod(Osoba[] osoby) {
        double maxDochod = osoby[0].getDochod();
        for (Osoba o : osoby)
            if (o.getDochod() > maxDochod)
                maxDochod = o.getDochod();
        return maxDochod;
    }

    //liczba kobiet
    public static int getLiczbaKobiet(Osoba[] osoby) {
        int liczbaKobiet = 0;
        for (Osoba o : osoby)
            if (o != null)
                if (o.getPlec(o.getPesel()) == Plec.KOBIETA)
                    liczbaKobiet++;
        return liczbaKobiet;
    }

}
