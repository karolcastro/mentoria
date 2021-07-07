package br.com.exercicios.parteB;

//A partir do exercício 5, os próximos deverão utilizar vetores para armazenar os valores lidos.

//Elaborar um programa que leia um vetor A de 5 elementos inteiros. Construir um vetor B do mesmo tipo, e
//cada elemento do vetor B deve ser o resultado da fatorial correspondente de cada elemento do vetor A. Apresentar os vetores A e B.

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for(int i =0; i < vetorA.length; i++) {
            System.out.println("Informe 5 valores para A: " + vetorA[i]);
            vetorA[i] = scan.nextInt();
        }
        for(int i =0; i < vetorA.length; i++) {
            System.out.println("Informe 5 valores para B: " + vetorB[i]);
            vetorB[i] = scan.nextInt();
        }
        for(int i=0; i < vetorA.length; i++){
            vetorB[i] = 1;
            for(int j=1; j<vetorA[i]; j++) {
                vetorB[i] *= j;

            }}
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

            }
        }

