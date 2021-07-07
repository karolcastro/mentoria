package br.com.exercicios.parteB;

import java.util.Scanner;

/// Elaborar um programa que leia 10 elementos (valores reais) para temperatura em graus Celsius e
//armazene esses valores em um vetor A. O programa ao final deve apresentar a menor,
//a maior e a média das temperaturas lidas.

// refazer para receber 10

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de temperatura: ");
        int qtdTemp = scan.nextInt();

        double temperatura;
        double menorTemperatura = Double.MAX_VALUE;
        double maiorTemperatura = Double.MIN_VALUE;
        double soma = 0;

        for(int i =1; i <= qtdTemp; i++) {
            System.out.println("Informe a temperatura: " + i);
            temperatura = scan.nextDouble();
            soma += temperatura;

            if(temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
            }
            if( temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }
        }
        System.out.println("A maior da temperatura é: " + maiorTemperatura);
        System.out.println("A maior da temperatura é: " + menorTemperatura);
        System.out.println("a Média da temperatura é: " + (soma/qtdTemp));

    }
}