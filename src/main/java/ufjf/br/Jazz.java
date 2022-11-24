package ufjf.br;

public class Jazz extends Turma {

    private static Jazz jazz = new Jazz();

    private Jazz() {};

    public static Jazz getInstancia() {
        return jazz;
    }
}
