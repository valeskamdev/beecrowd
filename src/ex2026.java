import java.text.DecimalFormat;
import java.util.Scanner;

public class ex2026 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        double mediaPeso = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / (2 + 3 + 4 + 1);

        System.out.println(("Media: " + new DecimalFormat("#,#0.0").format(mediaPeso)));

        if (mediaPeso >= 5 && mediaPeso <= 6.9) {
            System.out.println("Aluno em exame.");
            double notaExame = scanner.nextDouble();
            double mediaExame = (mediaPeso + notaExame) / 2;
            System.out.printf("Nota do exame: %.1f\n", notaExame);

            if (mediaExame >= 5) {
                System.out.println("Aluno aprovado.");
            } else if (mediaExame < 4.9) {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", mediaExame);
            }
            System.out.printf("Media final: %.1f\n", mediaExame);

        } else if (mediaPeso >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (mediaPeso < 5) {
            System.out.println("Aluno reprovado.");
        }
        scanner.close();
    }
}
