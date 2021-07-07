package br.com.exercicios.parteB;

//Elaborar um programa que leia dois vetores A e B com 5 elementos. O vetor A deve aceitar apenas a entrada de
// valores divisíveis por 2 ou 3, enquanto o vetor B deve aceitar apenas a entrada de valores que não sejam
// múltiplos de 5. A entrada dos vetores deve ser validada pelo programa, e não pelo usuário.
// Construir um vetor C que seja o resultado da junção dos vetores A e B, de forma que contenha 10 elementos. Apresentar os elementos do vetor C.

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int contador = 0;

        for(int i =0; i < vetorA.length; i++) {
            System.out.println("Informe 5 valores para A: " + vetorA[i]);
            vetorA[i] = scan.nextInt();
        }

        for(int i =0; i < vetorA.length; i++) {
            System.out.println("Informe 5 valores para B: " + vetorB[i]);
            vetorB[i] = scan.nextInt();
        }

        for(int i =0; i < vetorA.length; i++) {
            if(vetorA[i] %2 ==0 || vetorA[i] %3 ==0){
                System.out.println("Os numeros informados que são divisores por 2 e 3 são: " + vetorA[i] + " ");
                vetorA[i] = contador;
            }
        }

        for(int i =0; i < vetorB.length; i++) {
            if(vetorB[i] %5 !=0){
                System.out.println("Os numeros informados que não são divisores por 5 são: " + vetorB[i] + " ");
                vetorB[i] = contador;
            }
        }
    }
}
