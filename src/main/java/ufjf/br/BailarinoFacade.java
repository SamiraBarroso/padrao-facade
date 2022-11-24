package ufjf.br;

public class BailarinoFacade {

    public static boolean verificarPendenciasApresentacao(Bailarino bailarino) {
        if (BalletClassico.getInstancia().verificarBailarinoComPendenciaMensalidade(bailarino)) {
            return false;
        }
        if (Jazz.getInstancia().verificarBailarinoComPendenciaMensalidade(bailarino)) {
            return false;
        }
        if (Sapateado.getInstancia().verificarBailarinoComPendenciaMensalidade(bailarino)) {
            return false;
        }
        return true;
    }
}
