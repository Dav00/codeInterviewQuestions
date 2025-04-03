import java.util.HashSet;

public class RemueveDuplicados {
    public static int[] devolverSinDuplicados(int[] numeros) {
        HashSet<Integer> setNumeros = new HashSet<>();

        // Llenamos el HashSet con los valores únicos
        for (int numero : numeros) {
            setNumeros.add(numero);
        }

        // Convertimos el HashSet en un array de int
        return setNumeros.stream().mapToInt(Integer::intValue).toArray();
    }
}
