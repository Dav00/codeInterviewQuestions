import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

class RemueveDuplicadosTest {
    @Test
    void testVariosDuplicados() {
        int[] numeros = {1, 2, 5, 5, 5};
        int[] numerosSinDuplicados = {1,2,5};
        assertArrayEquals(numerosSinDuplicados, RemueveDuplicados.devolverSinDuplicados(numeros));
    }
}
