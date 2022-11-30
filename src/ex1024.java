import java.util.Scanner;

public class ex1024 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor >= 0 && valor <= 100) {
            if (valor <= 25) {
                System.out.println("Intervalo [0,25]");
            } else if (valor <= 50) {
                System.out.println("Intervalo (25,50]");
            } else {
                System.out.println("Intervalo (75,100]");
            }
        } else {
            System.out.println("Fora de intervalo");
        }
        scanner.close();
    }
}
