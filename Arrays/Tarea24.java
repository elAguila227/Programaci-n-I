// Alexander Zerpa Wanner
//      200339

import java.util.Arrays;

class Tarea24 {
    
    static int[] nPrimeros(int[] arr, int n) {
        int[] res = new int[Math.min(n, arr.length)];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    static int[] quitaNprimeros(int[] arr, int n) {
        if (arr.length > n) {
            int[] res = new int[arr.length-n];
            for (int i = 0; i < res.length; i++) {
                res[i] = arr[i+n];
            }
            return res;
        }
        return new int[0];
    }

    static int[] inverso(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[arr.length-1-i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(nPrimeros(arr, 4)));
        System.out.println(Arrays.toString(nPrimeros(arr, 5)));
        System.out.println(Arrays.toString(nPrimeros(arr, 10)));
        System.out.println(Arrays.toString(quitaNprimeros(arr, 4)));
        System.out.println(Arrays.toString(quitaNprimeros(arr, 5)));
        System.out.println(Arrays.toString(quitaNprimeros(arr, 10)));
        System.out.println(Arrays.toString(inverso(arr)));
    }
}
