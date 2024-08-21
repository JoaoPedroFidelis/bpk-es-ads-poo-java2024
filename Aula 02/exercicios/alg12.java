import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums[] = {0,0,0,0,0};

        for(int i = 1; i <= 5; i++){
            System.out.print(i + ". Escreva um numero: ");
            nums[i-1] = scanner.nextInt();
        }

        Arrays.sort(nums);
        for(int i = 1; i <= nums.length; i++){
            System.out.println(nums[i-1]);
        }
    }
}