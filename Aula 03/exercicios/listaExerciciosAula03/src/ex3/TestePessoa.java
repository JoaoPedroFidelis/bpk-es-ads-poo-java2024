package ex3;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João Pedro Fidelis", 17, 1.6);
        System.out.println(pessoa);
        System.out.println("");
        pessoa.apresentar();
    }
}
