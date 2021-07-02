package exercicios.parteA;

///Efetuar a leitura de quatro valores numéricos inteiros,
/// representados pelas variáveis A, B, C e D.
/// Apresentar apenas os valores que sejam divisíveis por e 2 e 3.

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int numero4;

        System.out.println("Entre com o nome do numero 1: ");
        numero1 = entrada.nextInt();

        System.out.println("Entre com o nome do numero 2: ");
        numero2 = entrada.nextInt();

        System.out.println("Entre com o nome do numero 3: ");
        numero3 = entrada.nextInt();

        System.out.println("Entre com o nome do numero 4: ");
        numero4 = entrada.nextInt();

        if (numero1 % 2 == 0 && numero1 % 3 == 0) {
            System.out.println("Número divisivel por 2 e 3 " + numero1);
        }
        if (numero2 % 2 == 0 && numero2 % 3 == 0) {
            System.out.println("Número divisivel por 2 e 3 " + numero2);
        }
        if (numero3 % 2 == 0 && numero3 % 3 == 0) {
            System.out.println("Número divisivel por 2 e 3 " + numero3);
        }
        if (numero4 % 2 == 0 && numero4 % 3 == 0) {
            System.out.println("Número divisivel por 2 e 3 " + numero4);
        } else {
            System.out.println("Nenhum dos números são divisiveis por 2 e 3");
        }
    }
}
