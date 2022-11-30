import java.util.Scanner;

public class ex1023 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double raizDelta = Math.sqrt(delta);
        double x1 = (-b + raizDelta) / (2 * a);
        double x2 = (-b - raizDelta) / (2 * a);

        if (delta <= 0 || a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }
    }
}
