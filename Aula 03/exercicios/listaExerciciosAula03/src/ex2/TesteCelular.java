package ex2;

public class TesteCelular {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsumg", "AJ20", 100);
        System.out.println(celular);
        System.out.println("");
        celular.estado();
        celular.turn();
        celular.estado();
    }
}
