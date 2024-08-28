package ex1;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("Senhor dos aneis", "João pedro fidelis", 3);
        System.out.println(livro);
        System.out.println("");
        livro.open();
        livro.open();
        livro.lerPagina();
        livro.lerPagina();
        livro.lerPagina();
        System.out.println("");
        System.out.println(livro);
    }
}
