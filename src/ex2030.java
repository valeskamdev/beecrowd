import java.util.Scanner;

public class ex2030 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b ) {
            if (a % b == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }

        if (b > a ) {
            if (b % a == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }

        if (a == b) {
            System.out.println("Sao Multiplos");
        }

        scanner.close();
    }
}
