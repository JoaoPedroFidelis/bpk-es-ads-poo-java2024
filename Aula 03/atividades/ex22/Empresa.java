package ex22;
import java.util.Arrays;

public class Empresa {
    String nome, CNPJ;
    private String funcionarios[] = new String[10];
    private int numeroFuncionarios = 0;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.CNPJ = cnpj;
    }

    public void adicionarFuncionario(String n){
        funcionarios[numeroFuncionarios] = n;
        numeroFuncionarios++;
        System.out.println("Funcionario contratado: " + n);
    }
    public void demitirFuncionario(String n){
        int func = -1;
        for (int i = 0; i < numeroFuncionarios; i++) {
            if(funcionarios[i] == n){
                func = i;
                break;
            }
        }
        if(func == -1){
            System.out.println("Funcionario não encontrado...");
        } else {
            for (int i = func; i < numeroFuncionarios; i++) {
                funcionarios[i] = funcionarios[i+1];
            }
            System.out.println("Funcionario demitido: " + n);
        }
    }

    public void mostrarFuncionarios(){
        System.out.println("Funcionarios:");
        for (int i = 0; i < numeroFuncionarios; i++) {
            if(funcionarios[i] != null){
                System.out.println("* " + funcionarios[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", funcionarios=" + Arrays.toString(funcionarios) +
                ", numeroFuncionarios=" + numeroFuncionarios +
                '}';
    }
}