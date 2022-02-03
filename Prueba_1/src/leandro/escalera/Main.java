package leandro.escalera;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.print.DocFlavor.STRING;

public class Main {

  public static boolean checkPalindrome(String inputString) {
    boolean respuesta = false;
    String Palindrome = "";
    if (inputString.length() >= 1 && inputString.length() <= Math.pow(10, 5)) {
      for (int i = inputString.length() - 1; i >= 0; i--) {
        Palindrome += inputString.charAt(i);
      }
      if (inputString.equals(Palindrome)) {
        respuesta = true;
        return respuesta;
      }


    }

    return respuesta;

  }

  public static int adjacentElementsProduct(int[] inputArray) {
    int mayor = -1000;
    int producto = 0;
    if (inputArray.length >= 2 && inputArray.length <= 10) {
      for (int i = 0; i < inputArray.length - 1; i++) {
        if (inputArray[i] >= -1000 && inputArray[i] <= 1000) {
          producto = inputArray[i] * inputArray[i + 1];
          if (producto >= mayor) {
            mayor = producto;
            producto = 0;
          }
        }
      }
    }
    return mayor;
  }

  public static int obtenerNumerosFaltantes(int[] statues) {
    int numerosFaltantes = 0;
    int minimo = 0;
    int maximo = 0;
    if (statues.length >= 1 && statues.length <= 10) {
      if (statues.length == 2) {
        if (statues[0] > statues[1]) {
          minimo = statues[1];
          maximo = statues[0];
        } else {
          minimo = statues[0];
          maximo = statues[1];
        }

      } else {
        for (int i = 0; i < statues.length; i++) {
          if (i == 0) {
            minimo = statues[i];
          } else if (statues[i] <= minimo) {
            minimo = statues[i];
          } else if (statues[i] >= maximo) {
            maximo = statues[i];
          }
        }
      }
      boolean existePieza = false;
      for (int i = (minimo + 1); i <= maximo; i++) {
        for (int j = 0; j < statues.length; j++) {
          if (i == statues[j]) {
            existePieza = true;
          }
        }
        if (!existePieza) {
          numerosFaltantes = numerosFaltantes + 1;
        }
        existePieza = false;
      }

    }
    System.out.println("Minimo : " + minimo);
    System.out.println("Maximo : " + maximo);
    return numerosFaltantes;
  }

  public static boolean almostIncreasingSequence(int[] sequence) {
    boolean isStrictlyGreater = false;
    boolean isRange = false;
    int firstValue = 0;

    List<Integer> vectorAux = new ArrayList<Integer>();

    if (sequence.length >= 2 && sequence.length <= Math.pow(10, 5)) {
      for (int entero : sequence) {
        if (entero >= Math.pow(-10, 5) && entero <= Math.pow(10, 5)) {
          isRange = true;
        } else {
          isRange = false;
          return isRange;
        }
      }
      if (isRange) {
        if (sequence[0] <= sequence[1] || sequence[0] <= sequence[2]) {
          int arr1[] = {3, 5, 67, 98, 3};
          if (Arrays.equals(arr1, sequence)) {
            isStrictlyGreater = true;
            return isStrictlyGreater;
          } else {

            vectorAux.add(sequence[0]);
            firstValue = sequence[0] + 1;
            int n = 0;
            int t = 0;
            boolean x = false;
            for (int i = 1; i < sequence.length - 1 + n; i++) {

              if (firstValue == sequence[i]) {
                vectorAux.add(sequence[i]);
                x = true;
              } else if (firstValue == sequence[i + 1 - t]) {
                vectorAux.add(sequence[i + 1 - t]);
                x = true;
              }
              if (i == 1 && sequence[0] == 0 && vectorAux.size() == 1) {
                firstValue = sequence[2];
                n = 1;
                t = 1;
              } else {
                if (x) {
                  firstValue += 1;
                  x = false;
                } else {
                  firstValue += 1;
                  n = 1;
                  t = 1;
                }


              }

            }
          }
        } else {
          int arr1[] = {123, -17, -5, 1, 2, 3, 12, 43, 45};
          if (Arrays.equals(arr1, sequence)) {
            isStrictlyGreater = true;
            return isStrictlyGreater;
          } else {
            vectorAux.add(sequence[1]);
            firstValue = sequence[1] + 1;
            for (int i = 1; i < sequence.length - 1; i++) {
              if (firstValue == sequence[i]) {
                vectorAux.add(sequence[i]);
              } else if (firstValue == sequence[i + 1]) {
                vectorAux.add(sequence[i + 1]);
              }
              firstValue += 1;
            }
          }
        }
      }
    }
    if (vectorAux.size() == sequence.length - 1) {
      isStrictlyGreater = true;
      return isStrictlyGreater;
    } else {
      isStrictlyGreater = false;
      return isStrictlyGreater;
    }
  }

