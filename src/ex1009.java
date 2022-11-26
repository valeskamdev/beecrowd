import java.util.Scanner;

public class ex1009 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        double comissao = salario + vendas * 15 / 100;

        if (vendas != 0) {
            System.out.printf("TOTAL = R$ %.2f\n", comissao);
        } else {
            System.out.printf("TOTAL = R$ %.2f\n", salario);
        }
        scanner.close();
    }
}
