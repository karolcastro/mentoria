package br.com.exercicios.parteB;

//A partir do exercício 5, os próximos deverão utilizar vetores para armazenar os valores lidos.

//Elaborar um programa para calcular o máximo divisor comum de dois números inteiros positivos, MDC(x, y), usando o algoritmo de Euclides
// Este algoritmo é baseado no fato de que se o resto da divisão de x por y representado por r, for igual a zero, y é o MDC.
//Se o resto r for diferente de zero, o MDC de x e y é igual ao MDC de y e r.
//O processo se repete até que o valor do resto da divisão seja zero.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int X ;
        int Y;
        int resto;

        System.out.println("Entre com o valor de X ");
        X = scan.nextInt();

        System.out.println("Entre com o valor de Y ");
        Y = scan.nextInt();

       while (Y != 0){
           resto = X % Y;
           X = Y;
           Y = resto;
       }
       System.out.println("O maximo divisor comum entre X e Y é: " + X);
}
    }