import java.util.Scanner;

public class ex2031 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double x;

        if (a < b) {
            x = a;
            a = b;
            b = x;
        }
        if (b < c) {
            x = b;
            b = c;
            c = x;
        }
        if (a < b) {
            x = a;
            a = b;
            b = x;
        }

        double BCAoQuadrado = Math.pow(b, 2) + Math.pow(c, 2);
        double aAoQaadrado = Math.pow(a, 2);

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (aAoQaadrado > BCAoQuadrado) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }

        if (aAoQaadrado == BCAoQuadrado) {
            System.out.println("TRIANGULO RETANGULO");
        }

        if (aAoQaadrado < BCAoQuadrado) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (a == b && a == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }

        if ((a == b || b == c) != (a == b && b == c)) {
            System.out.println("TRIANGULO ISOSCELES");
        }
        scanner.close();
    }
}
