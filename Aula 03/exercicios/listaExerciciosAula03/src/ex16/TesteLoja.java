package ex16;

public class TesteLoja {
    public static void main(String[] args) {
        Loja store = new Loja("C-Vale", "Rua dos Pioneiros", "44 99123-1234");
        System.out.println(store);
        System.out.println("");
        store.abrirLoja(true);
        System.out.println("");
        System.out.println(store);
        System.out.println("");
        store.abrirLoja(false);
        System.out.println("");
        System.out.println(store);
    }
}
