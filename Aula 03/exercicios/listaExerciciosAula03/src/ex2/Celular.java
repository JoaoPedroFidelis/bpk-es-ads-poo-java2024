package ex2;

public class Celular {
    private String marca, modelo;
    private float capacidade_bateria;
    private Boolean ligado = false;

    public Celular(String marca, String modelo, float capacidade_bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade_bateria = capacidade_bateria;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public float getCapacidade_bateria() { return capacidade_bateria; }
    public Boolean getLigado(){ return ligado; }

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
    public void setCapacidade_bateria(float capacidade_bateria) {
        if(capacidade_bateria < 0){
            System.out.println("Capacidade não pode negativa");
            return;
        }
        this.capacidade_bateria = capacidade_bateria;
    }

    public void turn(){
        ligado = !ligado;
    }
    public void estado(){
        if(ligado) System.out.println("Celular ligado");
        else System.out.println("Celular desligado");
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidade_bateria=" + capacidade_bateria +
                ", ligado=" + ligado +
                '}';
    }
}