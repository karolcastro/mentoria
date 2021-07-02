package exercicios.parteB;

//Elaborar um programa que mostre os resultados da tabuada, de 0 até 10, de um número qualquer.
//Restrição: Utilize o laço condicional pré-teste.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Entre com a tabuada que deseja ver: ");
        numero = entrada.nextInt();

        int contador = 0;

        while (contador <= 10) {
            int resultado = numero * contador;
            System.out.println(numero + "X" + contador + "= " + resultado);
            contador ++;
        }
}
    }
