package br.com.exercicios.parteB;

//Elaborar um programa que apresente todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20.
//Restrição: Utilize o laço incondicional.

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        for(int i = 0; i <=20; i++) {
            if(i %2 ==1) {

                System.out.println("Numeros impares na faixa de 0 a 20: " + i);
            }
        }
}
}
