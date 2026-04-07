
import java.util.Scanner;

public class Q3_AV1 {
    public static void executar(Scanner sc) {
        System.out.println("Digite o primeiro lado:");
        double lado1 = sc.nextDouble();

        System.out.println("Digite o segundo lado:");
        double lado2 = sc.nextDouble();

        System.out.println("Digite o terceiro lado:");
        double lado3 = sc.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("O triângulo é válido.");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é Equilátero.");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("O triângulo é Escaleno.");
            } else {
                System.out.println("O triângulo é Isósceles.");
            }
        } else {
            System.out.println("As medidas informadas não formam um triângulo válido.");
        }
    }
}