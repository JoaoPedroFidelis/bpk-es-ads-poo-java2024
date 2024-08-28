package ex7;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(0, "ADS", "João pedro fidelis");
        System.out.println(aluno);
        System.out.println("");
        aluno.adicionarNota(10);
        aluno.adicionarNota(9);
        aluno.adicionarNota(8);
        System.out.println("");
        System.out.println(aluno);
        System.out.println("\nMedia:" + aluno.mediaNotas());
    }
}
