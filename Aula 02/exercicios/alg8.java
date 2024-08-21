import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Escreva seu nome: ");
        name = scanner.nextLine();
        System.out.print("Escreva sua idade: ");
        age = scanner.nextInt();

        System.out.println("\nNome: " + name);
        System.out.println("Idade: " + age);
    }
}