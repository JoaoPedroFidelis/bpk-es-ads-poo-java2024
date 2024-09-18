package ex7;

import java.util.Arrays;

public class Aluno {
    private String nome, curso;
    private int matricula;
    private float notas[] = new float[10];
    private int lenNota = 0;

    public Aluno(int matricula, String curso, String nome) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getNome() { return nome; }
    public String getCurso() { return curso; }
    public int getMatricula() { return matricula; }
    public float[] getNotas() { return notas; }

    public void setNome(String nome) {
        if(nome == null && nome.isEmpty()){
            System.out.println("Nome não pode ser vazio.");
            return;
        }
        this.nome = nome;
    }
    public void setCurso(String curso) {
        if(curso == null && curso.isEmpty()){
            System.out.println("Curso não pode ser vazio.");
            return;
        }
        this.curso = curso;
    }
    public void setMatricula(int matricula) {
        if(matricula < 0){
            System.out.println("Matricula não pode ser de um numero negativa");
            return;
        }
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