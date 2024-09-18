package ex6;

public class Computador {
    private String processador;
    private int memoriaRam;
    private double armazenamento;
    private boolean ligado = false;

    public Computador(String processador, int memoriaRam, double armazenamento) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }

    public String getProcessador() { return processador; }
    public int getMemoriaRam() { return memoriaRam; }
    public double getArmazenamento() { return armazenamento; }
    public boolean getLigado(){ return ligado; }

    public void setProcessador(String processador) {
        if(processador == null && processador.isEmpty()){
            System.out.println("Nome não pode ser vazio.");
            return;
        }
        this.processador = processador;
    }
    public void setMemoriaRam(int memoriaRam) {
        if(memoriaRam < 0){
            System.out.println("Memoria RAM não pode ser negativa");
            return;
        }
        this.memoriaRam = memoriaRam;
    }
    public void setArmazenamento(double armazenamento) {
        if(armazenamento < 0){
            System.out.println("Armazenamento não pode ser negativo");
            return;
        }
        this.armazenamento = armazenamento;
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