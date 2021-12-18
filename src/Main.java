import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();
        if ((wiek%3)==0) {
            System.out.println("Podzielny przez 3");
        } else {
            System.out.println("Niepodzielny przez 3");
        }


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        System.out.print("Podaj numer indeksu: ");
        int numerIndeksu = scan.nextInt();
        String wynik = ((numerIndeksu%2)==0 ? "Parzysty" : "Nieparzysty");
        System.out.println("Twoj numer indeksu jest: " + wynik);


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        System.out.print("Podaj liczbe zmienno przecinkowa: ");
        double liczbaZmiennoprzecinkowa = scan.nextDouble();
        if ((liczbaZmiennoprzecinkowa%1)==0) {
            System.out.println("To chyba jednak liczba calkowikita.");
        } else if (liczbaZmiennoprzecinkowa > 10) {
            System.out.println("Mamy tu liczbe wieksza od 10");
        } else {
            System.out.println("Oho mniejsza od 10. No prosze");
        }

    }
}