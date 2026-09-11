import java.util.Scanner;
import static java.lang.IO.print;

void main() {
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
    print("Mam na imię " + imie + ", mam " + (2026 - rokUrodzenia) + " lat i będę pisać maturę za " + liczba + " roku.");

    // Zad. 4
    print("Zadanie 4\n");
    Scanner scanner = new Scanner(System.in);

    double stopnie;

    print("Podaj temperaturę w stopniach Celsjusza: \n");
    stopnie = scanner.nextDouble();

    double fahrenheit = 1.8 * stopnie + 32.0;

    print("Temperatura w stopniach Fahrenheita: " + fahrenheit + "\n");

    // Zad. 5
    double bok1;
    double bok2;
    double bok3;

    print("Podaj pierwszy bok trójkąta: \n");
    bok1 = scanner.nextDouble();

    print("Podaj drugi bok trójkąta: \n");
    bok2 = scanner.nextDouble();

    print("Podaj trzeci bok trójkąta: \n");
    bok3 = scanner.nextDouble();

    double obwod = bok1 + bok2 + bok3;

    print("Obwód trójkąta wynosi: \n" + obwod);

// Zad. 6
    String slowo1;
    String slowo2;
    String slowo3;

    print("Podaj pierwsze słowo: ");
    slowo1 = scanner.next();

    print("Podaj drugie słowo: ");
    slowo2 = scanner.next();

    print("Podaj trzecie słowo: ");
    slowo3 = scanner.next();

    print(slowo3 + ", " + slowo2 + ", " + slowo1);

}