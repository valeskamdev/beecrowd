import java.util.Scanner;

public class ex1020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ano, mes, idadeEmDias, total;

        idadeEmDias = scanner.nextInt();

        ano = idadeEmDias / 365;
        total = idadeEmDias % 365;

        mes = total / 30;
        total = total % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(total + " dia(s)");

        scanner.close();
    }
}
