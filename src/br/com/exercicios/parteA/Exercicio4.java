package br.com.exercicios.parteA;

// Elaborar um programa que leia dois valores numéricos inteiros, os quais devem representar
//a base e o expoente de uma potência.
//Calcular a potência, e exibir a operação calculada, e o resultado obtido.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base;
        double potencia;

        System.out.println("Entre com o valor da base: ");
        base = entrada.nextDouble();

        System.out.println("Entre com o valor da potencia: ");
        potencia = entrada.nextDouble();

        double valor = Math.pow(base,potencia);

        System.out.println("O resultado é: " + valor);

    }
}
