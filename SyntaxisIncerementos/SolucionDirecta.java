/*Alexander Zerpa
	200339*/
class SolucionDirecta {

	public static void main(String[] args) {
		System.out.println(String.format("absoluto de -3 = %d", absoluto(-3)));
		System.out.println(String.format("absoluto de -5.4 = %s", absoluto(-5.4)));
		System.out.println(String.format("2 unidades, 3 decenas, 4 centenas = %d", conversion(2, 3, 4)));
		System.out.println(String.format("area de triangulo de base 4 y altura 3 = %.2f", areaTriangulo(4, 3)));
	}

	static int absoluto(int a) {
		return a < 0 ? -a : a;
	}
	static double absoluto(double a) {
		return a < 0 ? -a : a;
	}
	static int conversion(int u, int d, int c) {
		return u + d*10 + c*100;
	}
	static double areaTriangulo(double b, double h) {
		return (b*h)/2;
	}
}