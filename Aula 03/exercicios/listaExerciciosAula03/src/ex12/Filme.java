package ex12;

public class Filme {
    private String titulo, diretor;
    private float duracao;
    private boolean tocando = false;

    public Filme(String titulo, String diretor, float duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getTitulo() { return titulo; }
    public String getDiretor() { return diretor; }
    public float getDuracao() { return duracao; }
    public boolean getTocando(){
        return tocando;
    }

    public void setTitulo(String titulo) {
        if(titulo == null && titulo.isEmpty()){
            System.out.println("Titulo não pode ser vazio.");
            return;
        }
        this.titulo = titulo;
    }
    public void setDiretor(String diretor) {
        if(diretor == null && diretor.isEmpty()){
            System.out.println("Diretor não pode ser vazio.");
            return;
        }
        this.diretor = diretor;
    }
    public void setDuracao(float duracao) {
        if(duracao <= 0){
            System.out.println("Duração não pode ser negativa.");
            return;
        }
        this.duracao = duracao;
    }

    public void iniciar(){
        tocando = true;
        System.out.println("Filme iniciado");
    }
    public void parar(){
        tocando = false;
        System.out.println("Filme parado");
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", duracao=" + duracao +
                ", tocando=" + tocando +
                '}';
    }
}