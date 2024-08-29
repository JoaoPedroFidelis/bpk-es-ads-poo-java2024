package ex17;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal monkey = new Animal("Cercopithecidae", 20, 2.1);
        System.out.println(monkey);
        System.out.println("");
        monkey.alimentar();
        monkey.alimentar();
        System.out.println("");
        monkey.dormir(true);
        monkey.dormir(false);
        System.out.println("");
        System.out.println(monkey);
    }
}
