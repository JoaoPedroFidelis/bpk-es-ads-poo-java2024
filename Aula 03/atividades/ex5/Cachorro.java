package ex5;

public class Cachorro {
    String nome, raca;
    int idade;
    private boolean correndo = false, latindo = false;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public boolean estaCorrendo(){
        return correndo;
    }

    public void correr(boolean set){
        correndo = set;
        if(correndo) System.out.println("Cachorro correndo!");
        else System.out.println("Cachorro parou de correr...");
    }

    public boolean estaLatindo(){
        return latindo;
    }
    public void latir(boolean set){
        latindo = set;
        if(latindo) System.out.println("Cachorro esta latindo!");
        else System.out.println("Cachorro parou de latir...");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", correndo=" + correndo +
                ", latindo=" + latindo +
                '}';
    }
}