
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

    // metodo auxiliar para testeo de encodeASCIIChar y decodeASCIIChar
    static boolean testASCIICoder() {
        for (int i = 0; i < 128; i++) {
            if (((char) i) != (decodeASCIIChar(encodeASCIIChar((char) i)))) {
                return false;
            }
        }
        return true;
    }
    // metodo auxiliar para testeo de encodeChar y decodeChar
    static boolean testCoder() {
        for (int i = 0; i < 128; i++) {
            if (((char) i) != (decodeChar(encodeChar((char) i)))) {
                return false;
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


    public static void main(String[] args) {

        // printASCIITable(0, 128);
        System.out.println(testASCIICoder() ? "Funciona" : "Error!");

        // printTable(0, 128);
        System.out.println(testCoder() ? "Funciona" : "Error!");

    }
}
