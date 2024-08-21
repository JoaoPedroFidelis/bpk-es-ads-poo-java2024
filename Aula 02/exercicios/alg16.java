import java.util.Scanner;

public class Main {
    public static float tempConvert(float t, float fp_1, float ep_1, float fp_2, float ep_2){
        float t1_r = (ep_1 - fp_1);
        float t2_r = (ep_2 - fp_2);
        return (((t2_r * t) - (fp_1 * t2_r)) + (fp_2 * t1_r)) / t1_r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Converter de celsius para fahrenheit\n2. Converter de fahrenheit para celsius");
        System.out.print("Escolha uma das opções: ");
        String opt = scanner.nextLine();

        System.out.print("Informe a temperatura: ");
        float temp = scanner.nextFloat();

        System.out.print("\n");
        switch(opt.toLowerCase()){
            case "1": case "c": case "celsius":
                System.out.print(temp + "°C = " + tempConvert(temp, 100, 0, 212, 32) + "°F"); // Converter celsius para fahreheit
                break;
            case "2": case "f": case "fahrenheit":
                System.out.print(temp + "°F = " + tempConvert(temp, 212, 32, 100, 0) + "°C"); // Converter fahreheit para celsius
                break;
            default:
                System.out.print("Opção desconhecida.");
        }
    }
}