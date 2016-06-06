package examenfinalparte2;

public class Principal {

    public static boolean p = false;

    public static void main(String arg[]) {
        int Digito = 2;
        int cargaDigitos = 0;
        if (Digito <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contador1 = 0;

            while (aux != 0) {
                aux = aux / 10;
                contador1++;
            }
            cargaDigitos = contador1;

            if (cargaDigitos == Digito) {
                if (i < 4) {
                    p = true;
                } else {
                    if (i % 2 == 0) {
                        p = false;
                    } else {
                        int contador2 = 0;
                        int Digito1 = 1;
                        int k = (i - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (Digito1 <= k) {
                            if (i % Digito1 == 0) {
                                contador2++;
                            }
                            Digito1 += 2;
                            if (contador2 == 2) {
                                Digito1 = k + 1;
                            }
                        }

                        if (contador2 == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
