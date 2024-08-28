package ex20;

public class Bicicleta {
    String marca, modelo;
    double tamanhoRoda;
    private boolean pedalando = false;
    private boolean freando = false;

    public Bicicleta(String marca, String modelo, double tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public boolean estaFreando(){
        return freando;
    }
    public void frear(boolean set){
        if(set == true) pedalando = false;
        freando = set;
        if(freando) System.out.println("Bicicleta esta freando!");
        else System.out.println("Bicicleta parou de frear!");
    }
    public boolean estaPedalando(){
        return pedalando;
    }
    public void pedalar(boolean set){
        if(set == true) freando = false;
        pedalando = set;
        if(pedalando) System.out.println("Bicicleta esta pedalando!");
        else System.out.println("Bicicleta parou de pedalar!");
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanhoRoda=" + tamanhoRoda +
                ", pedalando=" + pedalando +
                ", freando=" + freando +
                '}';
    }
}
