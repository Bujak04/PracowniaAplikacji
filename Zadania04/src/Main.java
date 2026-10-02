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
}
