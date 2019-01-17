package numerosprimos;
/**
 *
 * @author
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean p = false;

    public static void main(String arg[]) {
        int numDigit = 0;
        int ndigit = 0;
        numDigit = Integer.parseInt(arg[0]);
        if (numDigit <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int a = 1; a <= 99999; a++) {
            int divisionEnte = a;

            int contad = 0;

            while (divisionEnte != 0) {
                divisionEnte = divisionEnte / 10;
                contad++;
            }
            ndigit = contad;

            if (ndigit == numDigit) {
                if (a < 4) {
                    p = true;
                } else {
                    if (a % 2 == 0) {
                        p = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (a - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (a % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(a);
                }
            }
        }
    }

}
