import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        byte liczbaByte = 127;
        short liczbaShort = 32767;
        int liczbaInt = 2147483647;
        long liczbaLong = 92233725;
        float liczbaFloat = 666.6f;
        double liczbaDouble = 124455.56789;
        boolean wartoscBoolean = true;
        char wartoscChar = 'h';
        String wartoscString = "Jakis ciag znakow.";
        System.out.println(liczbaByte);
        System.out.println(liczbaShort);
        System.out.println(liczbaInt);
        System.out.println(liczbaLong);
        System.out.println(liczbaFloat);
        System.out.println(wartoscBoolean);
        System.out.println(wartoscChar);
        System.out.println(wartoscString);

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
        liczbaX = 1.2;
        liczbaY = 4.2;
        System.out.println("Suma " + liczbaA + " i " + liczbaB + " to " + (liczbaA+liczbaB));
        System.out.println("Roźnica " + liczbaA + " i " + liczbaB + " to " + (liczbaA-liczbaB));
        System.out.println("Iloczyn " + liczbaA + " i " + liczbaB + " to " + (liczbaA*liczbaB));
        System.out.println("Iloraz " + liczbaA + " i " + liczbaB + " to " + (liczbaA/liczbaB));
        System.out.println("Suma " + liczbaX + " i " + liczbaY + " to " + (liczbaX+liczbaY));
        System.out.println("Roznica " + liczbaX + " i " + liczbaY + " to " + (liczbaX-liczbaY));
        System.out.println("Iloczyn " + liczbaX + " i " + liczbaY + " to " + (liczbaX*liczbaY));
        System.out.println("Iloraz " + liczbaX + " i " + liczbaY + " to " + (liczbaX/liczbaY));

    }
}
