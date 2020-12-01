/*
 * Recursion.java
 *
 * Alexander Zerpa Wanner:
 * 200339:
 *
 * Fecha: 14/10/2020
 */


// Implementa en java el código de las siguientes funciones
// y completa el main incluyendo pruebas para cada una de ellas

class Recursion{
  //FUNCION: factorial(Entero x) --> Entero
  //PRE: x>=0
  //POS: factorial(x) devuelve el factorial de x
  static int factorial(int x) {
    if (x<2)
      return 1;
    else
      return x * factorial(x-1);
  }//de factorial


  // FUNCION: productoEntre(Entero x, Entero y) --> Entero
  // PRE: x<=y
  // POS: productoEntre(x,y) devuelve el producto de enteros
  // entre x e y
  static int productoEntre(int x, int y) {
      return (x == y) ? x : x*productoEntre(x+1, y);
  }

  // FUNCION: factorial1(Entero x) --> Entero
  // PRE: x>=0
  // POS: factorial1(x) devuelve el factorial de x
  // Implementarlo como una llamada a productoEntre
  static int factorial1(int x) {
      return productoEntre(1, x);
  }

  // FUNCION: sumaEntre(Entero x, Entero y) --> Entero
  // PRE: x<=y
  // POS: sumaEntre(x,y) devuelve el suma de enteros
  // entre x e y
  static int sumaEntre(int x, int y) {
      if (x == y) {
          return x;
      } return x + sumaEntre(x+1, y);
  }

  // FUNCION: sumaEntre1(Entero x, Entero y) --> Entero
  // PRE: cierto
  // POS: sumaEntre1(x,y) devuelve el suma de enteros
  // entre x e y
  static int sumaEntre1(int x, int y) {
      return (x < y) ? sumaEntre(x, y) : sumaEntre(y, x);
  }

  // FUNCION: sumaCuadradosEntre(Entero x, Entero y) --> Entero
  // PRE: cierto
  // POS: sumaCuadradosEntre(x,y) devuelve el suma de los
  // cuadrados de los enteros entre x e y
  static int sumaCuadradosEntre(int x, int y) {
      if (x == y) {
          return x*x;
      } return (x < y) ? x*x + sumaCuadradosEntre(x+1, y) : y*y + sumaCuadradosEntre(y+1, x);
  }

  // FUNCION: productoCubosEntre(Entero x, Entero y) --> Entero
  // PRE: cierto
  // POS: productoCubosEntre(x,y) devuelve el producto de los
  // cubos de los enteros entre x e y
  static int productoCubosEntre(int x, int y) {
      if (x == y) {
          return ((int) Math.pow(x, 3));
      } return (x < y) ? ((int) Math.pow(x, 3)) * productoCubosEntre(x+1, y) : ((int) Math.pow(y, 3)) * productoCubosEntre(y+1, x);
  }


  static boolean esPar(int x){  //función auxiliar
    return (x % 2) == 0;
  } // de esPar


  // FUNCION: sumaCuadradosParesEntre(Entero x, Entero y) --> Entero
  // PRE: cierto
  // POS: sumaCuadradosParesEntre(x,y) devuelve el suma de los
  // cuadrados de los enteros pares entre x e y
  static int sumaCuadradosParesEntre(int x, int y) {
      if (x == (y/2)*2) {
          return x*x;
      } else if (esPar(x)) {
          return (x < y) ? x*x + sumaCuadradosParesEntre(x+1, y) : y*y + sumaCuadradosParesEntre(y+1, x);
      } return (x < y) ? 0 + sumaCuadradosParesEntre(x+1, y) : 0 + sumaCuadradosParesEntre(y+1, x);
  }

  // FUNCION: sumaCuadradosParesEntre1(Entero x, Entero y) --> Entero
  // PRE: cierto
  // POS: sumaCuadradosParesEntre(x,y) devuelve el suma de los
  // cuadrados de los enteros pares entre x e y

  //FUNCION: numeroCifras(|Z numero) -> /Z
  //PRE: numero >=0
  //POS: devuelve el número de cifras de numero
  static int numeroCifras(int num) {
      return (int) Math.log10(num)+1;
  }

  //FUNCION: numeroCifras1(|Z numero) -> /Z
  //PRE: cierto
  //POS: devuelve el número de cifras de numero
  static int numeroCifras1(int num) {
      return num == 0 ? 0 : (int) Math.log10(Math.abs(num))+1;
  }

