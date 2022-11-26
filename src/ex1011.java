import java.util.Scanner;

public class ex1011 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int raio = scanner.nextInt();
        double pi = 3.14159;
        double formula = (4 * pi * Math.pow(raio, 3)) / 3;

        System.out.printf("VOLUME = %.3f\n", formula);

    }
}
