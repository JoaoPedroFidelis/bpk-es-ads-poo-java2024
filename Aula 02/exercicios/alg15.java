import java.util.Scanner;

public class Main {
    
    public static int fat(int n){ // Função recursiva
        if(n == 0 || n == 1) return n;
        return n * fat(n-1);
    }
    /*
    public static int fat(int n){ // Função normal
        if(n == 0 || n == 1) return n;
        int nfat = n;
        for(int i = 1; i < n; i++){
            nfat *= n-i;
        }
        return nfat;
    }
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva um numero: ");
        int num = scanner.nextInt();

        System.out.print("\n!" + num + " = " + fat(num));
    }
}