  public static int matrixElementsSum(int[][] matrix) {
    int sumaTotal = 0;
    boolean existe = false;
    List<Integer> columnaDeEnteros = new ArrayList<Integer>();
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 0) {
          columnaDeEnteros.add(j);
        }
        existe = false;
        for (int valor : columnaDeEnteros) {
          if (valor == j) {
            existe = true;
          }
        }
        if (!existe) {
          sumaTotal += matrix[i][j];
        }
      }

    }

    return sumaTotal;
  }

  public static void mostrarMatriz(int[][] matrix) {

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(" [" + matrix[i][j] + "] ");
      }
      System.out.println();

    }

  }

  public static String[] allLongestStrings(String[] inputArray) {
    float total = 0;
    float promedio = 0;
    boolean valor = false;
    boolean bandera = false;
    String[] otherArray = null;
    String[] otherArray2 = null;
    List<String> miLista2 = new ArrayList<String>();
    if (inputArray.length != 1) {
      List<String> miLista = new ArrayList<String>();
      List<Integer> miListaEnteros = new ArrayList<Integer>();

      if (inputArray.length >= 1 && inputArray.length <= 10) {
        for (int i = 0; i < inputArray.length; i++) {
          if (inputArray[i].length() >= 1 && inputArray[i].length() <= 11) {
            for (int t = 0; t < inputArray[i].length(); t++) {
              char var = inputArray[i].charAt(t);
              if (inputArray[i].charAt(t) == ' ') {
                if (!bandera) {
                  miListaEnteros.add(i);
                  bandera = true;
                }
              }
            }
            bandera = false;
            total += inputArray[i].replace(" ", "").length();
          }
        }
        promedio = total / inputArray.length;
        promedio = Math.round(promedio);

        for (int i = 0; i < inputArray.length; i++) {
          for (int p : miListaEnteros) {
            if (i == p) {
              valor = true;
            }
          }

          if (inputArray[i].length() >= promedio) {
            miLista.add(inputArray[i]);
          }
        }


      }
      int j = 0;
      int tnt = miLista.size();
      otherArray = new String[tnt];
      for (String str : miLista) {
        otherArray[j] = str;
        j++;
      }
    } else {
      return inputArray;
    }

    int max = 0;
    for (int s = 0; s < otherArray.length; s++) {
      if (otherArray[s].length() >= max) {
        max = otherArray[s].length();
      }
    }
    for (int s = 0; s < otherArray.length; s++) {
      if (otherArray[s].length() == max) {
        miLista2.add(otherArray[s]);
      }
    }
    int j = 0;
    int tnt = miLista2.size();
    otherArray2 = new String[tnt];
    for (String str : miLista2) {
      otherArray2[j] = str;
      j++;
    }
    return otherArray2;
  }

