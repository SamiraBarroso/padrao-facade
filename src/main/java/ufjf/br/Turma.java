package ufjf.br;

import java.util.ArrayList;
import java.util.List;

public abstract class Turma {

    private List<Bailarino> bailarinosComPendencia = new ArrayList<Bailarino>();

    public void addBailarinoPendente(Bailarino bailarino) {
        this.bailarinosComPendencia.add(bailarino);
    }

    public boolean verificarBailarinoComPendenciaMensalidade(Bailarino bailarino) {
        return this.bailarinosComPendencia.contains(bailarino);
    }
}
