package br.com.exercicios.parteC;

/*Elaborar um programa que leia uma matriz A do tipo inteiro de cinco colunas e cinco linhas.
Ao final, apresentar o total de elementos pares e ímpares existentes na matriz.
Apresentar também o percentual de elementos pares e ímpares em relação ao total de elementos.*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[][] vetorA = new double[5][5];
        double totalPares = 0.0;
        double totalImpares = 0.0;
        double percentPares = 0.0;
        double percentImpares = 0.0;
        double soma = 0.0;


        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorA.length; j++) {
                System.out.println("Digite um valor inteiro para A ");
                vetorA[i][j] = scan.nextDouble();
            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorA.length; j++) {
                soma += vetorA[i][j];
            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorA.length; j++) {
                if (i % 2 == 1 || j % 2 == 1) {
                    totalImpares += vetorA[i][j];
                    percentImpares = (totalImpares * 100) / soma;
                } else {
                    totalPares += vetorA[i][j];
                    percentPares = (totalPares * 100) / soma;
                }
            }
        }
            System.out.println("A soma é = " + soma);
            System.out.println("O total de ímpares é = " + totalImpares);
            System.out.println("O total de pares é = " + totalPares);
            System.out.println("O percentual de ímpares é = " + percentImpares);
            System.out.println("O percentual de pares é =" +  percentPares);
        }
    }
