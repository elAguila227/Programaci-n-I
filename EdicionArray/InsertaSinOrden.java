import java.util.Arrays;
class InsertaSinOrden{


    /////Insercion en arrays no ordenados

    //PRE: elem >0 ,array de enteros >0, compactados a la izquierda, posiciones vacias almacenan 0. 
    //POST: si el elemento cabe, lo inserta en la primera posicion vacia
    static void insertaSinOrden(int[] arr, int elem){
        if (arr.length > 0) {
            System.out.println(Arrays.toString(arr));
            int j = lastElem(arr, 0, arr.length-1, arr.length/2);
            if (arr[j] == 0) {
                arr[j] = elem;
            }
        }
    } 


    static int lastElem(int[] arr, int i, int j, int m) {
        System.out.println(i + " " + j + " " + m);
        if (arr[j] != 0 || i >= j) {
            return j;
        } if (arr[m] == 0) {
            return lastElem(arr, i, m-1, (i+m-1)/2);
        } return lastElem(arr, m, j, (m+j)/2);
    }
    /////////////////// CODIGO PARA PRUEBAS

    ///// SIN ORDEN

    private static void do_check1(int[] arr, int elem, int[] solucion){
        try{
            int[] arr0=null;
            if (arr!=null)
                arr0=Arrays.copyOf(arr, arr.length); //el array se va a modificar, conservo copia original
            insertaSinOrden(arr,elem);
            if ((arr==null && solucion!=null) || (arr!=null && !Arrays.equals(arr,solucion))){
                System.out.println("Error en insertaSinOrden: el codigo del alumno produce un resultado incorrecto");
                System.out.println("El resultado esperado para el array  " + Arrays.toString(arr0) + ", y el elemento " + elem + ", ");
                System.out.println("deberia ser " + Arrays.toString(solucion));
                System.out.println("pero el resultado obtenido es " + Arrays.toString(arr));
                throw new Error();
            }
        } catch (Exception e){
            System.out.println(e.toString());
            throw new Error("Error en test insertaSinOrden: el codigo del alumno produce una excepcion");
        }
    } 
    public static void main(String[] args){

        ////////////////////////PRUEBAS insertaSinOrden
        {
            int[] arr = {};
            int elem = 4;
            int[] solucion = {};
            do_check1(arr, elem, solucion);
        }
        {
            int[] arr = {0,0};
            int elem = 4;
            int[] solucion = {4,0};
            do_check1(arr, elem, solucion);
        }
        {
            int[] arr = {1,0,0,0};
            int elem = 4;
            int[] solucion = {1,4,0,0};
            do_check1(arr, elem, solucion);
        }
        {
            int[] arr = {4};
            int elem = 5;
            int[] solucion = {4};
            do_check1(arr, elem, solucion);
        }
        {
            int[] arr = {1,2,3,0};
            int elem = 4;
            int[] solucion = {1,2,3,4};
            do_check1(arr, elem, solucion);
        }
        {
            int[] arr = {1,2,3,4,5,0,0};
            int elem = 1;
            int[] solucion = {1,2,3,4,5,1,0};
            do_check1(arr, elem, solucion);
        }
        {
            int[] arr = {1,2,3,5,6,4};
            int elem = 9;
            int[] solucion = {1,2,3,5,6,4};
            do_check1(arr, elem, solucion);
        }
        {
            int[] arr = {5,6,7,8,9,0};
            int elem = 8;
            int[] solucion = {5,6,7,8,9,8};
            do_check1(arr, elem, solucion);
        }
        {
            int[] arr = {1,2,3,5,6,4,7,8,4,6,4,5,0,0,0};
            int elem = 4;
            int[] solucion ={1,2,3,5,6,4,7,8,4,6,4,5,4,0,0};
            do_check1(arr, elem, solucion);
        }
        System.out.println("Test insertaSinOrden finalizado correctamente.");

    }
}
