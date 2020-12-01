/* Alexander Zerpa Wanner
	200339 */

class Funciones {

	public static void main(String[] args) {
		int var1 = 3;
		int var2 = 3;
		boolean mayor;
		boolean iguales;
		boolean distintos;
		System.out.println(String.format("var1 = %d, var2 = %d", var1, var2));
		mayor = var1 > var2;
		System.out.println("var1 > var2? " + mayor);
		iguales = var1 == var2;
		System.out.println("Son iguales? " + iguales);
		distintos = !iguales;
		System.out.println("Son distintos? " + distintos);
	}
}