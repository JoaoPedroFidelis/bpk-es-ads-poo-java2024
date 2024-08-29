package ex2;

public class Celular {
    String marca, modelo;
    private float capacidade_bateria;
    private Boolean ligado = false;

    public Celular(String marca, String modelo, float capacidade_bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade_bateria = capacidade_bateria;
    }

    public float getCapacidade_bateria() { return capacidade_bateria; }
    public Boolean getLigado(){ return ligado; }

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