package exercicios.parteA;

import java.util.Scanner;

//Ler um valor numérico inteiro e apresente uma
//mensagem informando se o valor fornecido é par ou ímpar

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;

        System.out.println("Entre com o nome do numero 1: ");
        numero1 = entrada.nextInt();

        if(numero1 %2 == 0) {
            System.out.println("O numero é par");
        }else {
            System.out.println("O numero é impar");
        }
    }
}
