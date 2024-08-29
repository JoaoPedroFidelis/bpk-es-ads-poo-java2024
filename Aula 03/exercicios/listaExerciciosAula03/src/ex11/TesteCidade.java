package ex11;

public class TesteCidade {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Curitiba", "PR", 1200);
        System.out.println(cidade);
        System.out.println("");
        cidade.adicionarPopulacao(200);
        cidade.diminuirPopulacao(50);
        System.out.println("");
        System.out.println(cidade);
    }
}
