package ex6;

public class TesteComputador {
    public static void main(String[] args) {
        Computador computador = new Computador("AMD", 16, 20.5);
        System.out.println(computador);
        System.out.println("");
        computador.ligar(true);
        computador.ligar(false);
    }
}
