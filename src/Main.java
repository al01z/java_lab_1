import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = false;
        boolean b = false;
        boolean c = false;
        int x = 1;
        int y = 5;
        int z = 5;
        System.out.println("((x == y) && (!a && !b)) : " + ((x == y) && (!a && !b))); // false
        System.out.println("((z != y) || (!b || c)) : " + ((z != y) || (!b || c))); // true
        System.out.println("((y > y) && (!c && c)) : " + ((y > y) || (!c && c))); // false
        System.out.println("((x <= x) || (!a && !b)) : " + ((x <= y) || (!a && !b))); // true





    }
}