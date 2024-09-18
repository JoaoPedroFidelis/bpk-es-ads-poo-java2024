package ex20;

public class Bicicleta {
    private String marca, modelo;
    private double tamanhoRoda;
    private boolean pedalando = false;
    private boolean freando = false;

    public Bicicleta(String marca, String modelo, double tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getTamanhoRoda() { return tamanhoRoda; }
    public boolean getPedalando() { return pedalando; }
    public boolean getFreando() { return freando; }

    public void setMarca(String marca) {
        if(marca == null && marca.isEmpty()){
            System.out.println("Marca não pode ser vazia.");
            return;
        }
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        if(modelo == null && modelo.isEmpty()){
            System.out.println("Marca não pode ser vazia.");
            return;
        }
        this.modelo = modelo;
    }
    public void setTamanhoRoda(double tamanhoRoda) {
        if(tamanhoRoda < 0){
            System.out.println("Tamanho da roda não pode ser negativo.");
            return;
        }
        this.tamanhoRoda = tamanhoRoda;
    }

    public void frear(boolean set){
        if(set == true) pedalando = false;
        freando = set;
        if(freando) System.out.println("Bicicleta esta freando!");
        else System.out.println("Bicicleta parou de frear!");
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
