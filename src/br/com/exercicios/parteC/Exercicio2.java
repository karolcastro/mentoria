package br.com.exercicios.parteC;


/*Elaborar um programa que leia dois vetores A e B, para 5 elementos reais. Construir uma matriz C de duas dimensões,
sendo a primeira coluna da matriz C formada pelos elementos do vetor A multiplicados por 2 e a segunda coluna formada
pelos elementos do vetor B subtraídos por 5. Apresentar a matriz C.*/


import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[][] vetorC = new int[2][2];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um valor inteiro para A " + vetorA[i]);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite um valor inteiro para B " + vetorB[i]);
            vetorB[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            for (int j = 0; j < vetorC.length; j++) {
                vetorC[i][0] = vetorA[i] * 2;
            vetorC[j][1] = vetorB[i] - 5;
        }
    }
        System.out.print("Vetor A = ");
        for(int i=0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for(int i=0; i < vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C = ");
        for(int i=0; i < vetorC.length; i++){
            for(int j=0; j < vetorC.length; j++){
            System.out.print(vetorC[i][j] + " ");
        }}
        System.out.println();

    }
}
