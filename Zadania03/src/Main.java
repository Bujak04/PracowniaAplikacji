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

        scanner.close();
    }
}