import java.util.Scanner;

public class ex1006 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        if (a >= 0 || a <= 10 && b >= 0 || b <= 10 && c >= 0 && c <= 10) {
            System.out.printf("MEDIA = %.1f\n", media);
        }
        scanner.close();
    }
}
