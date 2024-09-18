package ex10;

public class Veiculo {
    private String tipo, placa, cor;
    private double gas = 0;
    private double maxGas = 10;
    private boolean lavando = false;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public String getCor() { return cor; }
    public String getPlaca() { return placa; }
    public String getTipo() { return tipo; }
    public double getMaxGas() { return maxGas; }
    public double getGas() { return gas; }
    public boolean getLavando(){
        return lavando;
    }

    public void setTipo(String tipo) {
        if(tipo == null && tipo.isEmpty()){
            System.out.println("Tipo não pode ser vazio.");
            return;
        }
        this.tipo = tipo;
    }
    public void setPlaca(String placa) {
        if(placa == null && placa.isEmpty()){
            System.out.println("Placa não pode ser vazia.");
            return;
        }
        this.placa = placa;
    }
    public void setCor(String cor) {
        if(cor == null && cor.isEmpty()){
            System.out.println("Cor não pode ser vazia.");
            return;
        }
        this.cor = cor;
    }
    public void setMaxGas(double maxGas) {
        if(maxGas <= 0){
            System.out.println("Quantidade não pode ser negativa.");
            return;
        }
        this.maxGas = maxGas;
    }

    public void abastecer(double qtd){
        if(qtd <= 0){
            System.out.println("Quantidade não pode ser negativa.");
            return;
        }
        gas += qtd;
        if(gas > maxGas) gas = maxGas;
        System.out.println("Gasolina atual: " + gas);
    }
    public void lavar(){
        if(lavando == true) {
            System.out.println("Veiculo ja foi lavado...");
            return;
        }
        lavando = true;
        System.out.println("Veiculo foi lavado!");
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", gas=" + gas +
                ", maxGas=" + maxGas +
                ", lavando=" + lavando +
                '}';
    }
}
