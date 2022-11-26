import java.util.Scanner;

public class ex1010 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codigo1 = scanner.nextInt();
        int pecas1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();

        int codigo2 = scanner.nextInt();
        int pecas2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();

        double valorTotal = (pecas1 * valor1) + (pecas2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}
