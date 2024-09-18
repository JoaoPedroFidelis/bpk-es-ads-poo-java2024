package ex15;

public class Jogo {
    private String nome, genero;
    private double preco;
    private boolean iniciado = false;
    private boolean pause = false;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public String getGenero() { return genero; }
    public double getPreco() { return preco; }
    public boolean getPause(){
        return pause;
    }
    public boolean getIniciado(){
        return iniciado;
    }

    public void setNome(String nome) {
        if(nome == null && nome.isEmpty()){
            System.out.println("Nome não pode ser vazio.");
            return;
        }
        this.nome = nome;
    }
    public void setGenero(String genero) {
        if(genero == null && genero.isEmpty()){
            System.out.println("Genero não pode ser vazio.");
            return;
        }
        this.genero = genero;
    }
    public void setPreco(double preco) {
        if(preco < 0){
            System.out.println("Preco não pode ser negativo.");
            return;
        }
        this.preco = preco;
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