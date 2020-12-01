class Ejercicios {

    static int primeraAparicion(int[] arr, int elem) {
        int i = 0;
        for (; i < arr.length && arr[i] != elem; i++) {}
        return (i < arr.length) ? i : -1;
    }

    // POS: arr = {} devuelve false.
    static boolean posParAlt(char[] arr) {
        int i = 0;
        for (; i < arr.length && arr[i] == '*'; i+=2) {}
        return i > arr.length-1 && arr.length > 0;
    }

    static boolean posParAltR(char[] arr) {
        if (arr.length > 0) {
            return posParAltR(arr, arr[0] == '*', 2);
        }
        return false;
    }
    static boolean posParAltR(char[] arr, boolean soFar, int i) {
        if (i < arr.length && soFar) {
            return posParAltR(arr, arr[i] == '*', i+2);
        }
        return soFar;
    }

    public static void main(String[] args) {
        char[] arr1 = {'*', 'f', '*', '*'};
        char[] arr2 = {'*', 'f', 't', '*'};
        char[] arrv = {};
        System.out.println(posParAltR(arr1));
        System.out.println(posParAltR(arr2));
        System.out.println(posParAltR(arrv));
    }
}
