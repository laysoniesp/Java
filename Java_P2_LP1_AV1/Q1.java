package Github.Java.Java_P2_LP1_AV1;

import java.util.Scanner;

public class Q1 {
    public static void executar() {
        Scanner teclado = new Scanner(System.in);
        int sim = 0;
        int nao = 0;
        int resposta;

        System.out.println("\nPesquisa: Você gosta de beterraba?");

        for (int i = 1; i <= 15; i++) {
            do {
                System.out.printf("Usuário %d - Digite 1 (SIM) ou 2 (NÃO): ", i);
                resposta = teclado.nextInt();
                
                if (resposta != 1 && resposta != 2) {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            } while (resposta != 1 && resposta != 2);

            if (resposta == 1) {
                sim++;
            } else {
                nao++;
            }

            System.out.printf("Placar atual -> SIM: %d | NÃO: %d\n\n", sim, nao);
        }

        System.out.println("--- Pesquisa Finalizada ---");
        System.out.printf("Resultado Final: %d pessoas gostam e %d não gostam.\n", sim, nao);
        teclado.close();
    }
}