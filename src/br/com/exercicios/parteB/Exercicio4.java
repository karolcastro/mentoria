package br.com.exercicios.parteB;

//Elaborar um programa que apresente os resultados das potências do valor de base 3, elevando a um expoente que varie do valor 0 até o valor 15.

public class Exercicio4 {
    public static void main(String[] args) {
        int contador = 0;
        int base = 3;
        int potencia;
        while (contador <= 15) {
            potencia = base * contador;

            //System.out.println(potencia + " ");
            System.out.print(potencia + " ");
            contador += 1;
        }
    }
}