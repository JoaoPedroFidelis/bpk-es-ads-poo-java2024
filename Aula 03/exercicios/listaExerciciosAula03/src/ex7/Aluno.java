package ex7;

import java.util.Arrays;

public class Aluno {
    String nome, curso;
    int matricula;
    private float notas[] = new float[10];
    private int lenNota = 0;

    public Aluno(int matricula, String curso, String nome) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    public void adicionarNota(float num){
        notas[lenNota] = num;
        lenNota++;
        System.out.println("Nota adicionada: " + num);
    }
    public float mediaNotas(){
        float average = 0;
        for (int i = 0; i < lenNota; i++) {
            average += notas[i];
        }
        average /= lenNota;
        return average;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", matricula=" + matricula +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}