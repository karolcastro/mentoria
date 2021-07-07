package br.com.exercicios.parteC;

import java.util.Scanner;

/*Elaborar um programa que leia uma matriz A e B do tipo inteiro de cinco colunas e cinco linhas.
A matriz A deve ser formada por valores divisíveis por 3 e 4,
enquanto a matriz B deve ser formada por valores divisíveis por 5 e 6.
As entradas do usuário deverão ser validadas pelo programa.
Construir e apresentar uma matriz C de mesma dimensão que contenha o valor da multiplicação dos
elementos da matriz A com os elementos correspondentes da matriz B. Apresentar as três matrizes. */

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] vetorA = new int[5][5];
        int[][] vetorB = new int[5][5];
        int[][] vetorC = new int[5][5];
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorA.length; j++) {
                System.out.println("Digite um valor inteiro divisivel por 3 ou 4 para A " );
                if (vetorA[i][j] %3 == 0 || vetorA[i][j] %4 == 0) {
                    soma = vetorA[i][j];
                } else {
                    System.out.println("Digite um valor válido inteiro para A " );
                }
                vetorA[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < vetorB.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                System.out.println("Digite um valor inteiro divisil por 5 ou 6 para B " );
                if (vetorB[i][j] %5 == 0 || vetorB[i][j] %6 == 0) {
                } else {
                    System.out.println("Digite um valor válido inteiro para B " );
                }
                vetorB[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorA.length; j++) {
                if (vetorA[i][j] % 3 == 0 || vetorA[i][j] % 4 == 0) {
                    vetorA[i][j]++;
                }
            }
        }
        for (int i = 0; i < vetorB.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorB[i][j] % 5 == 0 || vetorB[i][j] % 6 == 0) {
                    vetorB[i][j]++;
                }
            }
        }
        for (int i = 0; i < vetorC.length; i++) {
            for (int j = 0; j < vetorC.length; j++) {
                vetorC[i][j] = vetorA[i][j] * vetorB[i][j];
            }
        }


        System.out.print("Vetor A = ");
        for(int i=0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorA.length; j++) {
                System.out.print(vetorA[i][j] + " ");
            }
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for(int i=0; i < vetorB.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                System.out.print(vetorB[i][j] + " ");
            }
        }
        System.out.println();

        System.out.print("Vetor C = ");
        for(int i=0; i < vetorC.length; i++) {
            for (int j = 0; j < vetorC.length; j++) {
                System.out.print(vetorC[i][j] + " ");
            }
        }
        System.out.println();

    }
}
