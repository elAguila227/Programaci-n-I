/*
 * Switch.java
 *
 * Alexander Zerpa Wanner:
 * 200339:
 *
 * Fecha: 14/10/2020
 */

class Switch{

// Estudia el comportamiento de funcionSwitch1, funcionSwitch2 y
// funcionSwitch3 cuando se le llama con distinto valores

  static int funcionSwitch1(int n){
    switch (n) {
      case 0:
      case 1:
      case 2: return -1;
      case 3:
      case 4:
      case 5:
      case 6: return 44;
      default: return 1000;
    }
  } // de funcionSwitch1

  static int funcionSwitch2(int n){  //???
    int res;
    switch (n) {
      case 0:
      case 1:
      case 2: res=-1;
      case 3:
      case 4:
      case 5:
      case 6: res=44;
      default: res=1000;
    } // de switch
    return res;
  } // de funcionSwitch2

  static int funcionSwitch3(int n){
    int res;
    switch (n) {
      case 0:
      case 1:
      case 2:res=-1;break;
      case 3:
      case 4:
      case 5:
      case 6:res=44;break;
      default: res=1000;
    } // de switch
    return res;
  } // de funcionSwitch3


// Implementa en java el código de las siguientes funciones

  /**
   * FUNCION precioCine (Entero edad) --> Entero
   * PRE: cierta
   * POST: Devuelve "Gratis" si edad es menor de 16 o si la edad es
   * mayor o igual a 65 y "8 euros" e.o.c.
   */
   static String precioCine(int edad) {
       if (edad  < 16 || edad >= 65) {
           return "Gratis";
       } return "8 euros";
   }

  /**
   * FUNCION precioCirco (Entero edad) --> Entero
   * PRE: cierta
   * POST: Devuelve el precio del circo según la edad del espectador.
   * Es gratis para niños hasta 2 años, cuesta 4 euros para niños
   * hasta 6 años y 10 euros para mayores de 6 años
   * Indicación: hacedlo con un switch
   */
   static int precioCirco(int edad) {
       switch (edad) {
           case 0:
           case 1:
           case 2: return 0;
           case 3:
           case 4:
           case 5:
           case 6: return 4;
           default: return 10;
       }
   }

  /**
   * FUNCION procedimientoAvion(Entero edad)
   * PRE: cierta
   * POST: Escribe en pantalla una cadena de caracteres explicando
   * la forma en la que viaja una persona.
   * Si tiene hasta 2 años viaja en cuna, entre 3 y 5 años viaja
   * encima de un adulto y a partir de 6 años ocupa asiento.
   * Indicación: hacedlo con un switch
   */
   static void procedimientoAvion(int edad) {
       switch (edad) {
           case 0:
           case 1:
           case 2: System.out.println("Cuna");break;
           case 3:
           case 4:
           case 5: System.out.println("Con adulto");break;
           default: System.out.println("Asiento");
       }
   }

  public static void main (String[] args){
    System.out.print("Introduce la edad del espectador>");
    int edad = StdIn.readInt();

    System.out.println(funcionSwitch1(edad));
    System.out.println(funcionSwitch2(edad));
    System.out.println(funcionSwitch3(edad));


   System.out.println("El precio del cine es: "+
                      precioCine(edad));
   System.out.println("El precio del circo es: "+
                      precioCirco(edad) + " euros");
   System.out.print("Viaja en avión ");procedimientoAvion(edad);
  } // de main
} // de SwitchSolucion
