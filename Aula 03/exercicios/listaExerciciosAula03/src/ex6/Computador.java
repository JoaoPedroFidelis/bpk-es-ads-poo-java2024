package ex6;

public class Computador {
    String processador;
    int memoriaRam;
    double armazenamento;
    private boolean ligado = false;

    public Computador(String processador, int memoriaRam, double armazenamento) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }

    public boolean estaLigado(){
        return ligado;
    }
    public void ligar(boolean set){
        ligado = set;
        if(ligado) System.out.println("Computador foi ligado!");
        else System.out.println("Computador foi desligado...");
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", armazenamento=" + armazenamento +
                ", ligado=" + ligado +
                '}';
    }
}