package ex17;

public class Animal {
    String especie;
    int idade;
    double peso;
    private boolean alimentado = false;
    private boolean dormindo = false;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public boolean foiAlimentado(){
        return alimentado;
    }
    public void alimentar(){
        if(alimentado == true) {
            System.out.println("Animal ja foi alimentado!");
            return;
        }
        alimentado = true;
        System.out.println("Animal foi alimentado!");
    }
    public boolean estaDormindo(){
        return dormindo;
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
