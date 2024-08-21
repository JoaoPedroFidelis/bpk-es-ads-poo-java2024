import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randNum = new Random().nextInt(100) + 1;
        int num = 0, tries = 0;
        do{
            tries++;
            System.out.printf(tries + ". Escreva um numero: ");
            num = scanner.nextInt();
            if(num > randNum) System.out.printf("Palpite mt alto...\n\n");
            else if(num < randNum) System.out.printf("Palpite mt baixo...\n\n");
        } while(num != randNum);
        
        System.out.printf("\nVoce acertou o numero!!!\n" + tries + " tentativas.");
    }
}