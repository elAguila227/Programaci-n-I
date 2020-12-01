/*Alexander Zerpa
	200339*/

class SyntaxisIncrementos {
	public static void main(String[] args) {
		int x = 2;
		x++;
		int y;
		y = x+1;
		y = x++;
		y = ++x;
		System.out.println("x = " + x + ", y = " + y);

		System.out.println(args.length >= 1 ? "programa iniciado con argumentos" : "programa iniciado sin argumentos");
	}
}