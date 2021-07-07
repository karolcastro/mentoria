package br.com.exercicios.parteB;

import java.util.Scanner;

//Elaborar um programa que leia 10 elementos inteiros e armazene em um vetor A.
// Apresentar os valores do vetor lido de maneira inversa, e identificar qual é o menor valor armazenado.

public class Exercicio10 {
    public static void main(String[] args) {

        int[] vetorA = {1,2,3,4,5,6,7,8,9,10};

        for (int i = vetorA.length - 1; i >= 0; i--) {
            System.out.print(vetorA[i] + " ");

        }
    }
}