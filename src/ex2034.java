import java.util.Scanner;

public class ex2034 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int percentage;
        double readjustment, newSalary, salary;
        salary = scanner.nextDouble();

        if (salary >= 0.0 && salary <= 400.0) {
            percentage = 15;
            readjustment = salary * percentage / 100;
            newSalary = salary + readjustment;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", readjustment);
            System.out.print("Em percentual: " + percentage + " %\n");
        } else if (salary >= 400.01 && salary <= 800.0) {
            percentage = 12;
            readjustment = salary * percentage / 100;
            newSalary = salary + readjustment;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", readjustment);
            System.out.print("Em percentual: " + percentage + " %\n");
        } else if (salary >= 800.01 && salary <= 1200.0) {
            percentage = 10;
            readjustment = salary * percentage / 100;
            newSalary = salary + readjustment;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", readjustment);
            System.out.print("Em percentual: " + percentage + " %\n");
        } else if (salary >= 1200.01 && salary <= 2000.0) {
            percentage = 7;
            readjustment = salary * percentage / 100;
            newSalary = salary + readjustment;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", readjustment);
            System.out.print("Em percentual: " + percentage + " %\n");
        } else {
            percentage = 4;
            readjustment = salary * percentage / 100;
            newSalary = salary + readjustment;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", readjustment);
            System.out.print("Em percentual: " + percentage + " %\n");
        }
    }
}
