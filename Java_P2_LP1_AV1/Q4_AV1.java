import java.util.Scanner;

public class Q4_AV1 {
    public static void executar(Scanner sc) {
        System.out.println("Insira o coeficiente a:");
        double a = sc.nextDouble();

        System.out.println("Insira o coeficiente b:");
        double b = sc.nextDouble();

        System.out.println("Insira o coeficiente c:");
        double c = sc.nextDouble();

        double delta = (b * b) - (4 * a * c);
        System.out.println("O valor de delta é: " + delta);

        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("O valor de x' é: " + x1);
            System.out.println("O valor de x'' é: " + x2);
        } else {
            System.out.println("A equação não possui soluções reais.");
        }
    }
}