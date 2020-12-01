import java.util.Arrays;
class BorraSinOrden{


    /////borrado en arrays no ordenados

    //PRE: elem >0 ,array de enteros >0, compactados a la izquierda, posiciones vacias almacenan 0 
    //POST: si el elemento esta, sustituye la 1� aparicion por el ultimo elemento y en el lugar de este
    //      se pone un 0 (los elementos continuan compactados a la izquierda)
    static void borraSinOrden(int[] arr, int elem){
        int i = 0;
        while (i < arr.length && arr[i] != elem) {
            i++;
        }
        if (i < arr.length) {
            int j = lastElem(arr, i, arr.length-1, (arr.length-1+i)/2);
            System.out.println(Arrays.toString(arr));
            System.out.println(j);
            arr[i] = arr[j];
            arr[j] = 0;
        }
    }

    static int lastElem(int[] arr, int i, int j, int m) {
        System.out.println(i + " " + j + " " + m);
        if (arr[j] != 0 || m >= j) {
            return j;
        } if (arr[m] == 0) {
            return lastElem(arr, i, m-1, (i+m-1)/2);
        } return lastElem(arr, m+1, j, (m+1+j)/2);
    }

    /////////////////// CODIGO PARA PRUEBAS

    ///// SIN ORDEN
    private static void do_check(int[] arr, int elem, int[] solucion){
        try{
            int[] arr0=null;
            if (arr!=null)
                arr0=Arrays.copyOf(arr, arr.length); //el array se va a modificar, conservo copia original
            borraSinOrden(arr,elem);
            if ((arr==null && solucion!=null) || (arr!=null && !Arrays.equals(arr,solucion))){    
                System.out.println("Error en borraSinOrden: el codigo del alumno produce un resultado incorrecto");
                System.out.println("El resultado esperado para el array  " + Arrays.toString(arr0) + ", y el elemento " + elem + ", ");
                System.out.println("deberia ser " + Arrays.toString(solucion));
                System.out.println("pero el resultado obtenido es " + Arrays.toString(arr));
                throw new Error("");

            }
        } catch (Exception e){
            System.out.println(e.toString());
            throw new Error("Error en test borraSinOrden: el codigo del alumno produce una excepcion");
        }
    }

    public static void main(String[] args){
        ////////////////////////PRUEBAS borraSinOrden
        {
            int[] arr = {};
            int elem = 4;
            int[] solucion = {};
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {1,0,0,0};
            int elem = 1;
            int[] solucion = {0,0,0,0};
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {0,0};
            int elem = 4;
            int[] solucion = {0,0};
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {1,0,0,0};
            int elem = 4;
            int[] solucion = {1,0,0,0};
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {4};
            int elem = 4;
            int[] solucion = {0};
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {1,2,3,0};
            int elem = 4;
            int[] solucion = {1,2,3,0};
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {1,2,3,4,5,0,0};
            int elem = 1;
            int[] solucion = {5,2,3,4,0,0,0};
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {1,2,3,5,6,4};
            int elem = 4;
            int[] solucion = {1,2,3,5,6,0};
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {5,6,7,8,9,0};
            int elem = 8;
            int[] solucion = {5,6,7,9,0,0};
            do_check(arr, elem, solucion);
        }
        {
            int[] arr = {1,2,3,5,6,4,7,8,4,6,4,5};
            int elem = 4;
            int[] solucion ={1,2,3,5,6,5,7,8,4,6,4,0};
            do_check(arr, elem, solucion);
        }
        System.out.println("Test borraSinOrden finalizado correctamente.");

    }
}
