import java.util.Scanner;

public class Exercicio1003 {
    /* Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à
    variável SOMA. A seguir escrever o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido
pelo valor correspondente à soma de A e B. Como todos os problemas, não esqueça de imprimir o fim de linha após o
resultado, caso contrário, você receberá "Presentation Error".

Exemplos de Entrada	            Exemplos de Saída
        30                          SOMA = 40
        10

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // *** ENTRADA DE DADOS***

        int A, B;
        int SOMA;

        // *** PROCESSAMENTO ***

        A = 30;
        B = 10;
        SOMA = A + B;
        

        // ***SAIDA DE DADOS***

        System.out.println("SOMA = " + SOMA);

        scanner.close();
    }
    }
