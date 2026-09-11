import java.util.Scanner;
import static java.lang.IO.print;

void main() {
    // Zad. 1
    print("Ania");
    print("Bartek");
    print("Kasia");

    // Zad. 2
    String imie = "Jakub";
    int rokUrodzenia = 2007;
    double liczba = 0.66;

    print(imie);
    print(rokUrodzenia);
    print(liczba);

    // Zad. 3
    print("Mam na imię " + imie + ", mam " + (2026 - rokUrodzenia) + " lat i będę pisać maturę za " + liczba + " roku.");

    // Zad. 4
    Scanner scanner = new Scanner(System.in);

    double stopnie;

    print("Podaj temperaturę w stopniach Celsjusza: ");
    stopnie = scanner.nextDouble();

    double fahrenheit = 1.8 * stopnie + 32.0;

    print("Temperatura w stopniach Fahrenheita: " + fahrenheit);

    // Zad. 5
    double bok1;
    double bok2;
    double bok3;

    print("Podaj pierwszy bok trójkąta: ");
    bok1 = scanner.nextDouble();

    print("Podaj drugi bok trójkąta: ");
    bok2 = scanner.nextDouble();

    print("Podaj trzeci bok trójkąta: ");
    bok3 = scanner.nextDouble();

    double obwod = bok1 + bok2 + bok3;

    print("Obwód trójkąta wynosi: " + obwod);
}
