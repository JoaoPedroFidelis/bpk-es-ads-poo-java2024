package ex14;

public class TesteTime {
    public static void main(String[] args) {
        Time time = new Time("Flamengo", "Tite");
        System.out.println(time);
        System.out.println("");
        time.adicionarJogador("João");
        time.adicionarJogador("Gabriel");
        time.adicionarJogador("Matheus");
        System.out.println("");
        time.mostrarJogadores();
        System.out.println("");
        time.removerJogador("João");
        System.out.println("");
        time.mostrarJogadores();

    }
}
