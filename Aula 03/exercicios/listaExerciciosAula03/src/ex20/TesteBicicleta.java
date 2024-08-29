package ex20;

public class TesteBicicleta {
    public static void main(String[] args) {
        Bicicleta bicicle = new Bicicleta("Nike", "Aro20", 10);
        System.out.println(bicicle);
        System.out.println("");
        bicicle.pedalar(true);
        bicicle.pedalar(false);
        System.out.println("");
        bicicle.frear(true);
        bicicle.frear(false);
    }
}
