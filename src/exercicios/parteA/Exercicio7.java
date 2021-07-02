package exercicios.parteA;

import java.util.Scanner;

///Escrever um programa que leia o nome de um aluno e as notas de três provas, P1, P2 e P3.
/// O aluno é aprovado se possuir média aritmética (MD) acima de 7,
/// estará em recuperação entre 5 e 7, e será reprovado abaixo de 5.
/// Imprimir todos os dados capturados, e a situação do aluno.
///
///

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String aluno;
        double P1;
        double P2;
        double P3;

        System.out.println("Entre com o nome do aluno: ");
        aluno = entrada.next();

        System.out.println("Entre com a nota P1: ");
        P1 = entrada.nextInt();

        System.out.println("Entre com a nota P2: ");
        P2 = entrada.nextInt();

        System.out.println("Entre com a nota P3: ");
        P3 = entrada.nextInt();

        double media = (P1 + P2 + P3)/3;

        if(media >= 7.0) {
            System.out.println(aluno + " você passou! Sua média foi: " + media);
        }
        if(media >= 5.0 && media < 7.0) {
            System.out.println(aluno + " você esta de recuperação! Sua média foi: " + media);
        }
        if(media < 5.0) {
            System.out.println(aluno + " você não passou! Sua média foi: " + media);
        }

    }
}

