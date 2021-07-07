package br.com.exercicios.parteC;

import java.util.Scanner;

/*Elaborar um programa que leia uma matriz A do tipo real de duas dimensões com cinco linhas e cinco colunas.
Apresentar o somatório dos elementos situados nas posições de linha e coluna ímpares da diagonal principal da referida matriz.*/


public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] vetorA = new int[5][5];
        int soma = 0;

        for(int i =0; i< vetorA.length; i++) {
            for(int j=0; j< vetorA.length; j++) {
                System.out.println("Digite um valor inteiro para A " + vetorA[i][j]);
                vetorA[i][j] = scan.nextInt();
            }
        }
        for(int i =0; i< vetorA.length; i++) {
            for(int j=0; j< vetorA.length; j++) {
                if(i == j && i %2 ==1 || i==j && j %2 ==1) {
                    soma += vetorA[i][j];
                }
            }
        }
        System.out.print("A soma da diagonal é = " + soma);
    }
}