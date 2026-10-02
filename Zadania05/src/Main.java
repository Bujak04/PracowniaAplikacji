void main() {

    // Zadanie 1
    IO.println("Mój wiek: " + getAge());

    // Zadanie 2
    IO.println("Mam na imię: " + getName());

    // Zadanie 3
    calculate(10, 5);

    // Zadanie 4
    IO.println("Czy 8 jest parzyste? " + isEven(8));

    // Zadanie 5
    IO.println("Czy 15 jest podzielne przez 3 i 5? " + isDivisibleBy3And5(15));
}


// Zadanie 1
static int getAge() {
    return 20; // wpisz swój wiek
}


// Zadanie 2
static String getName() {
    return "Jan"; // wpisz swoje imię
}


// Zadanie 3
static void calculate(int a, int b) {
    IO.println("Suma: " + (a + b));
    IO.println("Różnica: " + (a - b));
    IO.println("Iloczyn: " + (a * b));
}


// Zadanie 4
static boolean isEven(int number) {
    return number % 2 == 0;
}


// Zadanie 5
static boolean isDivisibleBy3And5(int number) {
    return number % 3 == 0 && number % 5 == 0;
}
