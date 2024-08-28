package ex5;

public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Jose", "Husky", 10);
        System.out.println(dog);
        System.out.println("");
        dog.latir(true);
        dog.latir(false);
        System.out.println("");
        dog.correr(true);
        dog.correr(false);
    }
}
