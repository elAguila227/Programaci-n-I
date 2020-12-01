/*
 * SolucionDirectaPruebas.java
 *
 * Alexander Zerpa:
 *  200339:
 *
 * Fecha: 6/10/2020
 */


// Implementa en java el código de las siguientes funciones
// y completa el main incluyendo pruebas para cada una de ellas

class SolucionDirectaPruebas {

  /*
   * esMultiplo (n,m IN |Z) -> |B
   * PRE: m =/= 0
   * POST: el resultado es cierto si n es multiplo
   * de m y falso en otro caso
   * Ejemplos:
   * esMultiplo(6,3) -> true
   * esMultiplo(5,3) -> false
   *
   */
  static boolean esMultiplo(int n, int m) {
    return n != 0 && n%m == 0;
  }

  /*
   * esPar (n IN |Z) -> |B
   * PRE: cierto
   * POST: el resultado es cierto si n es par
   * Ejemplos:
   * esPar(6) -> true
   * esPar(5) -> false
   *
   */
  static boolean esPar(int n) {
    return esMultiplo(n, 2);
  }

  /*
   * esImparYMultiploDe3 (n IN |Z) -> |B
   * PRE: cierto
   * POST: el resultado es cierto si n es impar (no es par)
   * y es multiplo de 3
   * Ejemplos:
   * esImparYMultiploDe3(9) -> true
   * esImparYMultiploDe3(6) -> false
   * esImparYMultiploDe3(5) -> false
   *
   */
  static boolean esImparYMultiploDe3(int n) {
    return esMultiplo(n, 3) && !esPar(n);
  }

  /*
   * pasarCmsAMetros (cms IN |R) -> |R
   * PRE: cm >= 0
   * POST: el resultado es el equivalente en metros a
   * cms centrímetros
   * Ejemplos:
   * pasarCmsAMetros(1500.0) -> 15.0
   * pasarCmsAMetros(5.2) -> 0.052
   *
   */
   static double pasarCmsAMetros(double cms) {
     int decimals = String.valueOf(cms).length() - (String.valueOf((int) cms).length()+1);
     return (cms*Math.pow(10, decimals)) / Math.pow(10, 2+decimals);
     // return cms/100; // este es como se tiene que hacer pero x
  }

  /*
   * conversion (u,d,c IN |N) -> |N
   * PRE: cierto
   * POST: el resultado es el equivalente a convertir
   * u unidades, d decenas y c centenas a unidades
   * Ejemplos:
   * conversion(4,5,8) -> 854
   * conversion(40,20,100) -> 10240
   *
   */
  static int conversion(int u, int d, int c) {
    return u + d*10 + c*100;
  }

  /*
   * pasarASegundos (h,m,s IN |N) -> |N
   * PRE: h, m, s >= 0
   * POST: devuelve el número de segundos equivalentes
   * a h horas, m minutos y s segundos
   * Ejemplos:
   * pasarASegundos(1,0,0) -> 3600
   * pasarASegundos(0,1,0) -> 60
   * pasarASegundos(0,0,1) -> 1
   * pasarASegundos(2,20,50) -> 8450
   */
  static int pasarASegundos(int h, int m, int s) {
    return h*3600 + m*60 + s;
  }

  /*
   *
   * ultimoDigito (num IN |Z) -> |Z
   * PRE: true
   * POST: el resultado es el último dígito de num
   * Examples:
   * ultimoDigito(234) -> 4
   * ultimoDigito(-3) -> 3
   *
   */
  static int ultimoDigito(int num) {
    return Math.abs(num%10);
  }

  /*
   * sinUltimoDigito(num IN |N) -> |N
   * PRE: true
   * POST: the result is num without the last digit
   * Ejemplos:
   * sinUltimoDigito(578) -> 57
   * sinUltimoDigito(2847) -> 284
   */
  static int sinUltimoDigito(int num) {
    return num/10;
  }

  /*
   * implicacion(p,q IN |B) -> |B
   * PRE: true
   * POST: devuelve el valor de la implicación lógica p->q
   * Ejemplos:
   * implication(true,true) -> true
   * implication(true,false) -> false
   * implication(false,true) -> true
   * implication(false,false) -> true
   *
   */
  static boolean implicacion(boolean p, boolean q) {
    return !p || q;
  }

