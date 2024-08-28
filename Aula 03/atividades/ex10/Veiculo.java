package ex10;

public class Veiculo {
    String tipo, placa, cor;
    private double gas = 0;
    private double maxGas = 10;
    private boolean lavando = false;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
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

    public boolean foiLavado(){
        return lavando;
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
