package ex8;

public class Professor {
    private String nome, disciplina;
    private double salario;
    private boolean aula = false, provas = false;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public String getDisciplina() { return disciplina; }
    public double getSalario(){ return salario; }
    public boolean getAula(){ return aula; }
    public boolean getProvas(){ return provas; }

    public void setNome(String nome) {
        if(nome == null && nome.isEmpty()){
            System.out.println("Nome não pode ser vazio.");
            return;
        }
        this.nome = nome;
    }
    public void setDisciplina(String disciplina) {
        if(disciplina == null && disciplina.isEmpty()){
            System.out.println("Curso não pode ser vazio.");
            return;
        }
        this.disciplina = disciplina;
    }
    public void setSalario(double salario) {
        if(salario < 0){
            System.out.println("Salario não pode ser negativo");
            return;
        }
        this.salario = salario;
    }

    public void darAula(boolean set){
        aula = set;
        if(aula) System.out.println("Professor esta dando aula");
        else System.out.println("Professor parou de dar aula");
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