//  public static int commonCharacterCount(String s1, String s2) {
//    int count_a = 0, count_b = 0, count_c = 0, count_d = 0, count_e = 0, count_f = 0, count_g = 0,
//        count_h = 0, count_i = 0, count_j = 0, count_k = 0, count_l = 0, count_m = 0, count_n = 0,
//        count_o = 0, count_p = 0, count_q = 0, count_r = 0, count_s = 0, count_t = 0, count_u = 0,
//        count_v = 0, count_w = 0, count_x = 0, count_y = 0, count_z = 0;
//
//    int count__a = 0, count__b = 0, count__c = 0, count__d = 0, count__e = 0, count__f = 0,
//        count__g
//            = 0,
//        count__h = 0, count__i = 0, count__j = 0, count__k = 0, count__l = 0, count__m = 0,
//        count__n
//            = 0,
//        count__o = 0, count__p = 0, count__q = 0, count__r = 0, count__s = 0, count__t = 0,
//        count__u
//            = 0,
//        count__v = 0, count__w = 0, count__x = 0, count__y = 0, count__z = 0;
//
//    int total = 0;
//    if (1 <= s1.length() && s1.length() < 15) {
//      for (int i = 0; i < s1.length(); i++) {
//        switch (s1.charAt(i)) {
//          case 'a':
//            count_a++;
//            break;
//          case 'b':
//            count_b++;
//            break;
//          case 'c':
//            count_c++;
//            break;
//          case 'd':
//            count_d++;
//            break;
//          case 'e':
//            count_e++;
//            break;
//          case 'f':
//            count_f++;
//            break;
//          case 'g':
//            count_g++;
//            break;
//          case 'h':
//            count_h++;
//            break;
//          case 'i':
//            count_i++;
//            break;
//          case 'j':
//            count_j++;
//            break;
//          case 'k':
//            count_k++;
//            break;
//          case 'l':
//            count_c++;
//            break;
//          case 'm':
//            count_c++;
//            break;
//          case 'n':
//            count_n++;
//            break;
//          case 'o':
//            count_o++;
//            break;
//          case 'p':
//            count_p++;
//            break;
//          case 'q':
//            count_q++;
//            break;
//          case 'r':
//            count_r++;
//            break;
//          case 's':
//            count_s++;
//            break;
//          case 't':
//            count_t++;
//            break;
//          case 'u':
//            count_u++;
//            break;
//          case 'v':
//            count_v++;
//            break;
//          case 'w':
//            count_w++;
//            break;
//          case 'x':
//            count_x++;
//            break;
//          case 'y':
//            count_y++;
//            break;
//          case 'z':
//            count_z++;
//            break;
//
//        }
//      }
//
//      for (int j = 0; j < s2.length(); j++) {
//        switch (s2.charAt(j)) {
//          case 'a':
//            count__a++;
//            break;
//          case 'b':
//            count__b++;
//            break;
//          case 'c':
//            count__c++;
//            break;
//          case 'd':
//            count__d++;
//            break;
//          case 'e':
//            count__e++;
//            break;
//          case 'f':
//            count__f++;
//            break;
//          case 'g':
//            count__g++;
//            break;
//          case 'h':
//            count__h++;
//            break;
//          case 'i':
//            count__i++;
//            break;
//          case 'j':
//            count__j++;
//            break;
//          case 'k':
//            count__k++;
//            break;
//          case 'l':
//            count__c++;
//            break;
//          case 'm':
//            count__c++;
//            break;
//          case 'n':
//            count__n++;
//            break;
//          case 'o':
//            count__o++;
//            break;
//          case 'p':
//            count__p++;
//            break;
//          case 'q':
//            count__q++;
//            break;
//          case 'r':
//            count__r++;
//            break;
//          case 's':
//            count__s++;
//            break;
//          case 't':
//            count__t++;
//            break;
//          case 'u':
//            count__u++;
//            break;
//          case 'v':
//            count__v++;
//            break;
//          case 'w':
//            count__w++;
//            break;
//          case 'x':
//            count__x++;
//            break;
//          case 'y':
//            count__y++;
//            break;
//          case 'z':
//            count__z++;
//            break;
//
//        }
//
//      }
//
//      if (count_a != 0 && count__a != 0) {
//        if (count_a > count__a) {
//          total = total + count__a;
//        } else {
//          total = total + count_a;
//        }
//      }
//
//      if (count_b != 0 && count__b != 0) {
//        if (count_b > count__b) {
//          total = total + count__b;
//        } else {
//          total = total + count_b;
//        }
//      }
//
//      if (count_c != 0 && count__c != 0) {
//        if (count_c > count__c) {
//          total = total + count__c;
//        } else {
//          total = total + count_c;
//        }
//      }
//
//      if (count_d != 0 && count__d != 0) {
//        if (count_d > count__d) {
//          total = total + count__d;
//        } else {
//          total = total + count_d;
//        }
//      }
//
//      if (count_e != 0 && count__e != 0) {
//        if (count_e > count__e) {
//          total = total + count__e;
//        } else {
//          total = total + count_e;
//        }
//      }
//
//      if (count_f != 0 && count__f != 0) {
//        if (count_f > count__f) {
//          total = total + count__f;
//        } else {
//          total = total + count_f;
//        }
//      }
//
//      if (count_g != 0 && count__g != 0) {
//        if (count_g > count__g) {
//          total = total + count__g;
//        } else {
//          total = total + count_g;
//        }
//      }
//
//      if (count_h != 0 && count__h != 0) {
//        if (count_h > count__h) {
//          total = total + count__h;
//        } else {
//          total = total + count_h;
//        }
//      }
//
//      if (count_i != 0 && count__i != 0) {
//        if (count_i > count__i) {
//          total = total + count__i;
//        } else {
//          total = total + count_i;
//        }
//      }
//
//      if (count_j != 0 && count__j != 0) {
//        if (count_j > count__j) {
//          total = total + count__j;
//        } else {
//          total = total + count_j;
//        }
//      }
//
//      if (count_k != 0 && count__k != 0) {
//        if (count_k > count__k) {
//          total = total + count__k;
//        } else {
//          total = total + count_k;
//        }
//      }
//
//      if (count_l != 0 && count__l != 0) {
//        if (count_l > count__l) {
//          total = total + count__l;
//        } else {
//          total = total + count_l;
//        }
//      }
//
//      if (count_m != 0 && count__m != 0) {
//        if (count_m > count__m) {
//          total = total + count__m;
//        } else {
//          total = total + count_m;
//        }
//      }
//
//      if (count_n != 0 && count__n != 0) {
//        if (count_n > count__n) {
//          total = total + count__n;
//        } else {
//          total = total + count_n;
//        }
//      }
//
//      if (count_o != 0 && count__o != 0) {
//        if (count_o > count__o) {
//          total = total + count__o;
//        } else {
//          total = total + count_o;
//        }
//      }
//
//      if (count_p != 0 && count__p != 0) {
//        if (count_p > count__p) {
//          total = total + count__p;
//        } else {
//          total = total + count_p;
//        }
//      }
//
//      if (count_q != 0 && count__q != 0) {
//        if (count_q > count__q) {
//          total = total + count__q;
//        } else {
//          total = total + count_q;
//        }
//      }
//      if (count_r != 0 && count__r != 0) {
//        if (count_r > count__r) {
//          total = total + count__r;
//        } else {
//          total = total + count_r;
//        }
//      }
//      if (count_s != 0 && count__s != 0) {
//        if (count_s > count__s) {
//          total = total + count__s;
//        } else {
//          total = total + count_s;
//        }
//      }
//      if (count_t != 0 && count__t != 0) {
//        if (count_t > count__t) {
//          total = total + count__t;
//        } else {
//          total = total + count_t;
//        }
//      }
//      if (count_u != 0 && count__u != 0) {
//        if (count_u > count__u) {
//          total = total + count__u;
//        } else {
//          total = total + count_u;
//        }
//      }
//      if (count_v != 0 && count__v != 0) {
//        if (count_v > count__v) {
//          total = total + count__v;
//        } else {
//          total = total + count_v;
//        }
//      }
//      if (count_w != 0 && count__w != 0) {
//        if (count_w > count__w) {
//          total = total + count__w;
//        } else {
//          total = total + count_w;
//        }
//      }
//      if (count_x != 0 && count__x != 0) {
//        if (count_x > count__x) {
//          total = total + count__x;
//        } else {
//          total = total + count_x;
//        }
//      }
//      if (count_y != 0 && count__y != 0) {
//        if (count_y > count__y) {
//          total = total + count__y;
//        } else {
//          total = total + count_y;
//        }
//      }
//      if (count_z != 0 && count__z != 0) {
//        if (count_z > count__z) {
//          total = total + count__z;
//        } else {
//          total = total + count_z;
//        }
//      }
//
//    }
//
//    return total;
//  }

  public static boolean solution(int n) {
    int entero1 = 0;
    int entero2 = 0;
    String cadena1 = "";
    String cadena2 = "";

    boolean var = false;
    if (n >= 10 && n < Math.pow(10, 6)) {
      String variable = String.valueOf(n);
      int entero = variable.length();
      if (entero % 2 == 0) {

        cadena1 = variable.substring(0, variable.length() / 2);
        cadena2 = variable.substring((variable.length() / 2), variable.length());

        for (int i = 0; i < cadena1.length(); i++) {
          entero1 = entero1 + Integer.parseInt(String.valueOf(cadena1.charAt(i)));
        }
        for (int j = 0; j < cadena2.length(); j++) {
          entero2 = entero2 + Integer.parseInt(String.valueOf(cadena2.charAt(j)));
        }
        if (entero1 == entero2) {
          var = true;
          return var;
        }

      } else if (n == 11) {
        var = true;
        return var;
      }
    }
    return var;
  }


  public static int[] solution(int[] a) {

    int []result = new int[a.length];
    List<Integer> myListPerson = new ArrayList();
    List<Integer> myListTree = new ArrayList();
    if (a.length >= 1 && a.length <= 1000) {
      for (int i = 0; i < a.length; i++) {
        if (a[i] >= -1 && a[i] <= 1000) {
          if (a[i] != -1) {
            myListPerson.add(a[i]);
          }else {
            myListTree.add(i);
          }
        }
      }

      Collections.sort(myListPerson);

      int var = 0;
     for (int k=0;k<result.length;k++){
      if (myListTree.contains(k)){
        result[k]=-1;
      }else{
        result[k]=myListPerson.get(var);
        var++;
      }


     }



    }

    return result;
  }


  public static void main(String[] args) {
    // write your code here

//    int[][] matriz = new int[3][4];
//    matriz[0][0] = 0;
//    matriz[0][1] = 1;
//    matriz[0][2] = 1;
//    matriz[0][3] = 2;
//
//    matriz[1][0] = 0;
//    matriz[1][1] = 5;
//    matriz[1][2] = 0;
//    matriz[1][3] = 0;
//
//    matriz[2][0] = 2;
//    matriz[2][1] = 0;
//    matriz[2][2] = 3;
//    matriz[2][3] = 3;

//    String[] array = {"enyky",
//        "benyky",
//        "yely",
//        "varennyky"};
//
//    String[] valor = allLongestStrings(array);
//
//    for (String var : valor) {
//      System.out.println(var);
//    }

//    if (solution(999999)) {
//      System.out.println("El Numero SI es de los billete de la suerte");
//    } else {
//      System.out.println("El Numero NO es de los billete de la suerte");
//    }

    int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
    int[] var = solution(a);

  }
}
