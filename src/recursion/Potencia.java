package recursion;

public class Potencia {

	public static void main(String[] args) {
		int potencia = potencia(2, 3);
		System.out.println("El resultado de la potencia es " + potencia);

	}
	
	public static int potencia(int a, int b) {
		if (b == 0) {
			return 1;
		}
	    return a * potencia(a, b - 1);
	}

}
