import java.util.Scanner;

public class ex2029 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double perimetro = a + b + c;
        double area = (a + b) * c / 2;

        if (a < b + c && b < a + c && c < a + b) {
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            System.out.printf("Area = %.1f\n", area);
        }
        scanner.close();
    }
}
