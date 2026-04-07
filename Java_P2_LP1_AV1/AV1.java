
import java.util.Scanner;

public class AV1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = -1;

        for (; opcao != 0;) {
            System.out.println("\n=== PAINEL DA AVALIAÇÃO ===");
            System.out.println("1 - Questão 1");
            System.out.println("2 - Questão 2");
            System.out.println("3 - Questão 3");
            System.out.println("4 - Questão 4");
            System.out.println("0 - Sair");
            System.out.print("Qual código você quer rodar? ");

            opcao = teclado.nextInt();

            if (opcao == 1) {
                Q1_AV1.executar(teclado);
            } else if (opcao == 2) {
                Q2_AV1.executar(teclado);
            } else if (opcao == 3) {
                Q3_AV1.executar(teclado);
            } else if (opcao == 4) {
                Q4_AV1.executar(teclado);
            } else if (opcao == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida.");
            }
        }

        teclado.close();
    }
}