package ex11;

public class Cidade {
    private String nome, estado;
    private int populacao = 0;

    public Cidade(String nome, String estado, int populacao) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
    }

    public String getNome() { return nome; }
    public String getEstado() { return estado; }
    public int getPopulacao(){
        return populacao;
    }

    public void setNome(String nome) {
        if(nome == null && nome.isEmpty()){
            System.out.println("Nome não pode ser vazio.");
            return;
        }
        this.nome = nome;
    }
    public void setEstado(String estado) {
        if(estado == null && estado.isEmpty()){
            System.out.println("Estado não pode ser vazio.");
            return;
        }
        this.estado = estado;
    }

    public void adicionarPopulacao(int qtd){
        if(qtd <= 0){
            System.out.println("Quantidade não pode ser negativa.");
            return;
        }
        populacao += qtd;
        System.out.println("Quantidade adicionada a população!");
    }
    public void diminuirPopulacao(int qtd){
        if(qtd <= 0){
            System.out.println("Quantidade não pode ser negativa.");
            return;
        }
        if(populacao - qtd < 0){
            System.out.println("População insuficiente...");
            return;
        }
        populacao -= qtd;
        System.out.println("População removida...");
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                ", populacao=" + populacao +
                '}';
    }
}