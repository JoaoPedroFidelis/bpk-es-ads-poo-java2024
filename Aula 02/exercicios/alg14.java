import java.util.Scanner;

public class Main {
    public static boolean isVogal(char textChar){
        char vogals[] = {'a', 'e', 'i', 'o', 'u'};
        textChar = Character.toLowerCase(textChar);
        for(int i = 0; i < vogals.length; i++){ if(textChar == vogals[i]) return true; }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um texto: ");
        String text = scanner.nextLine();

        int vogals = 0;
        for(int i = 0; i < text.length(); i++){
            if(isVogal(text.charAt(i))) vogals++;
        }

        if(vogals > 0) System.out.print(vogals + (vogals == 1 ? " Vogal detectada!" : " Vogais detectadas!"));
        else System.out.print("Nenhuma vogal detectada...");
    }
}