package ex16;

public class Loja {
    private String nome, endereco, telefone;
    private boolean aberta = false;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }
    public boolean isAberta() { return aberta; }

    public void setNome(String nome) {
        if(nome == null && nome.isEmpty()){
            System.out.println("Nome não pode ser vazio.");
            return;
        }
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        if(endereco == null && endereco.isEmpty()){
            System.out.println("Endereco não pode ser vazio.");
            return;
        }
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        if(telefone == null && telefone.isEmpty()){
            System.out.println("Telefone não pode ser vazio.");
            return;
        }
        this.telefone = telefone;
    }

    public void abrirLoja(boolean set){
        aberta = set;
        if(aberta) System.out.println("Loja aberta!");
        else System.out.println("Loja fechada!");
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", aberta=" + aberta +
                '}';
    }
}