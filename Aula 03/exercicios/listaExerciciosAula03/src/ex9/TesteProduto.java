package ex9;

public class TesteProduto {
    public static void main(String[] args) {
        Produto pdt = new Produto("Coca-cola", 5.5, 10);
        System.out.println(pdt);
        System.out.println("");
        pdt.adicionarEstoque(5);
        pdt.diminuirEstoque(1);
        System.out.println("");
        System.out.println(pdt);
    }
}
