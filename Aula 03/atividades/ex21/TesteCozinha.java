package ex21;

public class TesteCozinha {
    public static void main(String[] args) {
        Cozinha kitchen = new Cozinha("Azul", 20);
        System.out.println(kitchen);
        System.out.println("");
        kitchen.limpar();
        kitchen.limpar();
        System.out.println("");
        kitchen.cozinhar(true);
        kitchen.cozinhar(false);
    }
}
