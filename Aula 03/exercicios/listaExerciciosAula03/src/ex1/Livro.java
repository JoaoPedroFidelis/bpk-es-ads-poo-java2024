package ex1;

public class Livro {
    public String titulo, autor;
    public int num_paginas;

    private Boolean opened = false;
    private int pagina = 1;
    private Boolean finalizado = false;

    public Livro(String titulo, String autor, int num_paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.num_paginas = num_paginas;
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

    public Boolean livroEstaAberto(){
        return opened;
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