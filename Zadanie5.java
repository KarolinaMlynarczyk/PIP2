import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wprowadź double a i naciśnij ENTER:");
        Double a = scan.nextDouble();


        System.out.println("Wprowadź double b i naciśnij ENTER:");
        Double b = scan.nextDouble();


        System.out.println("Suma: " + (a + b) + "\nRóżnica: " + (a - b) + "\nSuma odwrotności: " + (1/a + 1/b));

        scan.close();
    }
}
