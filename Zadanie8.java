import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj X:");
        Double x = scan.nextDouble();
        Boolean dzialanie = ((x > 3) && (x <=8));

        System.out.println(dzialanie);

        scan.close();
    }
}
