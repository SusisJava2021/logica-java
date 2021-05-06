/*
Suponha um programa que solicita ao usuario dois numeros e depois mostra a media aritimetica deles:


    Ex:
         *** ENTRADA DE DADOS***
         Digite o primeiro numero: 3
         Digite o segundo numero: 6

         *** PROCESSAMENTO ***
         MEDIA = (3 + 6) / 2

         ***SAIDA DE DADOS***
         Media aritimetia: 4.5

 */


public class CalculaMediaAritimetica {

    public static void main(String[] args){

        // *** ENTRADA DE DADOS***
        System.out.println("Digite o primeiro valor");
        double primeiroNumero = 3.4;

        System.out.println("Digite o segundo o valor");
        double segundoNumero = 6.9;

        // *** PROCESSAMENTO ***
        double resultado = (primeiroNumero + segundoNumero) / 2;

        // ***SAIDA DE DADOS***
        System.out.println("0 resultado e " + resultado);

    }
}

