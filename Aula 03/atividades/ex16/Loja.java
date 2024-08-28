package ex16;

public class Loja {
    String nome, endereco, telefone;
    private boolean aberta = false;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public boolean lojaAberta(){
        return aberta;
    }
    public void abrirLoja(boolean set){
        aberta = set;
        if(aberta) System.out.println("Loja aberta!");
        else System.out.println("Loja fechada!");
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", aberta=" + aberta +
                '}';
    }
}