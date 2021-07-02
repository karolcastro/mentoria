package exercicios.parteB;

//Construir um programa que apresente todos os valores numéricos divisíveis por 4 e menores que 200.
//Restrição: Utilize o laço condicional pós-teste.

public class Exercicio3 {
    public static void main(String[] args) {

        for (int i = 0; i <= 200; i++) {
            if (i %4 == 0) {
                System.out.println("Os numeros menores que 200 e divisiveis por 4 são: " + i);
            }
        }
    }
}

