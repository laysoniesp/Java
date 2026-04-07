
import java.util.Scanner;

public class Q2_AV1 {
    public static void executar(Scanner sc) {
        System.out.println("Digite o primeiro número:");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double n2 = sc.nextDouble();

        System.out.println("CÓDIGO OPERAÇÃO");
        System.out.println("1 Média entre os números digitados");
        System.out.println("2 Diferença do maior pelo menor");
        System.out.println("3 Produto entre os números digitados");
        System.out.println("4 Divisão do primeiro pelo segundo");
        System.out.println("Digite sua escolha:");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            double media = (n1 + n2) / 2;
            System.out.println("A média é: " + media);
        } else if (escolha == 2) {
            if (n1 > n2) {
                System.out.println("A diferença é: " + (n1 - n2));
            } else {
                System.out.println("A diferença é: " + (n2 - n1));
            }
        } else if (escolha == 3) {
            double produto = n1 * n2;
            System.out.println("O produto é: " + produto);
        } else if (escolha == 4) {
            if (n2 != 0) {
                double divisao = n1 / n2;
                System.out.println("A divisão é: " + divisao);
            } else {
                System.out.println("Erro: Não é possível dividir por zero.");
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }
}