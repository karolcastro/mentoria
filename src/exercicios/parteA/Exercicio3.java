package exercicios.parteA;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A;
        int B;

        System.out.println("Entre com o valor de A: ");
        A = entrada.nextInt();

        System.out.println("Entre com o valor de B: ");
        B = entrada.nextInt();

        double divisao = A/B;
        int multiplicacao = A*B;
        int adicao = A+B;
        int subtracao = A-B;

        if(A >= B || A == B || A <= B) {
            System.out.println("O valor da divisão é: " + divisao);
            System.out.println("O valor da multiplicação é: " + multiplicacao);
            System.out.println("O valor da adição é: " + adicao);
            System.out.println("O valor da subtração é: " + subtracao);
        }
    }
}
