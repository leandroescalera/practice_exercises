package miprimerproyecto;

/**
 *
 * @author <a href="mailto:leandro.escalera@bancofie.com.bo">Leandro Marcelo Escalera Alconini</a>
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
  
  static public String solution(String inpuntString){
    
    
    return null;
  }

  public static void main(String[] args) {
    // TODO code application logic here

    String str = "Hola Leandro como estas?";

    System.out.println(invertir(str));
    

  }

}
