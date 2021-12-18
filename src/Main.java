import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        String imie = scan.next();
        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();
        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();
        System.out.print("Podaj numer indeksu: ");
        int numerIndeksu = scan.nextInt();
        System.out.printf("Twoje imie i nazwisko to: %s %s. Twoj wiek to %d. Twoj numer indeksu to %d \n", imie, nazwisko, wiek, numerIndeksu);
        System.out.println("Twoje imie i nazwisko to:" + imie + " " + nazwisko + ". Twoj wiek to " + wiek + ". Twoj numer indeksu to " + numerIndeksu + "\n");
        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */
        System.out.print("Podaj liczbe pierwsza: ");
        int liczbaA = scan.nextInt();
        System.out.print("Podaj liczbe druga: ");
        int liczbaB = scan.nextInt();
        System.out.println("Suma " + liczbaA + " i " + liczbaB + " to " + (liczbaA+liczbaB));
        System.out.println("Roznica " + liczbaA + " i " + liczbaB + " to " + (liczbaA-liczbaB));
        System.out.println("Iloczyn " + liczbaA + " i " + liczbaB + " to " + (liczbaA*liczbaB));
        System.out.println("Iloraz " + liczbaA + " i " + liczbaB + " to " + (liczbaA/liczbaB));
        System.out.println("Reszta z dzielenia " + liczbaA + " i " + liczbaB + " to " + (liczbaA%liczbaB));


    }
}