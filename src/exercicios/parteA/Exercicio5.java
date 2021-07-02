package exercicios.parteA;

import java.util.Scanner;


///Construir um programa que leia um valor numérico inteiro e apresente como resultado armazenado
/// os seus valores sucessor e antecessor.
///
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cotacao;
        double dolar;
        double valor;

        System.out.println("Entre com a cotação do dolar: ");
        cotacao = entrada.nextInt();

        System.out.println("Entre com o valor que deseja converter: ");
        dolar = entrada.nextDouble();

        valor = cotacao * dolar;

        System.out.println("O valor em Reias é: " + valor);

    }
}
