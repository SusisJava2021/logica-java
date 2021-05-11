import java.util.Locale;
import java.util.Scanner;
// https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

public class Concatenacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.printf("O meu nome é %s e tenho %d anos, minha altura é %.2f" , nome, idade, altura);

        scanner.close();

    }
}
