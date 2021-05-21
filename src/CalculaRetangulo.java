import java.util.Locale;
import java.util.Scanner;

public class CalculaRetangulo {

    public static void main(String[] args) {

        //Configurando a entrada de dados para aceitar PONTO
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base");
        double base = scanner.nextDouble();
        System.out.println("Digite o valor da altura");
        double altura = scanner.nextDouble();


        double area = base * altura;
        double perimetro = 2 * base + 2 * altura;
        double diagonal = Math.sqrt(Math.pow(area, 2) + Math.pow(altura, 2));

        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);


    }
}
