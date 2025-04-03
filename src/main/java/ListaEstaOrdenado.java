public class ListaEstaOrdenado {
    public static boolean estaOrdenada(int[] numeros) {
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < numeros[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
