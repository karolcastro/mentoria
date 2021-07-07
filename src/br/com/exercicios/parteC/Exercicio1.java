package br.com.exercicios.parteC;

import java.util.Scanner;

/*Elaborar um programa que leia duas matrizes A e B, cada uma de duas dimensões com três linhas e três colunas para valores inteiros.
Construir uma matriz C de mesma dimensão, que seja formada da soma dos elementos da matriz A com os elementos da matriz B.
Apresentar os elementos da matriz C.*/

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] vetorA = new int[3][3];
        int[][] vetorB = new int[3][3];
        int[][] vetorC = new int[3][3];

        for(int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorA.length; j++) {
                System.out.println("Digite um valor inteiro para A " + vetorA[i][j]);
                vetorA[i][j] = scan.nextInt();
            }
        }
        for(int i =0; i < vetorB.length; i++) {
            for (int j =0; j < vetorB.length; j++) {
                System.out.println("Digite um valor inteiro para B " + vetorB[i][j]);
                vetorB[i][j] = scan.nextInt();
            }
        }
        for(int i =0; i < vetorC.length; i++) {
            for(int j=0; j < vetorC.length; j++) {
                vetorC[i][j] = vetorA[i][j]+ vetorB[i][j];
                System.out.print(vetorC[i][j] + " ");
            }
        }
    }
}