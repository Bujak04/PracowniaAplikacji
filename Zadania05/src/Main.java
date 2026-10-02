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
    IO.println("Czy 15 jest podzielne przez 3 i 5? "
            + isDivisibleBy3And5(15));

    // Zadanie 6
    IO.println("2 do potęgi 3: " + powerOfThree(2));

    // Zadanie 7
    IO.println("Pierwiastek z 25: " + squareRoot(25));

    // Zadanie 8
    IO.println("Czy 3, 4, 5 tworzą trójkąt prostokątny? "
            + isRightTriangle(3, 4, 5));

    // Zadanie 9
    IO.println("Ostatni znak słowa Witaj: "
            + lastCharacter("Witaj"));

    // Zadanie 10
    IO.println("Czy kajak jest palindromem? "
            + isPalindrome("kajak"));
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


// Zadanie 6
static int powerOfThree(int number) {
    return number * number * number;
}


// Zadanie 7
static double squareRoot(double number) {
    return Math.sqrt(number);
}


// Zadanie 8
static boolean isRightTriangle(double a, double b, double c) {

    if (a >= b && a >= c) {
        return a * a == b * b + c * c;
    } else if (b >= a && b >= c) {
        return b * b == a * a + c * c;
    } else {
        return c * c == a * a + b * b;
    }
}


// Zadanie 9
static char lastCharacter(String text) {
    return text.charAt(text.length() - 1);
}


// Zadanie 10
static boolean isPalindrome(String text) {

    text = text.toLowerCase();

    for (int i = 0; i < text.length() / 2; i++) {
        if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
            return false;
        }
    }

    return true;
}
