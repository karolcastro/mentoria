package br.com.exercicios.parteA;

///Elaborar um programa que calcule e apresente o valor do volume
/// de uma caixa retangular, utilizando a fórmula:
///Volume ← Comprimento * Largura * Altura

import br.com.exercicios.Exercicio;

public class Exercicio1 extends Exercicio {
    public Double altura1 = 5.0;
    public Double largura = 5.0;
    public Double comprimento = 5.0;
    public Double volumeCaixa;

    public double getVolume(Double altura, Double largura, Double comprimento) {
        altura1 = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.volumeCaixa = ((altura * largura) * comprimento);

        return volumeCaixa;

    }

    @Override
    public void executar() {
        Double guardarVolume = getVolume(altura1, largura, comprimento);

        System.out.println(String.format("O volume da caixa: %s", guardarVolume));

    }



}
