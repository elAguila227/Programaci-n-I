class Arrays {

    static int sumaElemenetos(int[] arr) {
        int res = 0;
        for (int e : arr) {
            res += e;
        } return res;
    }
    static int sumaElemenetosPar(int[] arr) {
        int res = 0;
        for (int e : arr) {
            res += (e % 2 == 0) ? e : 0;
        } return res;
    }
    static int sumaElemenetosPosPar(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i+=2) {
            res += arr[i];
        } return res;
    }
    static double mediaElementos(int[] arr) {
        return (double) sumaElemenetos(arr) / ((arr.length == 0) ? 1 : arr.length);
    }
    //PRE: arr.length > 0
    static int minimo(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    static int minimoRec(int[] arr) {
        return minimoRec(arr, arr[0], 1);
    }
    static int minimoRec(int[] arr, int min, int i) {
        if (i == arr.length) {
            return min;
        }
        return minimoRec(arr, Math.min(arr[i], min), ++i);
    }


    public static void main(String[] args) {
        int[] arr = {7, -2, 3, 1};
        // int[] arr = {2};
        System.out.println("sumaElemenetos:");
        System.out.println(sumaElemenetos(arr));
        System.out.println("sumaElemenetosPar:");
        System.out.println(sumaElemenetosPar(arr));
        System.out.println("sumaElemenetosPosPar:");
        System.out.println(sumaElemenetosPosPar(arr));
        System.out.println("mediaElementos:");
        System.out.println(mediaElementos(arr));
        System.out.println("minimo:");
        System.out.println(minimo(arr));
        System.out.println("minimoRec");
        System.out.println(minimoRec(arr));
    }
}
