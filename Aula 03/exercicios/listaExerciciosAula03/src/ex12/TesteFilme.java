package ex12;

public class TesteFilme {
    public static void main(String[] args) {
        Filme filme = new Filme("Meu malvado favorito 4", "Chris Renaud", 200);
        System.out.println(filme);
        System.out.println("");
        filme.iniciar();
        System.out.println("");
        System.out.println(filme);
        System.out.println("");
        filme.parar();
        System.out.println("");
        System.out.println(filme);
    }
}
