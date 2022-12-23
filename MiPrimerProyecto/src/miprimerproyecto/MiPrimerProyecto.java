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
        Integer tamaño = inputString.length()-1;
        for (int i = 0; i <= tamaño; i++) {
            if (inputString.charAt(i) == '(') {
                for (int j = i+1; j <= tamaño; j++) {
                    if (inputString.charAt(j) == ')') {
                        auxSubCadena = inputString.substring(i, j-1);
                        auxSubCadena = quitarParentesis(auxSubCadena);
                        auxSubCadena = invertir(auxSubCadena);
                        
                    }

                }
            }else{
                auxSubCadena2+=inputString.charAt(i);
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

        String str = "(bar)";

        String var = solution(str);
        //System.out.println(invertir(str));
        System.out.println(var);

    }

}
