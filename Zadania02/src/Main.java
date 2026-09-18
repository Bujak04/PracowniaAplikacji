import java.util.Scanner;

void main() {

  // ZADANIE WYKONANE PRZEZ JAKUBA BUJAKIEWICZA //

  Scanner sc = new Scanner(System.in);

  //1
  System.out.print("Podaj liczbe: ");
  int liczba = sc.nextInt();

  if (liczba % 3 == 0) {
    System.out.println("Twoja liczba jest podzielna przez 3");
  } else {
    System.out.println("Twoja liczba nie jest podzielna przez 3");
  }

  // ZADANIE WYKONANE PRZEZ JAKUBA BUJAKIEWICZA //

  //2
  System.out.print("Podaj 1 bok trójkąta: ");
  int bok1 = sc.nextInt();

  System.out.print("Podaj 2 bok trójkąta: ");
  int bok2 = sc.nextInt();

  System.out.print("Podaj 3 bok trójkąta: ");
  int bok3 = sc.nextInt();

  if (bok1 + bok2 > bok3 && bok1 + bok3 > bok2 && bok2 + bok3 > bok1) {
    System.out.println("Z twoich liczb można zbudować trójkąt");
  } else {
    System.out.println("Z twoich liczb nie można zbudować trójkąta");
  }

  // ZADANIE WYKONANE PRZEZ JAKUBA BUJAKIEWICZA //

  //3
  System.out.print("Podaj liczbe: ");
  int a = sc.nextInt();

  System.out.print("Podaj liczbe: ");
  int b = sc.nextInt();

  if (a > b) {
    System.out.println("Większe jest: " + a);
  } else if (b > a) {
    System.out.println("Większe jest: " + b);
  } else {
    System.out.println("Liczby są równe");
  }

  // ZADANIE WYKONANE PRZEZ JAKUBA BUJAKIEWICZA //

  //4
  System.out.print("Podaj liczbe: ");
  int a2 = sc.nextInt();

  System.out.print("Podaj liczbe: ");
  int b2 = sc.nextInt();

  System.out.print("Podaj liczbe: ");
  int c2 = sc.nextInt();

  int najwieksza = a2;

  if (b2 > najwieksza) {
    najwieksza = b2;
  }

  if (c2 > najwieksza) {
    najwieksza = c2;
  }

  System.out.println("Najwieksza liczba to " + najwieksza);

  // ZADANIE WYKONANE PRZEZ JAKUBA BUJAKIEWICZA //

  //5
  System.out.print("Podaj numer miesiaca: ");
  int miesiac = sc.nextInt();

  String nazwa = switch (miesiac) {
    case 1 -> "Styczen";
    case 2 -> "Luty";
    case 3 -> "Marzec";
    case 4 -> "Kwiecien";
    case 5 -> "Maj";
    case 6 -> "Czerwiec";
    case 7 -> "Lipiec";
    case 8 -> "Sierpien";
    case 9 -> "Wrzesien";
    case 10 -> "Pazdziernik";
    case 11 -> "Listopad";
    case 12 -> "Grudzien";
    default -> "Nieprawidlowy numer miesiaca";
  };

  System.out.println(nazwa);

  // ZADANIE WYKONANE PRZEZ JAKUBA BUJAKIEWICZA //

  //6
  System.out.print("Podaj imie: ");
  String imie = sc.next();

  String mojeImie = "Jakub";

  if (imie.equalsIgnoreCase(mojeImie)) {
    System.out.println("Masz takie samo imie jak ja");
  } else {
    System.out.println("Masz inne imie niz ja");
  }

  // ZADANIE WYKONANE PRZEZ JAKUBA BUJAKIEWICZA //

  //7
  System.out.print("Podaj swoj wiek: ");
  int wiek = sc.nextInt();

  boolean pelnoletni = wiek >= 18 ? true : false;

  System.out.println("Czy jestes pelnoletni? " + pelnoletni);

  // ZADANIE WYKONANE PRZEZ JAKUBA BUJAKIEWICZA //

  //8
  System.out.print("Podaj rok: ");
  int rok = sc.nextInt();

  if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
    System.out.println("Podany rok jest przestepny");
  } else {
    System.out.println("Podany rok nie jest przestepny");
  }

  // ZADANIE WYKONANE PRZEZ JAKUBA BUJAKIEWICZA //

  //9
  System.out.print("Podaj swoja wage w kg: ");
  double waga = sc.nextDouble();

  System.out.print("Podaj swoj wzrost w metrach: ");
  double wzrost = sc.nextDouble();

  double bmi = waga / (wzrost * wzrost);

  System.out.println("Twoje BMI wynosi: " + bmi);

  if (bmi < 18.5) {
    System.out.println("Niedowaga");
  } else if (bmi <= 24.9) {
    System.out.println("Waga prawidlowa");
  } else {
    System.out.println("Nadwaga");
  }

  // ZADANIE WYKONANE PRZEZ JAKUBA BUJAKIEWICZA //

  //10
  double cena;
  int raty;

  while (true) {
    System.out.print("Podaj cene towaru (100 - 10000 zl): ");
    cena = sc.nextDouble();

    if (cena >= 100 && cena <= 10000) {
      break;
    }

    System.out.println("Bledna cena! Podaj ponownie.");
  }

  while (true) {
    System.out.print("Podaj liczbe rat (6 - 48): ");
    raty = sc.nextInt();

    if (raty >= 6 && raty <= 48) {
      break;
    }

    System.out.println("Bledna liczba rat! Podaj ponownie.");
  }

  double oprocentowanie;

  if (raty >= 6 && raty <= 12) {
    oprocentowanie = 0.025;
  } else if (raty >= 13 && raty <= 24) {
    oprocentowanie = 0.05;
  } else {
    oprocentowanie = 0.10;
  }

  double kwotaZOdsetkami = cena + (cena * oprocentowanie);
  double rata = kwotaZOdsetkami / raty;

  System.out.println("Miesieczna rata wynosi: " + rata + " zl");

  // ZADANIE WYKONANE PRZEZ JAKUBA BUJAKIEWICZA //

  //11
  System.out.println("Prosty kalkulator");

  System.out.print("Podaj pierwsza liczbe: ");
  double liczba1 = sc.nextDouble();

  System.out.print("Podaj symbol operacji (+, -, *, /): ");
  char operacja = sc.next().charAt(0);

  System.out.print("Podaj druga liczbe: ");
  double liczba2 = sc.nextDouble();

  switch (operacja) {
    case '+':
      System.out.println("Wynik: " + (liczba1 + liczba2));
      break;

    case '-':
      System.out.println("Wynik: " + (liczba1 - liczba2));
      break;

    case '*':
      System.out.println("Wynik: " + (liczba1 * liczba2));
      break;

    case '/':
      if (liczba2 == 0) {
        System.out.println("Nie mozna dzielic przez zero");
      } else {
        System.out.println("Wynik: " + (liczba1 / liczba2));
      }
      break;

    default:
      System.out.println("Bledny symbol operacji");
  }

  // ZADANIE WYKONANE PRZEZ JAKUBA BUJAKIEWICZA //
}
