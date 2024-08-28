package ex10;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo car = new Veiculo("Carro", "4M0GUS", "Vermelho");
        System.out.println(car);
        System.out.println("");
        car.lavar();
        car.lavar();
        System.out.println("");
        car.abastecer(2);
        car.abastecer(4);
        car.abastecer(5);
        System.out.println("");
        System.out.println(car);
    }
}
