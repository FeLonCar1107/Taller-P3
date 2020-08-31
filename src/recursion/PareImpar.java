package recursion;

public class PareImpar {

	public static void main(String[] args) {
	int[] array = new int[] {2, 7, 9, 13, 8};
	contar(array, 0, 0, 0);

	}

	public static void contar(int[] array, int i, int par, int impar ) {
		
		if (i == array.length) {
			System.out.println("Los numeros pares son: " + par);
			System.out.println("Los numeros impares son: " + impar);
			return;
		}
		if (n(array[i]) == true) {
			par++;
		}else{
		    impar++;
	    }
		contar(array, i+1, par, impar);
	}
	
	public static boolean n(int numero) {
		if (numero % 2 == 0) {
			return true;
		}
		return false;
	}
}
