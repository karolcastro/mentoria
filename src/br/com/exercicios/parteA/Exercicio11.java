package br.com.exercicios.parteA;

import java.util.Scanner;

//Efetuar a leitura de um valor numérico inteiro que esteja na faixa de 1 até 9.
//O programa deverá apresentar uma mensagem "O valor está na faixa permitida", caso o valor informado esteja na faixa.
//Se o valor estiver fora da faixa permitida, deverá apresentar a mensagem "O valor está fora da faixa permitida".

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = 9;

        System.out.println("Entre com o nome do numero : ");
        numero = entrada.nextInt();

        if(numero <= 9) {
            System.out.println("O valor esta a faixa permitida");
        }else {
            System.out.println("O valor esta fora da faixa permitida");
        }
}
    }
