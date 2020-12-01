/* Alexander Zerpa Wanner
	200339 */

class Pruebas {

	static boolean esMultiplo(int n, int m) {
		return m!= 0 && n%m == 0;
	}
	static boolean esPar(int n) {
		return esMultiplo(n, 2);
	}
	static boolean esImpar(int n) {
		return esMultiplo(n+1, 2);
	}


	public static void main(String[] args) {
		System.out.println("------------");

		System.out.println("esMultiplo:");
		System.out.println((esMultiplo(6, 3) && !esMultiplo(5, 3)) && !esMultiplo(6, 0) ? "Funciona" : "No funciona");

		System.out.println("------------");

		System.out.println("esPar:");
		System.out.println((esPar(6) && !esPar(5)) ? "Funciona" : "No funciona");

		System.out.println("------------");

		System.out.println("esImpar:");
		System.out.println((esImpar(5) && !esImpar(6)) ? "Funciona" : "No funciona");

		System.out.println("------------");


	}
}