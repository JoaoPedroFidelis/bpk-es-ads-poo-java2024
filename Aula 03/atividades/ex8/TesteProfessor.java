package ex8;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor prof = new Professor("João Pedro", "Orientação a Objetos", 1200);
        System.out.println(prof);
        System.out.println("");
        prof.darAula(true);
        prof.darAula(false);
        System.out.println("");
        prof.corrigirProvas(true);
        prof.corrigirProvas(false);
    }
}
