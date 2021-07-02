package exercicios.parteA;

import java.util.Scanner;

//Escrever um programa que receba três números inteiros como entrada
//e imprima, como saída, os números em ordem crescente.

public class Exercicio6 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            int A;
            int B;
            int C;

            System.out.println("Entre com o valor do primeiro numero: ");
            A = entrada.nextInt();

            System.out.println("Entre com o valor do segundo numero: ");
            B = entrada.nextInt();

            System.out.println("Entre com o valor do terceiro numero: ");
            C = entrada.nextInt();

            if(A <= B && A <= C && B <= C) {
                System.out.println("A sequencia é: " + A + B + C);
            }
            if(A <= B && A <= C && C <= B) {
                System.out.println("A sequencia é: " + A + C + B);
            }
            if(B <= A && B <= C && A <= C) {
                System.out.println("A sequencia é: " + B + A + C);
            }
            if(B <= A && B <= C && C <= A) {
                System.out.println("A sequencia é: " + B + C + A);
            }
            if(C <= A && C <= B && A <= B) {
                System.out.println("A sequencia é: " + C + A + B);
            }
            if(C <= A && C <= B && B <= A) {
                System.out.println("A sequencia é: " + C + B + A);
            }
        }
    }

