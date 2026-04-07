
import java.util.Scanner;

public class Q1_AV1 {
    public static void executar(Scanner teclado) {
        int sim = 0;
        int nao = 0;

        for (int i = 0; i < 15; i++) {
            System.out.println("Você gosta de beterraba? Digite 1 para SIM e 2 para NÃO:");
            int resposta = teclado.nextInt();

            if (resposta == 1) {
                sim++;
                System.out.println("Quantidade de SIM: " + sim);
                System.out.println("Quantidade de NÃO: " + nao);
                System.out.println("-----------------------------------");
            } else if (resposta == 2) {
                nao++;
                System.out.println("Quantidade de SIM: " + sim);
                System.out.println("Quantidade de NÃO: " + nao);
                System.out.println("-----------------------------------");
            } else {
                System.out.println("Entrada inválida. Por favor, digite apenas 1 ou 2.");
                System.out.println("-----------------------------------");
                i--;
            }
        }
    }
}