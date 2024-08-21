import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static String reverse(String text){
        String revText = "";
        for (int i = 0; i < text.length(); i++) {revText = text.charAt(i) + revText; }
        return revText;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;

        System.out.print("Escreva um texto: ");
        texto = scanner.nextLine();

        if(Objects.equals(texto, reverse(texto))) System.out.print("'" + texto + "' é um palíndromo!");
        else System.out.print("'" + texto + "' não é um palíndromo...");
    }
}