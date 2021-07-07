package br.com.exercicios.parteB;

//Elaborar um programa que leia dois vetores (denominados A e B) com 5 elementos reais.
// Construir um vetor denominado C, onde cada elemento deverá corresponder a
// subtração do elemento correspondente do vetor A com um elemento correspondente do vetor B.
// Ao final, apresentar os elementos do vetor C.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre um um valor para o vetor A " + vetorA[i]);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre um um valor para o vetor B " + vetorB[i]);
            vetorB[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorB[i] + vetorA[i];

            System.out.print(vetorC[i] + " ");
        }
    }

}
