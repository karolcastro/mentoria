package br.com.exercicios.parteC;

import java.util.Scanner;

/*Elaborar um programa que leia uma matriz A 5x5. Construir uma matriz B 5x5 em que cada elemento seja o dobro correspondente à matriz A,
com exceção dos elementos da diagonal principal, os quais devem ser o triplo de cada elemento correspondente da matriz A. Apresentar a matriz B.*/

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] vetorA = new int[5][5];
        int[][] vetorB = new int[vetorA.length][vetorA.length];

        for(int i =0; i< vetorA.length; i++) {
            for(int j=0; j< vetorA.length; j++) {
                System.out.println("Digite um valor inteiro para A " + vetorA[i][j]);
                vetorA[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < vetorB.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                System.out.println("Digite um valor inteiro para B " + vetorB[i][j]);
                vetorB[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < vetorB.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if(i == j) {
                    vetorB[i][j] = vetorA[i][j] *3;
                } else {
                    vetorB[i][j] = vetorA[i][j] *2;
                }
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
    }
}