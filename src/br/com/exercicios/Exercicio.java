package br.com.exercicios;

import java.io.Console;

public abstract class Exercicio {

    public abstract void executar();

    public String lerDoConsole(){
        Console console = System.console();

        return console.readLine();
    }
}
