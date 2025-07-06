package Desafios.intermed6;

import java.util.Scanner;

public class Ninja {

    private String nome;
    private int idade;
    private String vila;
    Scanner Ninjax = new Scanner(System.in);

    public Ninja() {
        System.out.print("Nome: ");
        this.nome = Ninjax.next();
        System.out.print("Idade: ");
        this.idade = Ninjax.nextInt();
        System.out.print( "Aldeia: ");
        this.vila = Ninjax.next();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    @Override
    public String toString() {
        return "Ninja: " + nome +" - Idade: " +idade + " - Aldeia: " + vila;
    }

}