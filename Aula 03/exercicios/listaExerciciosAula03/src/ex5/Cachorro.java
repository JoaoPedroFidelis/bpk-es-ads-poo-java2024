package ex5;

public class Cachorro {
    private String nome, raca;
    private int idade;
    private boolean correndo = false, latindo = false;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public int getIdade(){ return idade; }
    public boolean getCorrendo(){ return correndo; }
    public boolean getLatindo(){ return latindo; }
    public String getNome() { return nome; }
    public String getRaca() { return raca; }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade não pode ser negativa");
            return;
        }
        this.idade = idade;
    }
    public void setNome(String nome) {
        if(nome == null && nome.isEmpty()){
            System.out.println("Nome não pode ser vazio.");
            return;
        }
        this.nome = nome;
    }
    public void setRaca(String raca) {
        if(raca == null && raca.isEmpty()){
            System.out.println("Raça não pode ser vazio.");
            return;
        }
        this.raca = nome;
    }

    public void correr(boolean set){
        correndo = set;
        if(correndo) System.out.println("Cachorro correndo!");
        else System.out.println("Cachorro parou de correr...");
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