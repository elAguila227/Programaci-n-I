// Alexander Zerpa Wanner
//      c200339

class Tarea {

    // PRE: cierta.
    // POS: devuelve la posicion del valor double que convertido a int no pierde informacion. (en caso de no enctrar o de array vacio devuelve -1)
    static int convertibleAIntPos(double[] arr) {
        int i = 0;
        while (i < arr.length && arr[i]%1 != 0) {
            i++;
        }
        return (arr.length > 0 && i < arr.length) ? i : -1;
    }

    // PRE: cierta.
    // POS: devuelve true si los elementos del array son validos para codificar en binario. (un array vacia es valido)
    static boolean esBinario(int[] arr) {
        int i = 0;
        while (i < arr.length && (arr[i] == 0 || arr[i] == 1)) {
            i++;
        }
        return i >= arr.length;
    }

    // PRE: cierta.
    // POS: devuelve la suma de todos los elementos del array.
    static int sumaElem(int[] arr) {
        int total = 0;
        for (int e : arr) {
          total += e; 
        }
        return total;
    }

    public static void main(String[] args) {
         double[] arrd = {2.5, 5.9, 9.0, 7.6};
         double[] arrdi = {2.5, 5.9, 9.4, 7.6};
         double[] arrdv = {};
         int[] arrb = {0, 1, 0, 0, 1};
         int[] arrbi = {1, 0, 1, 2, 1};
         int[] arrbv = {};
         int[] arr = {2, 5, 6, 4, 7};
         int[] arrv = {};

         System.out.println((convertibleAIntPos(arrd) == 2 && convertibleAIntPos(arrdi) == -1 && convertibleAIntPos(arrdv) == -1) ? "convertibleAIntPos() FUNCIONA" : "convertibleAIntPos() NO FUNCIONA");
         System.out.println((esBinario(arrb) && !esBinario(arrbi) && esBinario(arrbv)) ? "esBinario() FUNCIONA" : "esBinario() NO FUNCIONA");
         System.out.println((sumaElem(arr) == 24 && sumaElem(arrv) == 0) ? "sumaElem() FUNCIONA" : "sumaElem() NO FUNCIONA");
    }
}
