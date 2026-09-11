import static java.lang.IO.print;

void main() {
    print("Ania");
    print("Bartek");
    print("Kasia");

    String imie = "Jakub";
    int rokUrodzenia = 2007;
    double liczba = 0.66;

    print(imie);
    print(rokUrodzenia);
    print(liczba);

    print("Mam na imię " + imie + ", mam " + (2026 - rokUrodzenia) + " lat i będę pisać maturę za " + liczba + " roku.");
}
