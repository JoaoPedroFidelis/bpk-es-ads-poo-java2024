package ex4;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(0);
        System.out.println(conta);
        System.out.println("");
        conta.depositar(100);
        conta.depositar(20);
        System.out.println("Saldo total: " + conta.getSaldo());
        conta.sacar(50);
        conta.sacar(20);
        System.out.println("Saldo total: " + conta.getSaldo());
    }
}