  /*
   * cuadratica (a,b,c,x IN |Z) -> |Z
   * PRE: cierto
   * POST: el resultado es el equivalente a evaluar la
   * función cuadrática a*x^2+b*x+c
   * Ejemplos:
   * cuadratica(1,2,3,4) -> 27
   * Pista1: se puede usar la función Math.pow(x,y) para
   * obtener el resultado de x^y
   * Pista2: se puede convertir un número real a número
   * entero poniendo (int) delante.
   * Por ejemplo: (int)3.0 -> 3
   * (int)397.0 -> 397
   */
  static int cuadratica(int a, int b, int c, int x) {
    return ((int)(a*Math.pow(x, 2))) + b*x + c;
  }

  /*
   * numeroCifras(num IN |N) -> |N ---- ...(num IN |Z) -> |N
   * PRE: true                     ---- PRE: num >= 0
   * POST: devuelve el número de cifras de num
   * Ejemplos:
   * numeroCifras(578) -> 3
   * numeroCifras(2847) -> 4
   * Pista1: se puede utilizar la función Math.log10(x)
   * Pista2: se puede convertir un número real a número
   * entero poniendo (int) delante.
   * Por ejemplo: (int)3.0 -> 3
   * (int)397.0 -> 397
   */
  static int numeroCifras(int num) {
    return num == 0 ? 1 : (int) Math.log10(Math.abs(num))+1;
  }

   /*
   * redondeo(num IN |R) -> /Z
   * PRE : num > 0
   * POST: devuelve el número entero más cercano a num
   * Ejemplos:
   * redondeo(3.2) -> 3
   * redondeo(5.8) -> 6
   */
  static int redondeo(double num) {
    return (int) (num+0.5);
  }

  static void separacion() {
    System.out.println("______________");
  }

  public static void main(String [] args){
    // Incluye aquí las pruebas que hagas para comprobar
    // que cada función devuelve los resultados esperados
    //  para un conjunto representativo de casos
    separacion();

    System.out.println("esMultiplo:");
    System.out.println(esMultiplo(6, 3) &&
                      !esMultiplo(5, 3) &&
                       esMultiplo(-6, 3) ?
                      "Funciona" : "Error");

    separacion();

    System.out.println("esPar:");
    System.out.println(esPar(6) &&
                      !esPar(5) &&
                       esPar(-6) ?
                      "Funciona" : "Error");

    separacion();

    System.out.println("esImparYMultiploDe3");
    System.out.println(esImparYMultiploDe3(9) &&
                      !esImparYMultiploDe3(6) &&
                      !esImparYMultiploDe3(5) ?
                      "Funciona" : "Error");

    separacion();

    System.out.println("pasarCmsAMetros:");
    System.out.println(pasarCmsAMetros(1500.0) == 15.0 &&
                       pasarCmsAMetros(5.2) == 0.052 ?
                      "Funciona" : "Error");

    separacion();

    System.out.println("conversion:");
    System.out.println(conversion(4,5,8) == 854 &&
                       conversion(40,20,100) == 10240 ?
                      "Funciona" : "Error");

    separacion();

    System.out.println("pasarASegundos:");
    System.out.println(pasarASegundos(1,0,0) == 3600  &&
                       pasarASegundos(0,1,0) == 60 &&
                       pasarASegundos(0,0,1) == 1 &&
                       pasarASegundos(2,20,50) == 8450 ?
                      "Funciona" : "Error");

    separacion();

    System.out.println("ultimoDigito:");
    System.out.println(ultimoDigito(234) == 4 &&
                       ultimoDigito(-3) == 3  ?
                      "Funciona" : "Error");

    separacion();

    System.out.println("sinUltimoDigito:");
    System.out.println(sinUltimoDigito(578) == 57 &&
                       sinUltimoDigito(2847) == 284 ?
                      "Funciona" : "Error");

    separacion();

    System.out.println("implicacion:");
    System.out.println(implicacion(true,true) &&
                      !implicacion(true,false) &&
                       implicacion(false,true) &&
                       implicacion(false,false) ?
                      "Funciona" : "Error");

    separacion();

    System.out.println("cuadratica:");
    System.out.println(cuadratica(1,2,3,4) == 27 ?
                      "Funciona" : "Error");

    separacion();

    System.out.println("numeroCifras:");
    System.out.println(numeroCifras(578) == 3 &&
                       numeroCifras(-2847) == 4 &&
                       numeroCifras(0) == 1 ?
                      "Funciona" : "Error");

    separacion();

    System.out.println("redondeo:");
    System.out.println(redondeo(3.2) == 3 &&
                       redondeo(5.8) == 6  ?
                      "Funciona" : "Error");

  } // de main
} // de SolucionDirectaPruebas
