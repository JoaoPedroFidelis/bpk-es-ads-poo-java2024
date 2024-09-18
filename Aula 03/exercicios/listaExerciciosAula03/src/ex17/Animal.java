package ex17;

public class Animal {
    private String especie;
    private int idade;
    private double peso;
    private boolean alimentado = false;
    private boolean dormindo = false;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public String getEspecie() { return especie; }
    public int getIdade() { return idade; }
    public double getPeso() { return peso; }
    public boolean isAlimentado() { return alimentado; }
    public boolean isDormindo() { return dormindo; }

    public void setEspecie(String especie) {
        if(especie == null && especie.isEmpty()){
            System.out.println("Especie não pode ser vazio.");
            return;
        }
        this.especie = especie;
    }
    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("Idade não pode ser negativa.");
            return;
        }
        this.idade = idade;
    }
    public void setPeso(double peso) {
        if(peso < 0){
            System.out.println("Peso não pode ser negativo.");
            return;
        }
        this.peso = peso;
    }

    public void alimentar(){
        if(alimentado == true) {
            System.out.println("Animal ja foi alimentado!");
            return;
        }
        alimentado = true;
        System.out.println("Animal foi alimentado!");
    }
    public void dormir(boolean set){
        dormindo = set;
        if(dormindo) System.out.println("Animal começou a dormir!");
        else System.out.println("Animal parou de dormindo!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", alimentado=" + alimentado +
                ", dormindo=" + dormindo +
                '}';
    }
}
