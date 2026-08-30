import java.util.Arrays;

// Arrays.toString() y mostrar el contenido del arreglo.

public class OrdenarPorBurbuja {

    public static void main(String[] args) {

        int[] matriz = {9, 3, 8, 4, 6, 7, 2, 3};

        for (int n = 1; n < matriz.length; n++) {
            // Controla la cantidad de pasadas que se realizan sobre el arreglo.
            // n comienza en 1 y llega hasta matriz.length - 1.

            for (int i = 0; i < matriz.length - n; i++) {
                // Bucle interno.
                // Compara elementos consecutivos del arreglo.
                // Se resta n porque en cada pasada el elemento más grande ya queda colocado al final.

                // DEBUG //
                System.out.println("Posición que se esta analizando: "+ i);
                // Muestra la posición que se está analizando.

                System.out.println(Arrays.toString( matriz));
                // Muestra cómo está el arreglo antes de realizar
                // la comparación.

                System.out.println((matriz[i]) + " - " + (matriz[i + 1]));
                // Muestra los dos elementos que se van a comparar.

                // DEBUG //

                if (matriz[i] > matriz[i + 1]) {
                    // Si el elemento actual es mayor que el siguiente,
                    // significa que están en el orden incorrecto
                    // y hay que intercambiarlos.

                    int temp = matriz[i + 1];
                    // Guardamos temporalmente el segundo elemento.

                    matriz[i + 1] = matriz[i];
                    // Colocamos el elemento mayor en la posición siguiente.

                    matriz[i] = temp;
                    // Colocamos el elemento que habíamos guardado
                    // en la posición actual.
                }

                System.out.println(Arrays.toString(matriz));
                // Mostramos el arreglo después de la comparación
                // y del posible intercambio.
            }
        }

        System.out.println(Arrays.toString(matriz));
        // Cuando terminan todos los ciclos, mostramos el arreglo
        // completamente ordenado.
    }
}