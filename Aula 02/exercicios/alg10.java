import java.util.Scanner;

public class Main {
    public static boolean prime(int n){
        if(n <= 1) return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Escreva um numero: ");
        num = scanner.nextInt();

        if(prime(num)) System.out.print(num + " é primo!");
        else System.out.print(num + " não é primo...");
    }
}