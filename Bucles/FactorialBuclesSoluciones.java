/*
 * FactorialBucles.java
 *
 * Fecha: 19/10/2020
 */


// Implementaciones de la función factorial con bucles

class FactorialBuclesSoluciones{

  //FUNCION: factorial(Entero x) --> Entero
  //PRE: x>=0
  //POS: devuelve el factorial de x
  static int factorial (int n){
    int res =1;
    for (int i=1; i<=n; i++){
      res=res * i;
    }
    return res;
  } // de factorial

  static int factorial1 (int n){
    int res =1;
    for (int i=n; i>1; i--){
      res=res * i;
    }
    return res;
  } // de factorial1

  static int factorial2 (int n){
    int res =1;
    int i=n;
    while (i>1){
      res=res * i;
      i--;
    } // de while(i>1)
    return res;
  } // de factorial2

  static int factorial3 (int n){
    int res =1;
    int i=1;
    while (i<=n){
      res=res * i;
      i=i+1;
    }
    return res;
  } // de factorial3

  static int factorial4 (int n){
    int res =1;
    int i=n;
    do{
      res=res * i;
      i--;
    } while (1<i);
    return res;
  } // de factorial4

  // Procedimiento auxiliar que imprime si las pruebas funcionan/fallan
  static void imprimePrueba(boolean prueba, String nombrePrueba){
    System.out.println((prueba?"Funciona ":"Falla ") + nombrePrueba);
  } // de imprimerPrueba

  public static void main (String [] Args) {
    // PRUEBAS de factorial
    boolean prueba1 = (factorial(3)==6);
    boolean prueba2 = (factorial(4)==24);

   // boolean prueba1 = (factorial1(3)==6);
   // boolean prueba2 = (factorial1(4)==24);
   //
   // boolean prueba1 = (factorial2(3)==6);
   // boolean prueba2 = (factorial2(4)==24);
   //
   // boolean prueba1 = (factorial3(3)==6);
   // boolean prueba2 = (factorial3(4)==24);
   //
   // boolean prueba1 = (factorial4(3)==6);
   // boolean prueba2 = (factorial4(4)==24);

    boolean todasPruebasBien = prueba1 && prueba2;
    System.out.println("factorial "+(todasPruebasBien?
                                     "funciona":
                                     "falla alguna prueba"));
    imprimePrueba(prueba1,"prueba1");
    imprimePrueba(prueba2,"prueba2");

  }//de main
} //de FactorialBuclesSoluciones
