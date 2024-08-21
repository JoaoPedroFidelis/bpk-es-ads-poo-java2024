import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Escreva um numero: ");
        n = scanner.nextInt();

        if(n % 2 == 0) System.out.println(n + " é par!");
        else System.out.println(n + " não é par...");
    }
}