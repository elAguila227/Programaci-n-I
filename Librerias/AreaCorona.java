/*
* AreaCorona.java
*
* Alexander Zerpa:
* 200339:
*
* Fecha: 9/10/2020
*/


// Implementa en java el código de las siguientes funciones
// y completa el main incluyendo pruebas para cada una de ellas.
// Se permite llamar a funciones de la libería Math



class AreaCorona{
  static final double PI=3.141653;

  //areaCirculo(|R radio) -> |R
  //PRE:radio>0
  //POS:el resultado es el área de un circulo de ese radio
  static double areaCirculo(double radio) {
    return Math.pow(radio, 2)*PI;
  }

  //areaCorona1(|R radioG,|R radioP)
  //PRE:radioG>radioP>=0
  //POS:devolver el resultado
  static double areaCorona1(double radioG, double radioP) {
    return areaCirculo(radioG) - areaCirculo(radioP);
  }

  //areaCorona2(|R radioG,|R radioP)
  //PRE:radioG>0 /\ radioP>0
  //POS:devolver el resultado
  static double areaCorona2(double radioG, double radioP) {
    return Math.abs(areaCorona1(radioG, radioP));
  }

  // Pruebas
  public static void main (String[] args ){
    // Lee dos números enteros de teclado
    StdOut.print("Radio G: ");
    double radioG = StdIn.readDouble();
    StdOut.print("Radio P: ");
    double radioP = StdIn.readDouble();

    // Visualiza los resultados de llamar a areaCorona1
    // con los argumentos leidos por teclado
    StdOut.println("Funcion areaCorona1: " + areaCorona1(radioG, radioP));

    // Visualiza los resultados de llamar a areaCorona2
    // con los argumentos leidos por teclado
    StdOut.println("Funcion areaCorona2: " + areaCorona2(radioG, radioP));

  } // de main
} // de AreaCorona
