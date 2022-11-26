import java.util.Scanner;

public class ex1016 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        int minutos = distancia * 2;

        System.out.println(minutos + " minutos");

        scanner.close();
    }
}
