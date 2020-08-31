package recursion;

public class Entero {

	public static void main(String[] args) {
		int division = division(30, 5);
		System.out.println("El resultado de la division es " + division);

	}
	
		public static int division(int a, int b) {
			if (a == b) {
				return 1;
			}
		    return division(a - b, b) + 1;
		}

}
