package ex15;

public class Jogo {
    String nome, genero;
    double preco;
    private boolean iniciado = false;
    private boolean pause = false;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public boolean jogoPausado(){
        return pause;
    }
    public void pausar(boolean set){
        if(iniciado == false){
            System.out.println("Jogo não foi iniciado...");
            return;
        }
        pause = set;
        if(pause) System.out.println("Jogo pausado!");
        else System.out.println("Jogo despausado!");
    }

    public boolean jogoIniciado(){
        return iniciado;
    }
    public void iniciar(){
        if(iniciado == true){
            System.out.println("Jogo ja foi iniciado...");
            return;
        }
        iniciado = true;
        System.out.println("Jogo iniciado!");
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", preco=" + preco +
                ", iniciado=" + iniciado +
                ", pause=" + pause +
                '}';
    }
}