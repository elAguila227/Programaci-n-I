import java.util.Arrays;

public class MatricesEquals {

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }


    // public static boolean matricesEquals(int[][] arr1, int[][] arr2){
    //     return Arrays.deepEquals(arr1, arr2);
    // }

    public static boolean matricesEquals(int[][] arr1, int[][] arr2){
        boolean eq = arr1.length == arr2.length;
        for (int i = 0; i < arr1.length && eq; i++) {
            eq = Arrays.equals(arr1[i], arr2[i]);
        }
        return eq;
    }

    // public static boolean matricesEquals(int[][] arr1, int[][] arr2){
    //     boolean eq = arr1.length == arr2.length;
    //     for (int i = 0; i < arr1.length && eq; i++) {
    //         eq = arr1[i].length == arr2[i].length;
    //         for (int j = 0; j < arr1[i].length && eq; j++) {
    //             eq = arr1[i][j] == arr2[i][j];
    //         }
    //     }
    //     return eq;
    // }

    //////////////////////ZONA CODIGO PARA PRUEBAS  -   NO TOCAR NADA A PARTIR DE AQUI 
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
    private static void do_check(int[][] arr1, int[][] arr2, boolean solucion){
        try{
            boolean solAlumno = matricesEquals(arr1,arr2);
            if (solAlumno!=solucion){
                System.out.println("Error: el codigo equals del alumno produce un resultado incorrecto");
                System.out.println("El resultado esperado para las matrices \n" + matrizToString(arr1) + "\n" + matrizToString(arr2));
                System.out.println("deberia ser " + solucion);
                System.out.println("pero el resultado obtenido es " + solAlumno);
                throw new Error("");

            }
        } catch (Exception e){
            System.out.println(e.toString());
            throw new Error("Error en test: el codigo equals del alumno produce una excepcion");
        }
    }


    public static void main(String[] args) {
        {
            int[][] arr1 = {};
            int[][] arr2={};
            boolean solucion = true;
            do_check(arr1, arr2, solucion);
        }
        {
            int[][] arr1 = {};
            int[][] arr2={{}};
            boolean solucion = false;
            do_check(arr1, arr2, solucion);
        }
        {
            int[][] arr1 = {};
            int[][] arr2={{3}};
            boolean solucion = false;
            do_check(arr1, arr2, solucion);
        }
        {
            int[][] arr1 = {{1},{2},{1}};
            int[][] arr2={};
            boolean solucion = false;
            do_check(arr1, arr2, solucion);
        }
        {
            int[][] arr1 = {{1,2,3,4,5}};
            int[][] arr2={{1,2,3,4,5}};
            boolean solucion = true;
            do_check(arr1, arr2, solucion);
        }
        {
            int[][] arr1 = {{1,2,3,4,5}};
            int[][] arr2={{1,2,3,4,5,6}};
            boolean solucion = false;
            do_check(arr1, arr2, solucion);
        }
        {
            int[][] arr1 = {{1,2},{3,4},{5,6}};
            int[][] arr2={{1,2},{3,4},{5,6}};
            boolean solucion = true;
            do_check(arr1, arr2, solucion);
        }
        {
            int[][] arr1 = {{1,2,1,2},{3,4,3,4},{5,6,5,6}};
            int[][] arr2={{1,2,1,2},{3,4,3,4},{5,6,5,6}};
            boolean solucion = true;
            do_check(arr1, arr2, solucion);
        }

        {
            int[][] arr1 = {{1,2},{3,4},{5,2}};
            int[][] arr2={{1,2},{3,4},{5,6}};
            boolean solucion = false;
            do_check(arr1, arr2, solucion);
        }
        {
            int[][] arr1 = {{1,2,3},{3,4,5},{5,6,7}};
            int[][] arr2={{4,2,3},{3,4,5},{5,6,7}};
            boolean solucion = false;
            do_check(arr1, arr2, solucion);
        }
        {
            int[][] arr1 = {{1},{2},{3},{4},{5}};
            int[][] arr2={{1},{2},{3},{4},{5}};
            boolean solucion = true;
            do_check(arr1, arr2, solucion);
        }
        {
            int[][] arr1 = {{1},{2},{3},{4},{5}};
            int[][] arr2={{1,1},{2,2},{3,3},{4,4},{5,5}};
            boolean solucion = false;
            do_check(arr1, arr2, solucion);
        }
        System.out.println("Test matricesEquals finalizado correctamente.");
    }

}
