package ex14;

import java.util.Arrays;

public class Time {
    private String nome, tecnico;
    private String jogadores[] = new String[10];
    private int numeroDeJogadores = 0;

    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public String getNome() { return nome; }
    public String getTecnico() { return tecnico; }

    public void setNome(String nome) {
        if(nome == null && nome.isEmpty()){
            System.out.println("Nome não pode ser vazio.");
            return;
        }
        this.nome = nome;
    }
    public void setTecnico(String tecnico) {
        if(tecnico == null && tecnico.isEmpty()){
            System.out.println("Nome não pode ser vazio.");
            return;
        }
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