/*Alexander Zerpa
	200339 */

class Funciones_the_comeback {
	public static void main(String[] args) {
		// Ejercicio1
		System.out.println("Ejercicio1:");
		int x = 55;
		int y = -7;
		System.out.println("(0) x = " + x + ", y = " + y);
		// Swap
		int tempx = x;
		x = y;
		y = tempx;

		System.out.println("(1) x = " + x + ", y = " + y);

		// Ejemplo writeLine()
		writeLine();

		// Ejercicio2
		System.out.println("Ejercicio2");
		int var1 = 2;
		int var2 = 3;
		int result = f1(var1, var2);
		System.out.println("(0) result = " + result);
		result = f1(1, -1);
		System.out.println("(1) result = " + result);

		// Ejemplo writeLine()
		writeLine();

		// Ejercicio3
		System.out.println("Ejercicio3");
		int lado = 3;
		System.out.println("(0) Cuadrado de lado " + lado + ", tiene un area de " + areaSqr(lado));
		lado = 5;
		System.out.println("(1) Cuadrado de lado " + lado + ", tiene un area de " + areaSqr(lado));
		lado = 67;
		System.out.println("(2) Cuadrado de lado " + lado + ", tiene un area de " + areaSqr(lado));
	}
	// Funcion ejercicio2
	static int f1(int x, int y) {
		return (2*x)-y;
	}
	// Funcion ejercicio3
	static int areaSqr(int side) {
		return side*side;
	}
	// Funcion ejemplo
	static void writeLine() {
		System.out.println("--------------------");
	}
}