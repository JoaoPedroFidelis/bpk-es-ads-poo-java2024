package ex4;

public class ContaBancaria {
    private int numeroConta;
    private double saldo = 0;

    public ContaBancaria(int num) {
        numeroConta = num;
        saldo = 0;
    }

    public int getNumeroConta(){ return numeroConta; }
    public double getSaldo(){ return saldo; }

    public void depositar(double qtd){
        if(qtd <= 0){
            System.out.println("Quantidade não pode ser negativa.");
            return;
        }
        saldo += qtd;
        System.out.println("Saldo adicionado: R$" + qtd);
    }

    public void sacar(double qtd){
        if(qtd <= 0){
            System.out.println("Quantidade não pode ser negativa.");
            return;
        }
        if(saldo - qtd < 0){
            System.out.println("Saldo insuficiente...");
            return;
        }
        saldo -= qtd;
        System.out.println("Saldo retirado: R$" + qtd);
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}