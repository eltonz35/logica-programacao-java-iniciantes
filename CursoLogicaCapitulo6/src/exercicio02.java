/* O mesmo exercicio anterior usando WHILE */

public class exercicio02 {

    public static final Integer DIVISOR = 3;

    public static void main(String[] args) {



        Integer[] numeros = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int i = 0;
        while (i < numeros.length) {
            Integer numero = numeros[i];
            Integer moduloPorTres = numero % DIVISOR;
            i++;

            if (moduloPorTres.equals(0)) {
                System.out.println("Numero: " + numero + " é divisível por 3.");
            }
        }
        System.out.println("Fim.");
    }
}
