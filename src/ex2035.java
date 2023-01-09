import java.util.Scanner;

public class ex2035 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String animalCharacteristic = scanner.nextLine();
        String animal = scanner.nextLine();
        String foodClasses = scanner.nextLine();

        if (animalCharacteristic.equals("vertebrado")) {
            if (animal.equals("ave")) {
                if (foodClasses.equals("carnivoro")) {
                    System.out.println("aguia");
                }
                if (foodClasses.equals("onivoro")) {
                    System.out.println("pomba");
                }
            }
            if (animal.equals("mamifero")) {
                if (foodClasses.equals("onivoro")) {
                    System.out.println("homem");
                }
                if (foodClasses.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        }
        if (animalCharacteristic.equals("invertebrado")) {
            if (animal.equals("inseto")) {
                if (foodClasses.equals("hematofago")) {
                    System.out.println("pulga");
                }
                if (foodClasses.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            }
            if (animal.equals("anelideo")) {
                if (foodClasses.equals("hematofago")) {
                    System.out.println("sanguessuga");
                }
                if (foodClasses.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
