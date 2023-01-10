import java.util.Scanner;

public class ex2040 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();
        double number4 = scanner.nextDouble();
        double number5 = scanner.nextDouble();
        double number6 = scanner.nextDouble();

        int positiveNumbers = 0;
        int value = 1;

        if (number1 > 0) {
            positiveNumbers += value;
        }
        if (number2 > 0) {
            positiveNumbers += value;
        }
        if (number3 > 0) {
            positiveNumbers += value;
        }
        if (number4 > 0) {
            positiveNumbers += value;
        }
        if (number5 > 0) {
            positiveNumbers += value;
        }
        if (number6 > 0) {
            positiveNumbers += value;
        }
        System.out.println(positiveNumbers + " valores positivos");
    }
}
