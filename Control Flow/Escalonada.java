/*
 * Escalonada.java
 *
 * Alexander Zerpa Wanner:
 * 200339:
 *
 * Fecha: 14/10/2020
 */

// Implementa en java el código de las siguientes funciones
// y completa el main incluyendo pruebas para cada una de ellas

class Escalonada{

/* Representación gráfica del valor que
 * devuelve la función "escalonada"
 *
 * 5 |
 * 4 |   [----)
 * 3 |               [-------
 * 2 |---)
 * 1 |         [-----)
 * 0 |
 * ---------------------------
 * 0 | 1 2 3 4 5 6 7 8 9 10
 *
 * FUNCION: escalonada (Entero x) --> Entero
 * PRE: cierto
 * POS: devuelve el resultado mostrado en el gráfico
 */
  static int escalonada(int x) {
      if (x < 2) {
          return 2;
      } else if (x < 5) {
          return 4;
      } else if (x < 9) {
          return 1;
      } return 3;
  }

  public static void main (String[] args){
      System.out.println("* 5 |\n* 4 |   [----)\n* 3 |               [-------\n* 2 |---)\n* 1 |         [-----)\n* 0 |\n* ---------------------------\n* 0 | 1 2 3 4 5 6 7 8 9 10");
      System.out.print("X = ");
      System.out.println(escalonada(StdIn.readInt()));
 } // de main
} // de Escalonada
