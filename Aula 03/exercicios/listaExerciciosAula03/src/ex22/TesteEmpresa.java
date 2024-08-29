package ex22;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa company = new Empresa("Frimesa", "123-123-123.12");
        System.out.println(company);
        System.out.println("");
        company.adicionarFuncionario("João");
        company.adicionarFuncionario("Gabriel");
        company.adicionarFuncionario("Pedro");
        company.adicionarFuncionario("Matheus");
        company.adicionarFuncionario("Felipi");
        System.out.println("");
        company.mostrarFuncionarios();
        System.out.println("");
        company.demitirFuncionario("Matheus");
        company.demitirFuncionario("Gabriel");
        System.out.println("");
        company.mostrarFuncionarios();

    }
}
