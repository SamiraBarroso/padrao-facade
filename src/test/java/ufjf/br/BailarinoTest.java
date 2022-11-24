package ufjf.br;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BailarinoTest {

    @Test
    void deveRetornarPendenciaBalletClassicoApresentacao() {
        Bailarino bailarino = new Bailarino();
        BalletClassico.getInstancia().addBailarinoPendente(bailarino);

        assertEquals(false, bailarino.dancar());
    }

    @Test
    void deveRetornarPendenciaJazzApresentacao() {
        Bailarino bailarino = new Bailarino();
        Jazz.getInstancia().addBailarinoPendente(bailarino);

        assertEquals(false, bailarino.dancar());
    }

    @Test
    void deveRetornarPendenciaSapateadoApresentacao() {
        Bailarino bailarino = new Bailarino();
        Sapateado.getInstancia().addBailarinoPendente(bailarino);

        assertEquals(false, bailarino.dancar());
    }


    @Test
    void deveRetornarBailarinoSemPendenciaDancar() {
        Bailarino bailarino = new Bailarino();

        assertEquals(true, bailarino.dancar());
    }


}