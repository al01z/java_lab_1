import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        int liczbaA,liczbaB;
        double liczbaX, liczbaY;
        liczbaA = 4;
        liczbaB = 2;
        System.out.format("Suma %d i %d to %d. ", liczbaA , liczbaB, (liczbaA+liczbaB));
        System.out.format("Roźnica %d i %d to %d. ", liczbaA, liczbaB , (liczbaA-liczbaB));
        System.out.format("Iloczyn %d i %d to %d. ", liczbaA, liczbaB, (liczbaA*liczbaB));
        System.out.format("Iloraz %d i %d to %d. ", liczbaA, liczbaB, (liczbaA/liczbaB));




    }
}
