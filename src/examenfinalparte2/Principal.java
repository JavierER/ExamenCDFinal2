package examenfinalparte2;
/**
 * Este programa devuelve por consola numeros primos, pero solo los que tengan como numero de digito el especificado.
 * @author Javii
 */
public class Principal {

    public static boolean numeroprimo = false;

    public static void main(String arg[]) {
        Metodos clase = new Metodos();
        int digito;
        int numdig;
        do {
            digito = clase.introducirDig();
            if (digito <= 0) {
                System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
            }
        } while (digito <= 0);
        for (int i = 1; i <= 99999; i++) {
            numdig = clase.calcularNdig(i); 
            clase.comparar(i, digito, numdig); 
        }
    }
}
