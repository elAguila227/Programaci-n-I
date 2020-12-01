// imports para generar documentos no relevantes para la practica en si
import java.io.FileWriter;
import java.io.IOException;

/*
* Alexander Zerpa Wanner | (2M-B) | matricula: 200339
* Esteban Aspe Ruiz      | (2M-B) | metricula: 200249
*/


class CodeDecoder {

    // encodeASCIIChar(c : char) : int
    // PRE: c es parte de los Caracteres ASCII.
    // POS: devuelve el valor numerico de c en la tabla ASCII.
    static int encodeASCIIChar(char c){
        switch (c) {
            case '\u0000': return 0;
            case '\u0001': return 1;
            case '\u0002': return 2;
            case '\u0003': return 3;
            case '\u0004': return 4;
            case '\u0005': return 5;
            case '\u0006': return 6;
            case '\u0007': return 7;
            case '\u0008': return 8;
            case '\u0009': return 9;
            case '\n': return 10;
            case '\u000b': return 11;
            case '\u000c': return 12;
            case '\r': return 13;
            case '\u000e': return 14;
            case '\u000f': return 15;
            case '\u0010': return 16;
            case '\u0011': return 17;
            case '\u0012': return 18;
            case '\u0013': return 19;
            case '\u0014': return 20;
            case '\u0015': return 21;
            case '\u0016': return 22;
            case '\u0017': return 23;
            case '\u0018': return 24;
            case '\u0019': return 25;
            case '\u001a': return 26;
            case '\u001b': return 27;
            case '\u001c': return 28;
            case '\u001d': return 29;
            case '\u001e': return 30;
            case '\u001f': return 31;
            case ' ': return 32;
            case '!': return 33;
            case '"': return 34;
            case '#': return 35;
            case '$': return 36;
            case '%': return 37;
            case '&': return 38;
            case '\'': return 39;
            case '(': return 40;
            case ')': return 41;
            case '*': return 42;
            case '+': return 43;
            case ',': return 44;
            case '-': return 45;
            case '.': return 46;
            case '/': return 47;
            case '0': return 48;
            case '1': return 49;
            case '2': return 50;
            case '3': return 51;
            case '4': return 52;
            case '5': return 53;
            case '6': return 54;
            case '7': return 55;
            case '8': return 56;
            case '9': return 57;
            case ':': return 58;
            case ';': return 59;
            case '<': return 60;
            case '=': return 61;
            case '>': return 62;
            case '?': return 63;
            case '@': return 64;
            case 'A': return 65;
            case 'B': return 66;
            case 'C': return 67;
            case 'D': return 68;
            case 'E': return 69;
            case 'F': return 70;
            case 'G': return 71;
            case 'H': return 72;
            case 'I': return 73;
            case 'J': return 74;
            case 'K': return 75;
            case 'L': return 76;
            case 'M': return 77;
            case 'N': return 78;
            case 'O': return 79;
            case 'P': return 80;
            case 'Q': return 81;
            case 'R': return 82;
            case 'S': return 83;
            case 'T': return 84;
            case 'U': return 85;
            case 'V': return 86;
            case 'W': return 87;
            case 'X': return 88;
            case 'Y': return 89;
            case 'Z': return 90;
            case '[': return 91;
            case '\\': return 92;
            case ']': return 93;
            case '^': return 94;
            case '_': return 95;
            case '`': return 96;
            case 'a': return 97;
            case 'b': return 98;
            case 'c': return 99;
            case 'd': return 100;
            case 'e': return 101;
            case 'f': return 102;
            case 'g': return 103;
            case 'h': return 104;
            case 'i': return 105;
            case 'j': return 106;
            case 'k': return 107;
            case 'l': return 108;
            case 'm': return 109;
            case 'n': return 110;
            case 'o': return 111;
            case 'p': return 112;
            case 'q': return 113;
            case 'r': return 114;
            case 's': return 115;
            case 't': return 116;
            case 'u': return 117;
            case 'v': return 118;
            case 'w': return 119;
            case 'x': return 120;
            case 'y': return 121;
            case 'z': return 122;
            case '{': return 123;
            case '|': return 124;
            case '}': return 125;
            case '~': return 126;
            case '\u007f': return 127;
            default: return 0  ;
        }
    }
    // decodeASCIIChar(n : int) : char
    // PRE: 0 < n < 127.
    // POS: devuelve el equivalente de n en la tabla ASCII.
    static char decodeASCIIChar(int n){
        switch (n) {
            case 0: return '\u0000';
            case 1: return '\u0001';
            case 2: return '\u0002';
            case 3: return '\u0003';
            case 4: return '\u0004';
            case 5: return '\u0005';
            case 6: return '\u0006';
            case 7: return '\u0007';
            case 8: return '\u0008';
            case 9: return '\u0009';
            case 10: return '\n';
            case 11: return '\u000b';
            case 12: return '\u000c';
            case 13: return '\r';
            case 14: return '\u000e';
            case 15: return '\u000f';
            case 16: return '\u0010';
            case 17: return '\u0011';
            case 18: return '\u0012';
            case 19: return '\u0013';
            case 20: return '\u0014';
            case 21: return '\u0015';
            case 22: return '\u0016';
            case 23: return '\u0017';
            case 24: return '\u0018';
            case 25: return '\u0019';
            case 26: return '\u001a';
            case 27: return '\u001b';
            case 28: return '\u001c';
            case 29: return '\u001d';
            case 30: return '\u001e';
            case 31: return '\u001f';
            case 32: return ' ';
            case 33: return '!';
            case 34: return '"';
            case 35: return '#';
            case 36: return '$';
            case 37: return '%';
            case 38: return '&';
            case 39: return '\'';
            case 40: return '(';
            case 41: return ')';
            case 42: return '*';
            case 43: return '+';
            case 44: return ',';
            case 45: return '-';
            case 46: return '.';
            case 47: return '/';
            case 48: return '0';
            case 49: return '1';
            case 50: return '2';
            case 51: return '3';
            case 52: return '4';
            case 53: return '5';
            case 54: return '6';
            case 55: return '7';
            case 56: return '8';
            case 57: return '9';
            case 58: return ':';
            case 59: return ';';
            case 60: return '<';
            case 61: return '=';
            case 62: return '>';
            case 63: return '?';
            case 64: return '@';
            case 65: return 'A';
            case 66: return 'B';
            case 67: return 'C';
            case 68: return 'D';
            case 69: return 'E';
            case 70: return 'F';
            case 71: return 'G';
            case 72: return 'H';
            case 73: return 'I';
            case 74: return 'J';
            case 75: return 'K';
            case 76: return 'L';
            case 77: return 'M';
            case 78: return 'N';
            case 79: return 'O';
            case 80: return 'P';
            case 81: return 'Q';
            case 82: return 'R';
            case 83: return 'S';
            case 84: return 'T';
            case 85: return 'U';
            case 86: return 'V';
            case 87: return 'W';
            case 88: return 'X';
            case 89: return 'Y';
            case 90: return 'Z';
            case 91: return '[';
            case 92: return '\\';
            case 93: return ']';
            case 94: return '^';
            case 95: return '_';
            case 96: return '`';
            case 97: return 'a';
            case 98: return 'b';
            case 99: return 'c';
            case 100: return 'd';
            case 101: return 'e';
            case 102: return 'f';
            case 103: return 'g';
            case 104: return 'h';
            case 105: return 'i';
            case 106: return 'j';
            case 107: return 'k';
            case 108: return 'l';
            case 109: return 'm';
            case 110: return 'n';
            case 111: return 'o';
            case 112: return 'p';
            case 113: return 'q';
            case 114: return 'r';
            case 115: return 's';
            case 116: return 't';
            case 117: return 'u';
            case 118: return 'v';
            case 119: return 'w';
            case 120: return 'x';
            case 121: return 'y';
            case 122: return 'z';
            case 123: return '{';
            case 124: return '|';
            case 125: return '}';
            case 126: return '~';
            case 127: return '\u007f';
            default: return '\u0000';
        }
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


    // los siguientes 2 metodos toman el comportamiento de encodeChar y decodeChar y lo expande para todos los caracteres unicode.
    // el funcionamiento de encodeCharU y decodeCharU es el mismo que en encodeChar y decodeChar si se acatan las restricciones de estos ultimos.

    // encodeCharU(c : char) : char
    // PRE: true.
    // POS: devuelve el caracter 46 espacios desfazado de c en el orden del codigo Unicode.
    static char encodeCharU(char c) {
        int u = (int) c;
        int n = u%128;
        if (n > 31 && n != 127) {
            n = (((n-32)+46)%95)+32;
        } else {
            n = n == 127 ? 32 : n;
            n = (n+46)%33;
            n = n == 32 ? 127 : n;
        }
        return (char) (n + ((u/128)*128));
    }
    // decodeCharU(c : char) : char
    // PRE: true.
    // POS: devuelve el caracter 46 espacios desfazado de c en el orden del codigo Unicode pero en el sentido contrario que en el metodo encodeCharU.
    static char decodeCharU(char c) {
        int u = (int) c;
        int n = u%128;
        if (n > 31 && n != 127) {
            n = (((n-32)+49)%95)+32;
        } else {
            n = n == 127 ? 32 : n;
            n = (n+20)%33;
            n = n == 32 ? 127 : n;
        }
        return (char) (n + ((u/128)*128));
    }

    // metodo auxiliar para testeo de encodeASCIIChar y decodeASCIIChar
    static boolean testASCIICoder() {
        for (int i = 0; i < 127; i++) {
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
    // metodo auxiliar para testeo de encodeCharU y decodeCharU
    static boolean testCoderU() {
        for (int i = 0; i < 0xffff; i++) {
            if (((char) i) != (decodeCharU(encodeCharU((char) i)))) {
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
    // metodo auxiliar para imprimir a consola la tabla de encodeCharU y decodeCharU entre i y t
    static void printTableU(int i, int t) {
        for (; i < t; i++) {
            System.out.print(i);
            System.out.print(" ");
            System.out.print(((char) i));
            System.out.print(" - ");
            System.out.print(encodeCharU(((char) i)));
            System.out.print('\n');
        }
    }

    // metodo auxiliar para generar archivo.txt con la tabla de encodeASCIIChar
    static void makeASCIITableFile() {
        try {
            FileWriter myWriter = new FileWriter("ASCII.txt", true);
            for (int i = 0; i < 128; i++) {
                myWriter.write(String.format("%d: %c\n", i, encodeASCIIChar(((char) i))));
            }
            myWriter.close();
            System.out.println("archivo creado.");
        } catch (IOException e) {
            System.out.println("ha ocurrido un error.");
            e.printStackTrace();
        }
    }
    // metodo auxiliar para generar archivo.txt con la tabla de encodeChar
    static void makeTableFile() {
        try {
            FileWriter myWriter = new FileWriter("Code.txt", true);
            for (int i = 0; i < 128; i++) {
                myWriter.write(String.format("%d: %c - %c\n", i, ((char) i), encodeChar(((char) i))));
            }
            myWriter.close();
            System.out.println("archivo creado.");
        } catch (IOException e) {
            System.out.println("ha ocurrido un error.");
            e.printStackTrace();
        }
    }
    // metodo auxiliar para generar archivo.txt con la tabla de encodeCharU
    static void makeTableFileU() {
        try {
            FileWriter myWriter = new FileWriter("Unicode.txt", true);
            for (int i = 0; i < 0xffff; i++) {
                myWriter.write(String.format("%d: %c - %c\n", i, ((char) i), encodeCharU(((char) i))));
            }
            myWriter.close();
            System.out.println("archivo creado.");
        } catch (IOException e) {
            System.out.println("ha ocurrido un error.");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        // printTableU(0, 0xffff);
        System.out.println(testCoderU() ? "Funciona" : "Error!");
        // makeTableFileU();

        // printASCIITable(0, 128);
        System.out.println(testASCIICoder() ? "Funciona" : "Error!");
        // makeASCIITableFile();

        printTable(0, 128);
        System.out.println(testCoder() ? "Funciona" : "Error!");
        // makeTableFile();

    }
}
