import java.util.Arrays;

class BusquedaBinaria {

    //MOTIVACION BUSQUEDA BINARIA: el logaritmo en base 2 de un millon es algo menos de 20

    static   boolean  busquedaBinaria(int[]  v, int elem){
        // boolean find = false;
        // int low = 0;
        // int high = v.length-1;
        // int m = high/2;
        // while (low <= high && !find) {
        //     find = v[m] == elem;
        //     if (v[m] < elem) {
        //         low = m+1;
        //     } else {
        //         high = m-1;
        //     } m = (low+high)/2;
        // }
        // return find;
        return binariaRecursiva(v, elem);
    }


    //HACED TAMBIEN LA VERSION RECURSIVA

    static   boolean  binariaRecursiva(int[]  v, int elem){
        if (v.length > 0) {
            return binariaRecursiva(v, elem, 0, v.length-1, v.length/2);
        } return false;
    }
    static boolean binariaRecursiva(int[] v, int elem, int low, int high, int m) {
        if (v[m] == elem || low >= high) {
            return v[m] == elem;
        } else if (v[m] < elem) {
            return binariaRecursiva(v, elem, m+1, high, (m+1+high)/2);
        } return binariaRecursiva(v, elem, low, m-1, (low+m-1)/2);
    }


    ////////////////////////////////////////  NO TOCAR DE AQUI EN ADELANTE

    private static void do_check(int[] arr, int elem, boolean solucion){
        try{
            boolean solAlumno = busquedaBinaria(arr,elem);
            if (solAlumno!=solucion){
                System.out.println("Error: el codigo del alumno produce un resultado incorrecto");
                System.out.println("El resultado esperado para el array  " + Arrays.toString(arr) + ", y el elemento " + elem + ", ");
                System.out.println("deberia ser " + solucion);
                System.out.println("pero el resultado obtenido es " + solAlumno);
                throw new Error("");

            }
        } catch (Exception e){
            System.out.println(e.toString());
            throw new Error("Error en test: el codigo del alumno produce una excepcion");
        }
    }


    public static void main(String[] args) {
        {
            int[] arr = {};
            int elem = 4;
            boolean solucion = false;
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {1};
            int elem = 4;
            boolean solucion = false;
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {4};
            int elem = 4;
            boolean solucion = true;
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {1,2,3};
            int elem = 4;
            boolean solucion = false;
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {1,2,3,4,5};
            int elem = 1;
            boolean solucion = true;
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {1,2,3,4,5,6};
            int elem = 4;
            boolean solucion = true;
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {5,6,7,8,9};
            int elem = 4;
            boolean solucion = false;
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {1,2,3,4,5};
            int elem = 5;
            boolean solucion = true;
            do_check(arr, elem, solucion);
        }

        System.out.println("Test  busqueda binaria finalizado correctamente.");
    }

}
