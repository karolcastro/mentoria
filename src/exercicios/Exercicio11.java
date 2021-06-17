package exercicios;

////Elaborar um programa que leia dois vetores A e B com 5 elementos. O vetor A deve aceitar apenas a entrada de valores divisíveis por 2 ou 3,
// enquanto o vetor B deve aceitar apenas a entrada de valores que não sejam múltiplos de 5.
// A entrada dos vetores deve ser validada pelo programa, e não pelo usuário.
// Construir um vetor C que seja o resultado da junção dos vetores A e B, de forma que contenha 10 elementos.
// Apresentar os elementos do vetor C


/**
 * <p>Exercicio11</p>
 *
 * @author Karol de Castro
 */

public class Exercicio11 extends Exercicio {

        static final int QUANTIDADE_DE_LEITURA_A = 5;
        static final int QUANTIDADE_DE_LEITURA_B = 5;
        static final int QUANTIDADE_DE_LEITURA_C = 10;

        @Override
        public void executar() {
            final int[] vetorA = new int[QUANTIDADE_DE_LEITURA_A];
            final int[] vetorB = new int[QUANTIDADE_DE_LEITURA_B];

            for (int i = 0; i < QUANTIDADE_DE_LEITURA_A; i++) {
                System.out.println("Informe 5 números divisivel por 2 ou 3 ");
                final String valorA = lerDoConsole();
                vetorA[i] = Integer.valueOf(valorA);

                for (int j = 0; j < QUANTIDADE_DE_LEITURA_B; j++) {
                    System.out.println("Informe 5 números não divisiveis por 5 ");
                    final String valorB = lerDoConsole();
                    vetorB[j] = Integer.valueOf(valorB);
                }
                calcularVetor(vetorA);
            }
            calcularVetor(vetorB);
        }

        private void calcularVetor ( final int[] vetorCalcular){
            int contadorA = 0;
            int contadorB = 0;
            int contadorC;
            for (int i = 0; i < vetorCalcular.length; i++) {
                if ((vetorCalcular[i] % 2 == 0) || (vetorCalcular[i] % 3 == 0)) {
                    contadorA++;
                } else {
                    System.out.println("Este numero nao é divisivel por 2 ou 3");
                }
            }

            for (int j = 0; j < vetorCalcular.length; j++) {
                if (vetorCalcular[j] % 5 != 0) {
                    contadorB++;
                } else {
                    System.out.println("Este numero é divisivel por 5");
                }
            }
            contadorC = contadorA + contadorB;

            System.out.println(String.format("A quantidade de pares é: %s", contadorA));
            System.out.println(String.format("A quantidade de pares é: %s", contadorB));
            System.out.println(String.format("A quantidade de pares é: %s", contadorC));


        }
    }
