public class Exercicio1006 {

/**
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média 
 * do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada 
 * nota pode ir de 0 até 10.0, sempre com uma casa decimal.

    Entrada - O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

    Saída - Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto
     decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça 
     de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

    Exemplos de Entrada                 	Exemplos de Saída
            5.0                                 MEDIA = 6.3
            6.0
            7.0

 *  * 
 */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // *** Entrada de dados ***/

        double notaA = 2;
        double notaB = 3;
        double notaC = 5;
        double MEDIA;

        // *** Processamento ***

        MEDIA = (notaA*2 + notaB*3 +notaC*5)/10;

        // ***Saida de dados***

        System.out.printf("MEDIA = %.1f\n",MEDIA);












}