package ufjf.br;

public class BalletClassico extends Turma {

    private static BalletClassico balletClassico = new BalletClassico();

    private BalletClassico() {};

    public static BalletClassico getInstancia() {
        return balletClassico;
    }
}
