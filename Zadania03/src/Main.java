import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ZADANIA WYKONANE PRZEZ JAKUBA BUJAKIEWICZA

        Scanner scanner = new Scanner(System.in);

        // ZADANIE 1

        System.out.print("Podaj dodatnią liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        if (liczba <= 0) {
            System.out.println("Podana liczba musi być dodatnia.");
        } else {
            for (int i = 1; i <= liczba; i += 2) {
                System.out.print(i);

                if (i + 2 <= liczba) {
                    System.out.print(", ");
                }
            }
        }

        // ZADANIE 2

        System.out.print("\n\nPodaj dodatnią liczbę całkowitą: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Podana liczba musi być dodatnia.");
        } else {
            int potega = 1;

            while (potega <= n) {
                System.out.println(potega);
                potega *= 2;
            }
        }

        // ZADANIE 3

        System.out.println("\nPodawaj liczby, aby zakończyć wpisz 0:");

        int suma = 0;
        int liczba3;

        do {
            liczba3 = scanner.nextInt();
            suma += liczba3;
        } while (liczba3 != 0);

        System.out.println("Suma podanych liczb: " + suma);

        // ZADANIE 4

        System.out.println("\nPodawaj liczby, aby zakończyć wpisz 0:");

        int liczba4 = scanner.nextInt();

        if (liczba4 == 0) {
            System.out.println("Nie podano żadnych liczb.");
        } else {
            int najmniejsza = liczba4;
            int najwieksza = liczba4;
            int suma4 = liczba4;
            int ilosc = 1;

            while (true) {
                liczba4 = scanner.nextInt();

                if (liczba4 == 0) {
                    break;
                }

                if (liczba4 < najmniejsza) {
                    najmniejsza = liczba4;
                }

                if (liczba4 > najwieksza) {
                    najwieksza = liczba4;
                }

                suma4 += liczba4;
                ilosc++;
            }

            double srednia = (double) suma4 / ilosc;

            System.out.println("Najmniejsza liczba: " + najmniejsza);
            System.out.println("Największa liczba: " + najwieksza);
            System.out.println("Suma najmniejszej i największej: " + (najmniejsza + najwieksza));
            System.out.println("Średnia arytmetyczna: " + srednia);
        }

        // ZADANIE 5

        Random random = new Random();
        int wylosowana = random.nextInt(100) + 1;
        int zgadnieta;

        System.out.println("\nZgadnij liczbę od 1 do 100:");

        do {
            zgadnieta = scanner.nextInt();

            if (zgadnieta > wylosowana) {
                System.out.println("Podałeś za dużą wartość");
            } else if (zgadnieta < wylosowana) {
                System.out.println("Podałeś za małą wartość");
            } else {
                System.out.println("Gratulacje");
            }
        } while (zgadnieta != wylosowana);

        // ZADANIE 6

        System.out.println("\nPodaj znak wypełnienia prostokąta:");
        char znak = scanner.next().charAt(0);

        System.out.println("Podaj pozycję lewego górnego rogu x:");
        int x = scanner.nextInt();

        System.out.println("Podaj pozycję lewego górnego rogu y:");
        int y = scanner.nextInt();

        System.out.println("Podaj długość boku a:");
        int a = scanner.nextInt();

        System.out.println("Podaj długość boku b:");
        int b = scanner.nextInt();

        System.out.println("\nProstokąt:");

        for (int i = 1; i < y; i++) {
            System.out.println();
        }

        for (int i = 0; i < b; i++) {
            for (int j = 1; j < x; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < a; j++) {
                System.out.print(znak);
            }

            System.out.println();
        }

        // ZADANIE 7

        System.out.println("\nPodaj wysokość choinki:");
        int wysokosc = scanner.nextInt();

        if (wysokosc <= 0) {
            System.out.println("Wysokość musi być większa od 0.");
        } else {
            for (int i = 1; i <= wysokosc; i++) {
                for (int j = 1; j <= wysokosc - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }

        // ZADANIE 8

        System.out.println("\nPodaj liczbę do obliczenia silni:");
        int liczba8 = scanner.nextInt();

        if (liczba8 < 0) {
            System.out.println("Silnia jest zdefiniowana dla liczb nieujemnych.");
        } else {
            long silnia = 1;

            for (int i = 1; i <= liczba8; i++) {
                silnia *= i;
            }

            System.out.println("Silnia liczby " + liczba8 + " wynosi: " + silnia);
        }

        scanner.close();
    }
}
