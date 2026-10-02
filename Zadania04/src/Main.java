void main() {

    // Zadanie 1
    int[] liczby = {10, 20, 30, 40, 50, 60};
    double[] liczbyDziesietne = {1.5, 2.5, 3.5, 4.5, 5.5};

    System.out.println("Zadanie 1:");

    for (int i = 0; i < liczby.length; i += 2) {
        System.out.println(liczby[i]);
    }

    for (int i = 0; i < liczbyDziesietne.length; i += 2) {
        System.out.println(liczbyDziesietne[i]);
    }


    // Zadanie 2
    int[] tablica = {12, 45, 7, 89, 23, 56};

    int najwieksza = tablica[0];

    for (int i = 1; i < tablica.length; i++) {
        if (tablica[i] > najwieksza) {
            najwieksza = tablica[i];
        }
    }

    System.out.println("\nZadanie 2:");
    System.out.println("Największa liczba: " + najwieksza);


    // Zadanie 3
    String[] owoce = {"jabłko", "banan", "gruszka", "pomarańcza", "śliwka"};

    System.out.println("\nZadanie 3:");

    for (String owoc : owoce) {
        System.out.println(owoc.toUpperCase());
    }


    // Zadanie 4
    String[] slowa = new String[5];

    System.out.println("\nZadanie 4:");

    for (int i = 0; i < slowa.length; i++) {
        slowa[i] = IO.readln("Podaj słowo: ");
    }

    System.out.println("Wynik:");

    for (int i = slowa.length - 1; i >= 0; i--) {
        String odwrocone = "";

        for (int j = slowa[i].length() - 1; j >= 0; j--) {
            odwrocone += slowa[i].charAt(j);
        }

        System.out.println(odwrocone);
    }


    // Zadanie 5
    int[] liczby5 = new int[8];

    System.out.println("\nZadanie 5:");

    for (int i = 0; i < liczby5.length; i++) {
        liczby5[i] = Integer.parseInt(IO.readln("Podaj liczbę: "));
    }

    // Sortowanie rosnąco
    for (int i = 0; i < liczby5.length - 1; i++) {
        for (int j = 0; j < liczby5.length - 1 - i; j++) {
            if (liczby5[j] > liczby5[j + 1]) {
                int pomocnicza = liczby5[j];
                liczby5[j] = liczby5[j + 1];
                liczby5[j + 1] = pomocnicza;
            }
        }
    }

    System.out.println("Tablica po sortowaniu:");

    for (int liczba : liczby5) {
        System.out.println(liczba);
    }


    // Zadanie 6
    int[] liczby6 = new int[5];

    System.out.println("\nZadanie 6:");

    for (int i = 0; i < liczby6.length; i++) {
        liczby6[i] = Integer.parseInt(IO.readln("Podaj liczbę: "));
    }

    for (int liczba : liczby6) {
        long silnia = 1;

        for (int i = 1; i <= liczba; i++) {
            silnia = silnia * i;
        }

        System.out.println("Silnia z " + liczba + " = " + silnia);
    }


    // Zadanie 7
    String[] tablica1 = {"Ala", "ma", "kota"};
    String[] tablica2 = {"Ala", "ma", "kota"};

    boolean takieSame = true;

    if (tablica1.length != tablica2.length) {
        takieSame = false;
    } else {
        for (int i = 0; i < tablica1.length; i++) {
            if (!tablica1[i].equals(tablica2[i])) {
                takieSame = false;
                break;
            }
        }
    }

    System.out.println("\nZadanie 7:");

    if (takieSame) {
        System.out.println("Tablice są takie same.");
    } else {
        System.out.println("Tablice nie są takie same.");
    }


    // Zadanie 8
    int[] liczby8 = new int[10];

    System.out.println("\nZadanie 8:");

    // Wypełnianie tablicy liczbami od -10 do 10
    for (int i = 0; i < liczby8.length; i++) {
        liczby8[i] = (int) (Math.random() * 21) - 10;
    }

    // Wyświetlenie tablicy
    System.out.println("Tablica:");

    for (int liczba : liczby8) {
        System.out.print(liczba + " ");
    }

    System.out.println();

    // Szukanie najmniejszej i największej liczby
    int najmniejsza8 = liczby8[0];
    int najwieksza8 = liczby8[0];

    for (int i = 1; i < liczby8.length; i++) {
        if (liczby8[i] < najmniejsza8) {
            najmniejsza8 = liczby8[i];
        }

        if (liczby8[i] > najwieksza8) {
            najwieksza8 = liczby8[i];
        }
    }

    System.out.println("Najmniejsza liczba: " + najmniejsza8);
    System.out.println("Największa liczba: " + najwieksza8);

    // Obliczanie średniej
    int suma = 0;

    for (int liczba : liczby8) {
        suma += liczba;
    }

    double srednia = (double) suma / liczby8.length;

    System.out.println("Średnia: " + srednia);

    // Liczenie liczb mniejszych i większych od średniej
    int mniejsze = 0;
    int wieksze = 0;

    for (int liczba : liczby8) {
        if (liczba < srednia) {
            mniejsze++;
        } else if (liczba > srednia) {
            wieksze++;
        }
    }

    System.out.println("Elementów mniejszych od średniej: " + mniejsze);
    System.out.println("Elementów większych od średniej: " + wieksze);

    // Tablica w odwrotnej kolejności
    System.out.println("Tablica w odwrotnej kolejności:");

    for (int i = liczby8.length - 1; i >= 0; i--) {
        System.out.print(liczby8[i] + " ");
    }
}
