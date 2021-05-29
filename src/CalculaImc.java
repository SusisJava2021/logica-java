import java.util.Scanner;

public class CalculaImc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();

        double imc = (peso / altura * altura);

        if (imc < 18.5) {
            System.out.println("Magreza");
        }

        if (imc => 18.5 && imc => 24.9) {
            System.out.println("Normal");
        }
        if (imc => 24.9 && 29.9) {
            System.out.println("Sobrepeso");
        }
        if (imc => 30.0 && 39.9) {
            System.out.println("Obesidade");
        }
        if (imc > 40.0) {
            System.out.println("Obesidade morbida");
        }

        System.out.println();

        scanner.close();

    }
}
