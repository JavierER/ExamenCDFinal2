package examenfinalparte2;

import static examenfinalparte2.Principal.numeroprimo;
import java.util.Scanner;

/**
 *
 * @author Javii
 */
public class Metodos {

    /**
     * recoge el numero de digitos.
     * @return el número en cifra de los digitos deseados
     */
    public int introducirDig() {
        Scanner intrDig = new Scanner(System.in);
        System.out.println("Introduce el numero de dígitos.");
        return intrDig.nextInt();

    }

    /**
     * calcula el numero de digitos.
     * @param vuelta pone al metodo en el bucle
     * @return devuelve las vueltas en las que se aumenta 1 digito y mete en el contador el numero de digitos.
     */
    public int calcularNdig(int vuelta) {
        int auxiliar = vuelta;
        int contador = 0;
        while (auxiliar != 0) {
            auxiliar = auxiliar / 10;
            contador++;
        }
        return contador;
    }

    /**
     * Comienza comparando el numero dado por Usuario con el numerodeDigitos.
     * Tambien recoge el numero de vueltas del bucle y muestra solo los numeros primos.
     *
     * @param vueltas situa al metodo en la vuelta del bucle
     * @param digito numero introducido por usuario
     * @param numeroDigito numero de digitos total.
     */
    public void comparar(int vueltas, int digito, int numeroDigito) {
        if (numeroDigito == digito) {
            if (vueltas < 4) {
                numeroprimo = true;
            } else if (vueltas % 2 == 0) {
                numeroprimo = false;
            } else {
                int contador2 = 0;
                int constante = 1;
                int lim = (vueltas - 1) / 2;
                if (lim % 2 == 0) {
                    lim--;
                }

                while (constante <= lim) {
                    if (vueltas % constante == 0) {
                        contador2++;
                    }
                    constante += 2;
                    if (contador2 == 2) {
                        constante = lim + 1;
                    }
                }

                if (contador2 == 1) {
                    numeroprimo = true;
                }
            }

            if (numeroprimo == true) {
                System.out.println(vueltas);
            }
        }
    }
}
