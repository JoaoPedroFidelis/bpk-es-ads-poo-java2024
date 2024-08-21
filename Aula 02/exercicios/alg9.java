import java.util.Scanner;

public class Main {
    public static void write(float x, float y, String symbol, float res){
        System.out.println(x + " " + symbol + " " + y + " = " + res);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opt;
        float x, y;

        System.out.print("Escreva um numero: ");
        x = scanner.nextFloat();
        System.out.print("Escreva a operação (+,-,*,/): ");
        opt = scanner.next();
        System.out.print("Escreva outro numero: ");
        y = scanner.nextFloat();

        switch(opt){
            case "+": write(x, y, opt, x+y); break;
            case "-": write(x, y, opt, x-y); break;
            case "*": write(x, y, opt, x*y); break;
            case "/": write(x, y, opt, x/y); break;
        }
    }
}