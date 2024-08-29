package ex11;

public class Cidade {
    String nome, estado;
    private int populacao = 0;

    public Cidade(String nome, String estado, int populacao) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
    }

    public int qtdPopulacao(){
        return populacao;
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