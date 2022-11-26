import java.util.Scanner;

public class ex1008 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int funcionario = scanner.nextInt();
        int hora = scanner.nextInt();
        double valor = scanner.nextDouble();
        double salario = valor * hora;

        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        scanner.close();
    }
}
