/*
 * Seleccion.java
 *
 * Alexander Zerpa Wanner:
 * 200339:
 *
 * Fecha: 13/10/2020
 */


// Implementa en java el código de las siguientes funciones
// y completa el main incluyendo pruebas para cada una de ellas

class Seleccion {

  /**
   * FUNCION min (Entero a, Entero b) --> Entero
   * POST: Calcula el menor entre a y b.
   * POST: (resultado IN {a,b}) /\
   *       (resultado <= a) /\ (resultado <= b)
   */
  static int min (int a, int b)
  {
    if (a<=b)
      return a;
    else
      return b;
  } // de min


  /**
   * FUNCION max (Entero a, Entero b) --> Entero
   * PRE: cierta
   * POST: Calcula el mayor entre a y b.
   * POST: (resultado IN {a,b}) /\
   *       (resultado >= a) /\ (resultado >= b)
   */
   static int max(int a, int b) {
       if (a >= b) {
           return a ;
       } return b;
   }

  /**
   * FUNCION max3 (Entero a, Entero b, Entero c) --> Entero
   * PRE: cierta
   * POST: Calcula el mayor entre a, b y c.
   */
   static int max3(int a, int b, int c) {
       return max(max(a, b), c);
   }

  /**
   FUNCION posicionMayor (Entero posA, valorA, posB, valorB)
     --> Entero
   PRE: posA>0, posB>0, posA=/=posB
   POST: Dados dos valores enteros valorA y valorB y sus
         posiciones respectivas, posA y posB, devolver
         la posicion del que sea mayor de los dos valores.
           valorA >= valorB  --> posA
           eoc               --> posB
   EJEMPLOS: posicionMayor(1,4,2,8) --> 2
             posicionMayor(1,4,2,-8) --> 1
   */
   static int posicionMayor(int posA, int valorA, int posB, int valorB) {
       if (valorA >= valorB) {
           return posA;
       } return posB;
   }

  /**
   FUNCION abs (Entero a) --> Entero
   PRE: cierta
   POST: Calcula el valor absoluto de a.
  */
  static int abs(int a) {
      if (a >= 0) {
          return a;
      } return -a;
  }

  /**
   FUNCION ternaria (Booleano cond, Entero a, Entero b) --> Entero
   PRE: cierta
   POST: Si cond es true devuelve x, en otro caso devuelve y
   EJEMPLOS: ternaria(true,1,2) --> 1
             ternaria(false,1,2) --> 2
  */
  static int ternaria(boolean cond, int a, int b) {
      if (cond) {
          return a;
      } return b;
  }

   /**
   FUNCION delta (Booleano p)
   POST: Si p es cierto devuelve 1 y si es falso devuelve 0
   POST: p   --> 1
         eoc --> 0
  */
  static int delta(boolean p) {
      if (p) {
          return 1;
      } return 0;
  }

  public static void main(String [] args){
    // Incluye aquí las pruebas que hagas para comprobar
    // que cada función devuelve los resultados esperados
    //  para un conjunto representativo de casos

//    // PRUEBAS: min
        System.out.println("Fuincion min:");
        System.out.print("Valor 1: ");
        int a = StdIn.readInt();
        System.out.print("Valor 2: ");
        int b = StdIn.readInt();

        System.out.println(min(a, b));

//    // PRUEBAS: max
        System.out.println("Fuincion max:");
        System.out.print("Valor 1: ");
        a = StdIn.readInt();
        System.out.print("Valor 2: ");
        b = StdIn.readInt();

        System.out.println(max(a, b));

//    // PRUEBAS: max3
        System.out.println("Fuincion max3:");
        System.out.print("Valor 1: ");
        a = StdIn.readInt();
        System.out.print("Valor 2: ");
        b = StdIn.readInt();
        System.out.print("Valor 3: ");
        int c = StdIn.readInt();

        System.out.println(max3(a, b, c));

//    // PRUEBAS: posicionMayor
        System.out.println("Fuincion posicionMayor:");
        System.out.print("Valor 1: ");
        a = StdIn.readInt();
        System.out.print("Valor 2: ");
        b = StdIn.readInt();

        System.out.println(posicionMayor(1, a, 2, b));

//    // PRUEBAS: abs
        System.out.println("Fuincion abs:");
        System.out.print("Valor: ");
        a = StdIn.readInt();

        System.out.println(abs(a));

//    // PRUEBAS ternaria:
        System.out.println("Fuincion ternaria:");
        System.out.print("Condicion:");
        boolean con = StdIn.readBoolean();
        System.out.print("Valor 1: ");
        a = StdIn.readInt();
        System.out.print("Valor 2: ");
        b = StdIn.readInt();


        System.out.println(ternaria(con, a, b));

//    // PRUEBAS delta:
        System.out.println("Fuincion delta:");
        System.out.print("Condicion:");
        con = StdIn.readBoolean();

        System.out.println(delta(con));


  } // de main
} // de Seleccion
