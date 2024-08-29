package ex19;

public class TesteLivroDigital {
    public static void main(String[] args) {
        LivroDigital digitalBook = new LivroDigital("Senhor dos aneis", "João pedro fidelis", 300.1);
        System.out.println(digitalBook);
        System.out.println("");
        digitalBook.abrir(true);
        System.out.println("");
        System.out.println(digitalBook);
        System.out.println("");
        digitalBook.abrir(false);
        System.out.println("");
        System.out.println(digitalBook);
    }
}
