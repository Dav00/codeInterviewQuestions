/**
 * Di el segundo numero mas grande teniendo en cuenta que son todos numeros positivos
 * y que si son todos iguales tienes que devolver -1.
 */
public class SegundoMasGrande {
    public static int dameElSegundoMasGrande(int[] numeros) {
        int masLargo = numeros[0];
        int segundoMasGrande = -1;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > masLargo){
                segundoMasGrande = masLargo;
                masLargo = numeros[i];
            } else if (numeros[i] > segundoMasGrande && numeros[i] < masLargo) {
                segundoMasGrande = numeros[i];
            }
        }

        return segundoMasGrande;
    }
}
