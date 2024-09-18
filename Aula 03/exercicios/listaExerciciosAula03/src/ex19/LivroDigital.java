package ex19;

public class LivroDigital {
    private String titulo, autor;
    private double tamanhoArquivo;
    private boolean aberto = false;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public double getTamanhoArquivo() { return tamanhoArquivo; }
    public boolean getAberto() { return aberto; }

    public void setTitulo(String titulo) {
        if(titulo == null && titulo.isEmpty()){
            System.out.println("Titulo não pode ser vazio.");
            return;
        }
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        if(autor == null && autor.isEmpty()){
            System.out.println("Autor não pode ser vazio.");
            return;
        }
        this.autor = autor;
    }
    public void setTamanhoArquivo(double tamanhoArquivo) {
        if(tamanhoArquivo < 0){
            System.out.println("Tamanho do arquivo não pode ser negativo.");
            return;
        }
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void abrir(boolean set){
        aberto = set;
        if(aberto) System.out.println("Livro digital aberto!");
        else System.out.println("Livro digital fechado...");
    }

    @Override
    public String toString() {
        return "LivroDigital{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tamanhoArquivo=" + tamanhoArquivo +
                ", aberto=" + aberto +
                '}';
    }
}