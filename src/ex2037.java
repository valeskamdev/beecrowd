import java.util.Scanner;

public class ex2037 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salary, difference, tax;

        salary = scanner.nextDouble();

        if (salary >= 0.0 && salary <= 2000.0) {
            System.out.println("Isento");
        }else if (salary >= 2000.01 && salary <= 3000.0) {
            difference = salary - 2000;
            tax = difference * 0.08;
            System.out.printf("R$ %.2f\n", tax);
        } else if (salary >= 3000.01 && salary <= 4500.0) {
            difference = salary - 3000;
            tax = difference * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f\n", tax);
        } else {
            difference = salary - 4500;
            tax = difference * 0.28 + 1000 * 0.08 + 1500 * 0.18;
            System.out.printf("R$ %.2f\n", tax);
        }
    }
}
