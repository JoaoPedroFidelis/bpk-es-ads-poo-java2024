package ex12;

public class Filme {
    String titulo, diretor;
    float duracao;
    private boolean tocando = false;

    public Filme(String titulo, String diretor, float duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public boolean filmeIniciado(){
        return tocando;
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