import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wpisz swoje imię i naciśnij ENTER:");
        String imie = scan.next();

        System.out.println("Podaj swoje nazwisko i naciśnij ENTER:");
        String nazwisko = scan.next();

        System.out.println("Wprowadź swój numer studenta (bez s) i naciśnij ENTER:");
        int indeks = scan.nextInt();

        System.out.println("Hello, " + imie + " " + nazwisko + " " + "s" + indeks + "!");

        scan.close();
    }
}
