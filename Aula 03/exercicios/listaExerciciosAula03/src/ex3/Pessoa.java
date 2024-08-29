package ex3;

public class Pessoa {
    public String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public int getIdade() { return idade; }
    public double getAltura() { return altura; }

    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("Idade não pode ser negativa");
            return;
        }
        this.idade = idade;
    }
    public void setAltura(double altura) {
        if(altura < 0){
            System.out.println("Altura não pode ser negativa");
            return;
        }
        this.altura = altura;
    }

    public void apresentar(){
        System.out.println(this.nome + " tem " + this.idade + " anos e " + this.altura + "m de altura.");
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}