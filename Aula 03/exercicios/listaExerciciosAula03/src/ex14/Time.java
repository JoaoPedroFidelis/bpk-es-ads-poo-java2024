package ex14;

import java.util.Arrays;

public class Time {
    String nome, tecnico;
    private String jogadores[] = new String[10];
    private int numeroDeJogadores = 0;

    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public void adicionarJogador(String n){
        jogadores[numeroDeJogadores] = n;
        numeroDeJogadores++;
        System.out.println("Funcionario contratado: " + n);
    }
    public void removerJogador(String n){
        int jog = -1;
        for (int i = 0; i < numeroDeJogadores; i++) {
            if(jogadores[i] == n){
                jog = i;
                break;
            }
        }
        if(jog == -1){
            System.out.println("Funcionario não encontrado...");
        } else {
            for (int i = jog; i < numeroDeJogadores; i++) {
                jogadores[i] = jogadores[i+1];
            }
            System.out.println("Funcionario demitido: " + n);
        }
    }

    public void mostrarJogadores(){
        System.out.println("Jogadores:");
        for (int i = 0; i < numeroDeJogadores; i++) {
            if(jogadores[i] != null){
                System.out.println("* " + jogadores[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", jogadores=" + Arrays.toString(jogadores) +
                ", numeroDeJogadores=" + numeroDeJogadores +
                '}';
    }
}