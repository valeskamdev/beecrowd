import java.util.Scanner;

public class ex2032 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else {
            duracao = 24 - horaInicial + horaFinal;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
    }
}
