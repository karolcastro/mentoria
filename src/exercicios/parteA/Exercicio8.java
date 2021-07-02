package exercicios.parteA;

///A sequência de Fibonacci é formada pelos números:
//0, 1, 2, 3, 5, 8, 13, 21, …
///Sendo o primeiro número da série 0, o segundo 1, e os subsequentes
/// a soma dos dois anteriores. Escrever um programa que imprima os 13 primeiros termos da série.

public class Exercicio8 {

    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 0;

        for (int i = 0; i < 13; i++) {
            numero1 = numero1 + numero2;
            numero2 = numero1 - numero2;

            System.out.println(numero1);
        }
    }
}
