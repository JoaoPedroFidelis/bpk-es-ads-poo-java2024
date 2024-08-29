package ex19;

public class LivroDigital {
    String titulo, autor;
    double tamanhoArquivo;
    private boolean aberto = false;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public boolean estaAberto(){
        return aberto;
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