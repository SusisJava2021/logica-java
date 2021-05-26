public class OperadoresComparacao {

    public static void main(String[] args) {

        //MENOR QUE
        boolean menorQue = 5<10;
        System.out.println("MENOR QUE -> " + menorQue);

        //MAIOR QUE

        System.out.println(5 >10);

        //MENOR OU IGUAL A QUE
        System.out.println(10 <= 10);

        //MAIOR OU IGUAL A QUE
        System.out.println(5 >=10);

        //IGUALDADE
        System.out.println(5 == 10);

        //DIFERENTE
        System.out.println(5 !=10);

        System.out.println("------------------------------------------------");

        int x =5;
        System.out.println( x > 0); //True
        System.out.println( x == 3); //False
        System.out.println( 10<= 30); //True
        System.out.println( x !=2); //True

        System.out.println("-----------OPERADORES LOGICOS --- AND ou E----------------------------------");

        System.out.println(x <= 20 && x == 10); //True

        System.out.println(x > 0 && x != 3); //True

        System.out.println(x <= 20 && x == 10 && x != 3); //True

        System.out.println("-----------OPERADORES LOGICOS --- Or ou OU----------------------------------");

        System.out.println(x <= 20 || x == 10); // False
        System.out.println(x > 0 || x != 3); //True
        System.out.println(x <= 20 || x == 10 || x != 3); // False

        System.out.println("-----------OPERADORES LOGICOS --- Não ou not------------------------------");

        !(x == 10);

        !(x >= 2);

        !(x <= 20 && x == 10)

        System.out.println("-----------OPERADORES LOGICOS --- Or ou OU----------------------------------");



    }
}
