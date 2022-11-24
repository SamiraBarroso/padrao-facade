package ufjf.br;

public class Bailarino {

    public boolean dancar() {
        return BailarinoFacade.verificarPendenciasApresentacao(this);
    }
}
