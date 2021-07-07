package br.com.exercicios.parteB;

import java.util.Scanner;

//Elaborar um programa que leia um vetor A com dez elementos numéricos inteiros.
// Apresentar o total de elementos ímpares existente no vetor e também o percentual
// do valor total de números ímpares em relação à quantidade total de elementos armazenados.

public class Exercicios12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int contador =0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(" Informe 10 numeros inteiros: " + vetorA[i]);
            vetorA[i] = scan.nextInt();
        }
        for(int i =0; i < vetorA.length; i++) {
            if (vetorA[i] %2 != 0) {
                contador++;
            }
        }

            int porcentagemImpar = vetorA.length-contador;
            double porcentagem = (porcentagemImpar *100)/ vetorA.length;
            double valorPorcentagem = 100-porcentagem;


            for(int i =0; i < vetorA.length; i++) {
                    System.out.println("Os números informados são: " + vetorA[i] + " ");
            }
            System.out.println();
            System.out.println("Porcentagem de números ímpares informados é de: " + valorPorcentagem + "%");
        }

    }
