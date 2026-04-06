package Github.Java.Java_P2_LP1_AV1;
import java.util.Scanner;

public class AV1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== PAINEL DA AULA 6 ===");
            System.out.println("1 - Questão 1");
            System.out.println("0 - Sair");
            System.out.print("Qual código você quer rodar? ");
            
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    Q1.executar(); 
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    teclado.nextLine();
            }
        } while (opcao != 0);

        teclado.close();
    }
}
