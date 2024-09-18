package ex1;

public class Livro {
    private String titulo, autor;
    private int num_paginas;

    private Boolean opened = false;
    private int pagina = 1;
    private Boolean finalizado = false;

    public Livro(String titulo, String autor, int num_paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.num_paginas = num_paginas;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getNum_paginas() { return num_paginas; }
    public Boolean livroEstaAberto(){ return opened; }

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

    public void open(){
        opened = !opened;
        if(opened == true) System.out.println(this.titulo + " foi aberto.");
        else System.out.println(this.titulo + " foi fechado.");
    }
    public void lerPagina(){
        System.out.println("Pagina " + pagina + " foi lida.");
        if(pagina == num_paginas) finalizado = true;
        else pagina++;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", num_paginas=" + num_paginas +
                ", opened=" + opened +
                ", pagina=" + pagina +
                ", finalizado=" + finalizado +
                '}';
    }
}