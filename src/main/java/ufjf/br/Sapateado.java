package ufjf.br;

public class Sapateado extends Turma {

    private static Sapateado sapateado = new Sapateado();

    private Sapateado() {};

    public static Sapateado getInstancia() {
        return sapateado;
    }
}
