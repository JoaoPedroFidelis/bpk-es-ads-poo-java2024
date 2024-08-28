package ex8;

public class Professor {
    String nome, disciplina;
    private double salario;
    private boolean aula = false, provas = false;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public double verSalario(){
        return salario;
    }

    public boolean dandoAula(){
        return aula;
    }
    public void darAula(boolean set){
        aula = set;
        if(aula) System.out.println("Professor esta dando aula");
        else System.out.println("Professor parou de dar aula");
    }

    public boolean corrigindo(){
        return provas;
    }
    public void corrigirProvas(boolean set){
        provas = set;
        if(provas) System.out.println("Professor esta corrigindo as provas");
        else System.out.println("Professor parou de corrigir...");
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", salario=" + salario +
                '}';
    }
}
/*
Crie uma classe Professor com atributos
nome, disciplina, e salario.
Adicione métodos para dar aula e corrigir provas.
*/