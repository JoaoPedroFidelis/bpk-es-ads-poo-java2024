package ex9;

public class Produto {
    String nome;
    double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int estoque(){
        return quantidadeEstoque;
    }

    public void adicionarEstoque(int qtd){
        if(qtd <= 0){
            System.out.println("Quantidade não pode ser negativa.");
            return;
        }
        quantidadeEstoque += qtd;
        System.out.println(qtd + " Quantidade adicionada ao estoque!");
    }

    public void diminuirEstoque(int qtd){
        if(qtd <= 0){
            System.out.println("Quantidade não pode ser negativa.");
            return;
        }
        if(quantidadeEstoque - qtd < 0){
            System.out.println("Quantidade insuficiente...");
            return;
        }
        quantidadeEstoque -= qtd;
        System.out.println(qtd + " Quantidade removida do estoque!");
    }
    
    @Override
    public String toString() {
        return "Produto{" +
                "quantidadeEstoque=" + quantidadeEstoque +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }
}