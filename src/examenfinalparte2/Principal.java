package examenfinalparte2;

public class Principal {

    public static boolean p = false;

    public static void main(String arg[]) {
        //Se inicializan las variables Digito y cargaDigitos, con un "if" se asegura que Digito debe ser positivo.
        int Digito = 2;
        int cargaDigitos = 0;
        if (Digito <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        /**
         * Comienza el for que ocupará todo el programa en el que se inicializa i=1 (aumentará hasta un máximo de 99999).
         * Tambien se inicializa aux que siempre tendrá el mismo valor incial que i, dependiendo de la vez que se haya ejecutado el for,
         * y un contador que aumentará cada vez que aux!=0, dado que eso siempre será verdad siempre aumenta y le da este valor a cargaDigitos.
         */
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contador1 = 0;

            while (aux != 0) {
                aux = aux / 10;
                contador1++;
            }
            cargaDigitos = contador1;

            /**
             * Dado que CargaDigitos tiene el valor del contador aumentará hasta que sea igual que Digito, cuando coincidan se ejecutará este if.
             * Para empezar tiene un if que pondria el boolean en positivo si es de las primeras 3 veces que se ejecuta el for.
             * Como cargaDigitos==Digito, cargaDigitos==contador1 y contador1==i por el numero de repeticiones del for,
             * se ejecutará este else y pondrá el boolean en false.
             */
            if (cargaDigitos == Digito) {
                if (i < 4) {
                    p = true;
                } else {
                    if (i % 2 == 0) {
                        p = false;
                    } else {
                        //se inicializa otro contador una variable fija en 1(Digito1) y una variable k.
                        int contador2 = 0;
                        int Digito1 = 1;
                        int k = (i - 1) / 2;
                        //si el módulo de k es 0 k disminuirá
                        if (k % 2 == 0) {
                            k--;
                        }

                        /**
                         * Mientras 1 sea menor que k...
                         * Mientras el módulo del digito 1 sea igual a 0, aumenta el contador2
                         * Si contador2 es mayor o igual a 2, se sumará el valor de k al de Dijito1.
                         */
                        while (Digito1 <= k) {
                            if (i % Digito1 == 0) {
                                contador2++;
                            }
                            Digito1 += 2;
                            if (contador2 == 2) {
                                Digito1 = k + 1;
                            }
                        }
                        // Si el contador2 es igual a 1, el booleans e pone a true y se ejecuta el siguiente if.
                        if (contador2 == 1) {
                            p = true;
                        }
                    }
                }
                //Finalmente si el boolean acaba en true aparecerá por pantalla el numero de i(vez en el for) en el que el boolean fue true.
                if (p == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
