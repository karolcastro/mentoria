package br.com.exercicios.parteA;

import java.util.Scanner;

//Efetuar a leitura de três valores inteiros desconhecidos representados pelas variáveis A, B e C.
//Somar os valores fornecidos e apresentar o resultado somente se for maior ou igual a 100.

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A;
        int B;
        int C;

        System.out.println("Entre com o numero  para A: ");
        A = entrada.nextInt();

        System.out.println("Entre com o numero para B : ");
        B = entrada.nextInt();

        System.out.println("Entre com o numero para C : ");
        C = entrada.nextInt();

        int soma = A+B+C;

        if(soma >= 100){
            System.out.println("A soma é: " + soma);
        }else {
            System.out.println("A soma nao foi maior que 100");
        }
}
    }