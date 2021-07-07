package br.com.exercicios.parteA;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double cotacao;
        double dolar;
        double valor;

        System.out.println("Entre com a cotação do dolar: ");
        cotacao = entrada.nextDouble();

        System.out.println("Entre com o valor que deseja converter: ");
        dolar = entrada.nextDouble();

        valor = cotacao * dolar;

        System.out.println("O valor em Reias é: " + valor);

    }
}

