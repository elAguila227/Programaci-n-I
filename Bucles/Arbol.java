/*
* Arbol.java
*
* Alexander Zerpa Wanner:
* 200339:
*
* Fecha: 19/10/2020
*/


// Implementa en java el código de los siguientes procedimientos
class Arbol{

    //PROCEDIMIENTO: imprime(Entero n)
    //PRE: x>=3
    //POS: Imprime en pantalla un árbol de asteriscos de n filas
    //     de copa y su correspondiente base que quede proporcionada
    static void imprime(int n) {
        // asignacion de variables nesesarias
        int r = 1;
        int alt = 1;
        int spaces = n;
        // imprime a consola la copa del arbol
        for (; r <= n; r++) {
            // imprime espacion antes de los arteriscos
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            //dibuja los arteriscos
            for (int i = 1; i <= alt; i++) {
                System.out.print("*");
            }
            // aumenta los valores para imprimir la siguiente linea e imprime el salto de linea
            alt += 2;
            spaces--;
            System.out.print("\n");
        } // imprime el tronco del arbol
        for (; r <= n+((alt+3)/9); r++) {
            // imprime los espacios
            for (int i = 1; i <= n-(alt-3)/6; i++) {
                System.out.print(" ");
            }
            // imprime los arteriscos
            for (int i = 1; i <= ((alt-3)/3%2 != 0 ? (alt-3)/3 : ((alt-3)/3)+1); i++) {
                System.out.print("*");
            }
            // imprime el salto de linea
            System.out.print("\n");
        }
    }


    public static void main (String[] args) {
        System.out.print("Introduce un tamaño > ");
        int n=StdIn.readInt();
        imprime(n); //imprime un arbol de n filas de copa

    }// de main
} // de Arbol
