package pl.kurs.Zadanie2;

public class Runner {
    public static void main(String[] args) {

//        konkatenacja Strinów
        long start1 = System.nanoTime();
        String str1 = "";
        for (int i = 0; i < 10_000; i++) {
            str1 = str1 + i + " ";
        }
        long stop1 = System.nanoTime();

//        konkatenacja przy użyciu StringBuildera
        long start2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10_000; i++) {
            sb.append(i).append(" ");
        }
        String str2 = sb.toString();
        long stop2 = System.nanoTime();

//        czas trwania konkatenacji Stringow
        long r1 = stop1 - start1;
//        czas trwania konkatenacji przy użyciu StringBuildera
        long r2 = stop2 - start2;

//        stosunek r1/r2
        System.out.println("ratio: " + (((double) r1) / r2));

//        Konkatenacja za pomocą StringBuildera jest szybsza, ponieważ polega ona na modyfikowaniu istniejącego
//        ciągu znaków bez konieczności tworzenia nowego obiektu (dzięki temu, że StringBuilder jest klasą mutowalną).
//        W przypadku konkatenacji Stringów każde połączenie dwóch lub więcej Stringów tworzy nowy obiekt
//        (String jest niemutowalny), co powoduje większe obciążenie dla systemu i spowalnia działanie programu.

    }
}