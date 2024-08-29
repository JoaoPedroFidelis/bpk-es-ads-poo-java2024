package ex15;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo game = new Jogo("Shovel Knight", "plataforma", 30.2);
        System.out.println(game);
        System.out.println("");
        game.iniciar();
        System.out.println("");
        game.pausar(true);
        System.out.println("");
        System.out.println(game);
        System.out.println("");
        game.pausar(false);
        System.out.println("");
        System.out.println(game);
    }
}
