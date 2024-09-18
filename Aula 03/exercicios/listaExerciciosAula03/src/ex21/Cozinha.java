package ex21;

public class Cozinha {
    private String cor;
    private int quantidadePessoas;
    private boolean cozinhando = false;
    private boolean limpa = false;

    public Cozinha(String cor, int quantidadePessoas) {
        this.cor = cor;
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getCor() {
        return cor;
    }
    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
    public boolean isCozinhando() {
        return cozinhando;
    }
    public boolean isLimpa() {
        return limpa;
    }

    public void setCor(String cor) {
        if(cor == null && cor.isEmpty()){
            System.out.println("Cor não pode ser vazia.");
            return;
        }
        this.cor = cor;
    }
    public void setQuantidadePessoas(int quantidadePessoas) {
        if(quantidadePessoas < 0){
            System.out.println("Quantidade de pessoas não pode ser negativa.");
            return;
        }
        this.quantidadePessoas = quantidadePessoas;
    }

    
    public void limpar(){
        if(limpa == true) {
            System.out.println("Cozinha ja foi limpa!");
            return;
        }
        limpa = true;
        System.out.println("Cozinha foi limpa!");
    }
    public void cozinhar(boolean set){
        cozinhando = set;
        if(cozinhando) System.out.println("Cozinha esta cozinhando!");
        else System.out.println("Cozinha parou de cozinhar!");
    }

    @Override
    public String toString() {
        return "Cozinha{" +
                "cor='" + cor + '\'' +
                ", quantidadePessoas=" + quantidadePessoas +
                ", cozinhando=" + cozinhando +
                ", limpa=" + limpa +
                '}';
    }
}