  //FUNCION: sumaCifras(|Z numero) -> /Z
  //PRE: numero >= 0
  //POS: devuelve la suma de las cifras de numero
  static int sumaCifras(int num) {
      if (num/10 == 0) {
          return num;
      } return num%10 + sumaCifras(num/10);
  }

  //FUNCION: sumaCifrasPares(|Z numero) -> /Z
  //PRE: numero >= 0
  //POS: devuelve la suma de las cifras pares de numero
  static int sumaCifrasPares(int num) {
      if (num/10 == 0) {
          return esPar(num) ? num : 0;
      } return esPar(num%10) ? num%10 + sumaCifrasPares(num/10) : sumaCifrasPares(num/10);
  }

  //FUNCION: sumaCifrasParesPosImpar(Entero numero) --> Entero
  // PRE: numero >= 0
  // POS: devuelve la suma de las cifras pares de numero
  // que ocupen una posicion impar empezando por que la
  // ultima cifra de numero ocupa la posicion pos
  // ej:          1328794
  // posiciones   7654321
  // sumaCifrasParesPosImpar(1328794)= 4+2=6
//  static int sumaCifrasParesPosImpar(int numero){
//      return sumaCifrasParesPosImparAux(numero,1);
//  }// de sumaCifrasParesPosImpar

  //FUNCION: sumaCifrasParesPosImparAux(Entero numero,
  //                                 Entero pos) --> Entero
  //PRE: numero >= 0, pos>0
  //POS: devuelve la suma de las cifras pares de numero
  // que ocupen una posicion impar empezando por que la
  // ultima cifra de numero ocupa la posicion pos
  // ej:          1328794
  // posiciones   7654321
  // sumaCifrasParesPosImparAux(1328794,1)= 4+2=6
  // sumaCifrasParesPosImparAux(132879,2)= 2
  // sumaCifrasParesPosImparAux(13,6)= 0

  //FUNCION: numeroElementos(Entero x, Entero y) -> Entero
  //PRE: numero >= 0
  //POS: devuelve el número de elementos del intervalo [x,y]


  // Supongamos que existe una función booleana que nos
  // dice si un número es mágico o no.... la implementación
  // nos da igual, podemos implementarla como queramos
  static boolean esMagico(int x){
    return esPar(x) && (x > 5);
  }

  //FUNCION: numeroElementosMagicos(Entero x, Entero y) -> Entero
  //PRE: cierto
  //POS: devuelve el número de elementos que cumplen
  // esMagico de los del intervalo [x,y]

  //FUNCION: todosMagicos(Entero x, Entero y) -> Booleano
  //PRE: cierto
  //POS: devuelve cierto si todos los números del intervalo
  // [x,y] son mágicos

  //FUNCION: hayMagico(Entero x, Entero y) -> Booleano
  //PRE: cierto
  //POS: devuelve cierto si hay al menos un número en el
  //intervalo [x,y] que sea mágico

  public static void main (String [] Args) {
    // Implementa las pruebas que necesites para asegurarte
    // de que las funciones implementadas son correctas
    System.out.print("x: ");
    int x = StdIn.readInt();
    System.out.print("y: ");
    int y = StdIn.readInt();
    System.out.print("num: ");
    int num = StdIn.readInt();

    System.out.println("factorial: " + factorial(x));
    System.out.println("factorial1: " + factorial1(x));
    System.out.println("productoEntre: " + productoEntre(x, y));
    System.out.println("sumaEntre: " + sumaEntre(x, y));
    System.out.println("sumaEntre1: " + sumaEntre1(y, x));
    System.out.println("sumaCuadradosEntre: " + sumaCuadradosEntre(x, y));
    System.out.println("sumaCuadradosEntre: " + sumaCuadradosEntre(y, x));
    System.out.println("productoCubosEntre: " + productoCubosEntre(x, y));
    System.out.println("productoCubosEntre: " + productoCubosEntre(y, x));
    System.out.println("sumaCuadradosParesEntre: " + sumaCuadradosParesEntre(x, y));
    System.out.println("sumaCuadradosParesEntre: " + sumaCuadradosParesEntre(y, x));
    System.out.println("numeroCifras: " + numeroCifras(num));
    System.out.println("numeroCifras1: " + numeroCifras1(-num));
    System.out.println("sumaCifras: " + sumaCifras(num));
    System.out.println("sumaCifrasPares:" + sumaCifrasPares(num));

  }//de main
} //de Recursion
