class RecursionArrays {

    static boolean existeMayorQue(int[] arr, int elem) {
        if ( arr.length == 0) {
            return false;
        } else if (arr.length == 1) {
            return arr[0] > elem;
        } return existeMayorQue(arr, elem, 1);
    }
    static boolean existeMayorQue(int[] arr, int elem, int i) {
        if (arr[i] > elem) {
            return true;
        } else if (i < arr.length-1) {
            return existeMayorQue(arr, elem, ++i);
        }
        return false;
    }

    static boolean todosMayorQue(int[] arr, int e) {
        int i = 0;
        for (; i < arr.length && arr[i] > e; i++) {}
        return i >= arr.length && arr.length > 0;
    }

    static boolean estaElem(int[] arr, int e) {
        int i = 0;
        for (; i < arr.length && arr[i] != e; i++) {}
        return i < arr.length && arr.length > 0;
    }

    static int primPos(int[] arr, int e) {
        int i = 0;
        for (; i < arr.length && arr[i] != e; i++) {}
        return (i < arr.length) ? i : -1;
    }


    public static void main(String[] arrg) {
        int[] arr = {0, -5, 4, 3};
        int[] arrv = {};
        System.out.println(estaElem(arr, 4));
        System.out.println(estaElem(arr, -10));
        System.out.println(estaElem(arrv, 4));
    }
}
