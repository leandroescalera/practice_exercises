package miprimerproyecto;

/**
 *
 * @author <a href="mailto:leandro.escalera@bancofie.com.bo">Leandro Marcelo
 * Escalera Alconini</a>
 */
public class MiPrimerProyecto {

    /**
     * @param args the command line arguments
     */
    static public String invertir(String string) {
        String strAux = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            strAux += string.charAt(i);
        }
        return strAux;
    }

    static public String quitarParentesis(String inputString) {
        String auxString = inputString.replaceAll("[()]", "");
        return auxString;
    }

    static public String buscarParentesis(String inputString) {
        String auxSubCadena = "";
        String auxSubCadena2 = "";
        Integer tamaño = inputString.length() - 1;
        int i = 0, j = 0, p = 2, t = 0;
        while (i <= tamaño) {
            if (inputString.charAt(i) == '(') {
                j = i + 1;
                while (j <= tamaño) {
                    if (inputString.charAt(j) == ')') {
                        auxSubCadena = inputString.substring(i + 1, j);
                        auxSubCadena = quitarParentesis(auxSubCadena);
                        auxSubCadena = invertir(auxSubCadena);
                        break;
                    }
                    t++;
                    j++;
                }
                auxSubCadena2 = auxSubCadena2 + auxSubCadena;
                i = i + t + p;
                t = 0;
            } else {
                auxSubCadena2 = auxSubCadena2 + inputString.charAt(i);
                i++;
            }
        }
        return auxSubCadena2;
    }

    static public String solution(String inputString) {

        String stringSolution = buscarParentesis(inputString);
        return stringSolution;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        String str = "foo(bar)baz(blim)";

        String var = solution(str);
        //System.out.println(invertir(str));
        System.out.println(var);

    }

}
