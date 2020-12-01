/*
 * SumaTecladoDoWhile.java
 *  
 * Fecha: 19/10/2020
 */ 

class SumaTecladoDoWhile {
  public static void main(String[] args) {
    int suma=1; // para restar el -1 del final
    int n=0;
    StdOut.println("Introduce enteros para sumarlos.");
    StdOut.println("Para acabar teclea -1.");
    do{
      StdOut.print("Introduce entero >");
      n = StdIn.readInt();
      suma=suma+n;
    } while (n != -1);
    
    StdOut.println("La suma total es " + suma);
  } // de main 
} // de SumaTecladoDoWhile
