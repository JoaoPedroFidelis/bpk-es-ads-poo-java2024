package ex21;

public class Cozinha {
    String cor;
    int quantidadePessoas;
    private boolean cozinhando = false;
    private boolean limpa = false;

    public Cozinha(String cor, int quantidadePessoas) {
        this.cor = cor;
        this.quantidadePessoas = quantidadePessoas;
    }

    public boolean foiLimpa(){
        return limpa;
    }
    public void limpar(){
        if(limpa == true) {
            System.out.println("Cozinha ja foi limpa!");
            return;
        }
        limpa = true;
        System.out.println("Cozinha foi limpa!");
    }
    public boolean estaCozinhando(){
        return cozinhando;
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
