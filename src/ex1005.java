import java.util.Scanner;

public class ex1005 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double media = ((n1 * 3.5) + (n2 * 7.5)) / 11;

        if (n1 >= 0 || n1 <= 10 && n2 >= 0 || n2 <= 10) {
            System.out.printf("MEDIA = %.5f", media);
        }
        scanner.close();
    }
}
