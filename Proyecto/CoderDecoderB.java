import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/*
* Alexander Zerpa Wanner | (2M-B) | matricula: 200339
* Esteban Aspe Ruiz      | (2M-B) | metricula: 200249
*/

class CoderDecoder {

    // encodeASCIIChar(c : char) : int
    // PRE: c es parte de los Caracteres ASCII.
    // POS: devuelve el valor numerico de c en la tabla ASCII.
    static int encodeASCIIChar(char c){
        return (int) c;
    }
    // decodeASCIIChar(n : int) : char
    // PRE: 0 < n < 127.
    // POS: devuelve el equivalente de n en la tabla ASCII.
    static char decodeASCIIChar(int n){
       return (char) n;
    } // de funcionSwitch1

    // encodeChar(c : char) : char
    // PRE: c es parte de los Caracteres ASCII.
    // POS: devuelve el caracter 46 espacios desfazado de c en la tabla ASCII de manera que los caracteres alfanumericos siempre correspondan a otro y los de control a los de control.
    static char encodeChar(char c) {
        int n = encodeASCIIChar(c);
        if (n > 31 && n != 127) {
            n = (((n-32)+46)%95)+32;
        } else {
            n = n == 127 ? 32 : n;
            n = (n+46)%33;
            n = n == 32 ? 127 : n;
        }
        return decodeASCIIChar(n);
    }
    // decodeChar(c : char) : char
    // PRE: c es parte de los Caracteres ASCII.
    // POS: devuelve el caracter 46 espacios desfazado de c en la tabla ASCII pero en el sentido contrario que en la metodo encodeChar().
    static char decodeChar(char c) {
        int n = encodeASCIIChar(c);
        if (n > 31 && n != 127) {
            n = (((n-32)+49)%95)+32;
        } else {
            n = n == 127 ? 32 : n;
            n = (n+20)%33;
            n = n == 32 ? 127 : n;
        }
        return decodeASCIIChar(n);
    }

    static int[] codeASCII(char[] arr){
        int [] code= new int [arr.length];
        for (int i=0; i<arr.length; i++){
            code[i]=encodeASCIIChar(arr[i]);
        }
        return code;
    }

    static char[] decodeASCII(int[] arr){
        char [] decode= new char [arr.length];
        for (int i=0; i<arr.length; i++){
            decode[i]=decodeASCIIChar(arr[i]);
        }
        return decode;
    }

    static char[] code(char[] arr) {
        char[] narr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int n = encodeASCIIChar(arr[i]);
            if (n > 31 && n != 127) {
                n = (((n-32)+(46*i))%95)+32;
            } else {
                n = n == 127 ? 32 : n;
                n = (n+(46*i))%33;
                n = n == 32 ? 127 : n;
            }
            narr[i] = encodeChar(decodeASCIIChar(n));
        }
        return narr;
    }

    static char[] decode(char[] arr) {
        char[] narr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int n = encodeASCIIChar(arr[i]);
            if (n > 31 && n != 127) {
                n = (((n-32)+(49*i))%95)+32;
            } else {
                n = n == 127 ? 32 : n;
                n = (n+(20*i))%33;
                n = n == 32 ? 127 : n;
            }
            narr[i] = decodeChar(decodeASCIIChar(n));
        }
        return narr;
    }

    // metodo auxiliar para testeo de encodeASCIIChar y decodeASCIIChar
    static boolean testASCIICharCoder() {
        for (int i = 0; i < 128; i++) {
            if (((char) i) != (decodeASCIIChar(encodeASCIIChar((char) i)))) {
                return false;
            }
        }
        return true;
    }
    // metodo auxiliar para testeo de encodeChar y decodeChar
    static boolean testCharCoder() {
        for (int i = 0; i < 128; i++) {
            if (((char) i) != (decodeChar(encodeChar((char) i)))) {
                return false;
            }
        }
        return true;
    }

    static boolean testASCIICoder() {
        char[][] arr = new char[128][128];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (char) ((j+i)%128);
            }
            if (!arrayEquals(arr[i], decodeASCII(codeASCII(arr[i])))) {
                return false;
            }
        }
        return true;
    }

    static boolean testCoder() {
        char[][] arr = new char[128][128];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (char) ((j+i)%128);
            }
            if (!arrayEquals(arr[i], decode(code(arr[i])))) {
                return false;
            }
        }
        return true;
    }

    static boolean arrayEquals(char[] arr1, char[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // metodo auxiliar para imprimir a consola la tabla de encodeASCIIChar y decodeASCIIChar entre i y t
    static void printASCIITable(int i, int t) {
        for (; i < t; i++) {
            System.out.print(i);
            System.out.print(" ");
            System.out.print(((char) i));
            System.out.print(" - ");
            System.out.print(encodeASCIIChar(((char) i)));
            System.out.print('\n');
        }
    }
    // metodo auxiliar para imprimir a consola la tabla de encodeChar y decodeChar entr i y t
    static void printTable(int i, int t) {
        for (; i < t; i++) {
            System.out.print(i);
            System.out.print(" ");
            System.out.print(((char) i));
            System.out.print(" - ");
            System.out.print(encodeChar(((char) i)));
            System.out.print('\n');
        }
    }

    static String[] append(String[] arr, String e) {
        String[] narr = new String[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            narr[i] = arr[i];
        }
        narr[narr.length-1] = e;
        return narr;
    }

    public static void main(String[] args) throws Exception {

        File file = new File("./words.txt"); 
        Scanner sc = new Scanner(file); 

        String[] words = new String[0];
        while (sc.hasNextLine()) 
            words = append(words, sc.nextLine()); 

        for (String word : words) {
            char[] arr = new char[word.length()];
            for (int i = 0; i < word.length(); i++) {
                arr[i] = word.charAt(i);
            }
            if (!arrayEquals(arr, decode(code(arr))) || !arrayEquals(arr, decodeASCII(codeASCII(arr)))) {
                System.out.println("ERROR");
            }
        }

        // printASCIITable(0, 128);
        System.out.println(testASCIICharCoder() ? "Funciona" : "Error!");

        // printTable(0, 128);
        System.out.println(testCharCoder() ? "Funciona" : "Error!");

        System.out.println(testCoder() ? "Funciona" : "Error!");

        System.out.println(testASCIICoder() ? "Funciona" : "Error!");

    }
}
