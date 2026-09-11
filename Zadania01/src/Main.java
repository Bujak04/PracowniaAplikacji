import java.util.Scanner;
import static java.lang.IO.print;

void main() {
    // Zadanie wykonane przez Jakuba Bujakiewicza | Wszelkie prawa autorskie

    // Zad. 1
    print("Zadanie 1\n");
    print("Ania\n");
    print("Bartek\n");
    print("Kasia\n");

    // Zad. 2
    print("Zadanie 2\n");

    String imie = "Jakub";
    int rokUrodzenia = 2007;
    double liczba = 0.66;

    print(imie + "\n");
    print(rokUrodzenia + "\n");
    print(liczba + "\n");

    // Zad. 3
    print("Zadanie 3\n");

    print("Mam na imię " + imie
            + ", mam " + (2026 - rokUrodzenia)
            + " lat i będę pisać maturę za "
            + liczba + " roku.\n");

    // Zad. 4
    print("Zadanie 4\n");

    Scanner scanner = new Scanner(System.in);

    print("Podaj temperaturę w stopniach Celsjusza: \n");
    double stopnie = scanner.nextDouble();

    double fahrenheit = 1.8 * stopnie + 32.0;

    print("Temperatura w stopniach Fahrenheita: "
            + fahrenheit + "\n");

    // Zad. 5
    print("Zadanie 5\n");

    print("Podaj pierwszy bok trójkąta: \n");
    double bok1 = scanner.nextDouble();

    print("Podaj drugi bok trójkąta: \n");
    double bok2 = scanner.nextDouble();

    print("Podaj trzeci bok trójkąta: \n");
    double bok3 = scanner.nextDouble();

    double obwod = bok1 + bok2 + bok3;

    print("Obwód trójkąta wynosi: " + obwod + "\n");

    // Zad. 6
    print("Zadanie 6\n");

    print("Podaj pierwsze słowo: \n");
    String slowo1 = scanner.next();

    print("Podaj drugie słowo: \n");
    String slowo2 = scanner.next();

    print("Podaj trzecie słowo: \n");
    String slowo3 = scanner.next();

    print(slowo3 + ", " + slowo2 + ", " + slowo1 + "\n");

    // Zad. 7
    print("Zadanie 7\n");

    print("Podaj słowo: \n");
    String slowo = scanner.next();

    print("Liczba znaków: " + slowo.length() + "\n");

    // Zad. 8
    print("Zadanie 8\n");

    int x = 5;
    int y = 2;

    double wynik = (double) x / y;

    print(wynik + "\n");

    // Zad. 9
    print("Zadanie 9\n");

    print("Podaj słowo: ");
    String slowo4 = scanner.next();

    print(slowo4.toUpperCase() + "\n");

    // Zad. 10
    print("Zadanie 10\n");

    print("Podaj promień koła: \n");
    int promien = scanner.nextInt();

    double pole = Math.PI * promien * promien;

    print("Pole koła wynosi: " + pole + "\n");

    // Zadanie wykonane przez Jakuba Bujakiewicza | Wszelkie prawa autorskie
}