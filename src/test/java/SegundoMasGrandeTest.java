import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SegundoMasGrandeTest {

    @Test
    void testTodosIguales() {
        int[] numeros = {5, 5, 5, 5, 5};
        assertEquals(-1, SegundoMasGrande.dameElSegundoMasGrande(numeros));
    }

    @Test
    void testTodosDistintos() {
        int[] numeros = {1, 2, 3, 4, 5};
        assertEquals(4, SegundoMasGrande.dameElSegundoMasGrande(numeros));
    }

    @Test
    void testVariosIguales() {
        int[] numeros = {1, 1, 3, 1, 1};
        assertEquals(1, SegundoMasGrande.dameElSegundoMasGrande(numeros));
    }
}
