import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu peso na terra (em kg): ");
        double pesoTerra = scanner.nextDouble();
        
        double pesoMercurio = pesoTerra * 0.37;
        double pesoVenus = pesoTerra * 0.88;
        double pesoMarte = pesoTerra * 0.38;
        double pesoJupiter = pesoTerra * 2.64;
        double pesoSaturno = pesoTerra * 1.15;
        double pesoUrano = pesoTerra * 1.17;
        double pesoNetuno = pesoTerra * 1.18;
        
        System.out.println("Peso em Mercurio: " + pesoMercurio + " kg");
        System.out.println("Peso em Venus: " + pesoVenus + " kg");
        System.out.println("Peso em Marte: " + pesoMarte + " kg");
        System.out.println("Peso em Jupiter: " + pesoJupiter + " kg");
        System.out.println("Peso em Saturno: " + pesoSaturno + " kg");
        System.out.println("Peso em Urano: " + pesoUrano + " kg");
        System.out.println("Peso em Netuno: " + pesoNetuno + " kg");
        
        scanner.close();
    }
}