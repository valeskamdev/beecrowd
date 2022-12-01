import java.util.Scanner;

public class ex2028 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int[] numeros = {n1, n2, n3};

        int aux;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        scanner.close();
    }
}
