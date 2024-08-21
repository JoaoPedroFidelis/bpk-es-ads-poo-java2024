import java.util.Scanner;

public class Main {
    public static void write(float x, float y, char symbol, float res){
        System.out.println(x + " " + symbol + " " + y + " = " + res);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x, y;

        System.out.print("Escreva um numero: ");
        x = scanner.nextFloat();
        System.out.print("Escreva outro numero: ");
        y = scanner.nextFloat();

        write(x, y, '+', x+y);
        write(x, y, '-', x-y);
        write(x, y, '*', x*y);
        write(x, y, '/', x/y);
    }
}