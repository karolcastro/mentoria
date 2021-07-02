package exercicios.parteB;

//Elaborar um programa que leia 3 valores inteiros, armazene-os em um vetor, e percorra o vetor calculando o fatorial de cada valor lido. No final,
// deverá apresentar o somatórios dos valores calculados.

//A partir do exercício 5, os próximos deverão utilizar vetores para armazenar os valores lidos.

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[3];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for(int i =0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posicao A " + i);
            vetorA[i] = scan.nextInt();
        }
        for(int i =0; i < vetorA.length; i++) {
            vetorB[i] =1;
            for(int j =1; j<= vetorA[i]; j++) {
                vetorB[i] *= j;
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

        System.out.print("Vetor B = ");
        for(int i=0; i < vetorC.length; i++){
            vetorC[i]= vetorA[i] + vetorB[i];

            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}