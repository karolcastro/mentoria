package exercicios;

////Elaborar um programa que leia um vetor A com dez elementos numéricos inteiros.
// Apresentar o total de elementos ímpares existente no vetor e também o percentual
// do valor total de números ímpares em relação à quantidade total de elementos armazenados.

/**
 * <p>Exercicio12</p>
 *
 * @author Gustavo Aquino
 */
public class Exercicio12 extends Exercicio {
    // Constantes
    static final int QUANTIDADE_DE_LEITURAS = 6;
    // public properties
    // protected properties
    // package-local (no modifier) properties
    // private properties
    // construtor
    //Exercicio12() {
        // alguma lógica
    //}
    @Override
    public void executar() {
        final int[] vetor = new int[QUANTIDADE_DE_LEITURAS];
        for (int i = 0; i < QUANTIDADE_DE_LEITURAS; i++) {
            System.out.println("Digite um número: ");
            final String valor = lerDoConsole();
            vetor[i] = Integer.valueOf(valor);
        }
        calcularParesEImpares(vetor);
    }
    /**
     * Calcula a quantidade de pares, ímpares e o percentual de números
     * ímpares de um vetor de números inteiros.
     *
     * @param vetorParaCalcular Vetor que será calculado.
     */
    private void calcularParesEImpares(final int[] vetorParaCalcular) {
        int contadorDePares = 0;
        int contadorDeImpares = 0;
        float percentualDeImpares;
        for (int i = 0; i < vetorParaCalcular.length; i++) {
            if (vetorParaCalcular[i] % 2 == 1) {
                contadorDeImpares++;
            } else {
                contadorDePares++;
            }
        }
        if (contadorDePares == 0) {
            System.out.println("O contador é 0");
        }
        percentualDeImpares =
                (float) contadorDeImpares
                        / (float) vetorParaCalcular.length
                        * 100.0f;
        System.out.println(String.format("A quantidade de pares é: %s", contadorDePares));
        System.out.println(String.format("A quantidade de ímpares é: %s", contadorDeImpares));
        System.out.println(String.format("O percentual de ímpares em relação ao total é: %.2f%",
                percentualDeImpares));
    }
}
