import java.util.Scanner;

public class ex2042 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();
        double number4 = scanner.nextDouble();
        double number5 = scanner.nextDouble();
        double number6 = scanner.nextDouble();

        int amountPositiveNumbers = 0;
        double positiveNumber = 0;
        int value = 1;


        if (number1 > 0) {
            positiveNumber += number1;
            amountPositiveNumbers += value;
        }
        if (number2 > 0) {
            positiveNumber += number2;
            amountPositiveNumbers += value;
        }
        if (number3 > 0) {
            positiveNumber += number3;
            amountPositiveNumbers += value;
        }
        if (number4 > 0) {
            positiveNumber += number4;
            amountPositiveNumbers += value;
        }
        if (number5 > 0) {
            positiveNumber += number5;
            amountPositiveNumbers += value;
        }
        if (number6 > 0) {
            positiveNumber += number6;
            amountPositiveNumbers += value;
        }

        double average = positiveNumber / amountPositiveNumbers;

        System.out.println(amountPositiveNumbers + " valores positivos");
        System.out.printf("%.1f\n", average);
    }
}
