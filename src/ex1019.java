import java.util.Scanner;

public class ex1019 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horas, minutos, segundos, total;
        segundos = scanner.nextInt();

        horas = segundos / 3600;
        total = segundos % 3600;

        minutos = total / 60;
        total = total % 60;

        System.out.println(horas + ":" + minutos + ":" + total);

        scanner.close();
    }
}
