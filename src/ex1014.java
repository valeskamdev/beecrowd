import java.util.Scanner;

public class ex1014 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        double combustivel = scanner.nextDouble();
        double consumo = distancia / combustivel;

        System.out.printf("%.3f km/l\n", consumo);

        scanner.close();
    }
}
