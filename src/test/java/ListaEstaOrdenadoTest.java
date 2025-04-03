import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ListaEstaOrdenadoTest {
    @Test
    void listaOrdenada() {
        int[] listaOrdenada = {2, 4, 9, 11};
        assertEquals(true, ListaEstaOrdenado.estaOrdenada(listaOrdenada));
    }

    @Test
    void listaDesordenada() {
        int[] listaOrdenada = {40, 4, 9, 11};
        assertEquals(false, ListaEstaOrdenado.estaOrdenada(listaOrdenada));
    }
}