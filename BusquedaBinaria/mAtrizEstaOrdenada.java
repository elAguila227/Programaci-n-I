import java.util.Arrays;

public class MatrizEstaOrdenada {


    //PRE: la matriz no es null
    //POST: Devuelve true si la matriz esta ordenada "de izquierda a derecha y de arriba abajo"
    static boolean matrizEstaOrdenada(int[][] matriz){
        boolean ord = true;
        if (matriz.length > 0 && matriz[0].length > 0) {
            int prev = matriz[0][0];
            for (int i = 0; i < matriz.length && ord; i++) {
                for (int j = 0; j < matriz[i].length && ord; j++) {
                    ord = matriz[i][j] >= prev;
                    prev = matriz[i][j];
                }
            }
        }
        return ord;
    }



    //////////////////////////////////////////////////////////NO TOCAR - ZONA METODOS PRUEBAS
    private static String matrizToString(int[][] mat){
        if (mat==null)
            return "null";
        else {
            String result="{";
            String separador="";
            for (int numfil=0; numfil<mat.length ; numfil++){
                result+=separador + Arrays.toString(mat[numfil]);
                separador=", ";
            }
            result+="}";
            return result;
        }
    }
    private static void do_check(int[][] arr, boolean solucion){
        try{
            boolean solAlumno = matrizEstaOrdenada(arr);
            if (solAlumno!=solucion){
                System.out.println("Error: el codigo matrizEstaOrdenada del alumno produce un resultado incorrecto");
                System.out.println("El resultado esperado para la matriz  " + matrizToString(arr) + ",");
                System.out.println("deberia ser " + solucion);
                System.out.println("pero el resultado obtenido es " + solAlumno);
                throw new Error("");

            }
        } catch (Exception e){
            System.out.println(e.toString());
            throw new Error("Error en test: el codigo matrizEstaOrdenada del alumno produce una excepcion");
        }
    }


    public static void main(String[] args) {
        {
            int[][] arr = {};
            boolean solucion = true;
            do_check(arr, solucion);
        }
        {
            int[][] arr = {{},{}};
            boolean solucion = true;
            do_check(arr, solucion);
        }

        {
            int[][] arr = {{3,1,2}};
            boolean solucion = false;
            do_check(arr, solucion);
        }
        {
            int[][] arr = {{1}};
            boolean solucion = true;
            do_check(arr, solucion);
        }
        {
            int[][] arr = {{1,2,3}};
            boolean solucion = true;
            do_check(arr, solucion);
        }
        {
            int[][] arr = {{1,3,2,4}};
            boolean solucion = false;
            do_check(arr, solucion);
        }

        {
            int[][] arr = {{1,2,3},{4,5,6}};
            boolean solucion = true;
            do_check(arr, solucion);
        }
        {
            int[][] arr = {{1,2,3},{2,5,6}};
            boolean solucion = false;
            do_check(arr, solucion);
        }

        {
            int[][] arr = {{1,2},{3,4},{5,6},{7,8}};
            boolean solucion = true;
            do_check(arr, solucion);
        }
        {
            int[][] arr = {{1,2},{3,4},{3,6},{7,8}};
            boolean solucion = false;
            do_check(arr, solucion);
        }
        {
            int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
            boolean solucion = true;
            do_check(arr, solucion);
        }
        {
            int[][] arr = {{1,2,3,4,5},{6,7,9,8,10},{11,12,13,14,15},{16,17,18,19,20}};
            boolean solucion = false;
            do_check(arr, solucion);
        }
        System.out.println("Test matrizEstaOrdenada finalizado correctamente.");
    }
}

