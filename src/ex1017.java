import java.util.Scanner;

public class ex1017 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double hora = scanner.nextDouble();
        double velocidade = scanner.nextDouble();
        double litros = hora * velocidade / 12;

        System.out.printf("%.3f\n", litros);

        scanner.close();
    }
}
