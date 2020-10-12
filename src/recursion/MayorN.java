package recursion;

public class MayorN {

	public static void main(String[] args) {
		
		int[] elementos = {12, 33, 56, 21, 60, 120};
		System.out.println(mayor(elementos, 0, elementos[0]) + " es el mayor elemento");

	}
	
	public static int mayor(int[] numeros, int i, int mayor) {
		if (i != numeros.length) {
	         if (numeros[i] > mayor) {
			  mayor = mayor(numeros, i + 1, numeros[i]);
		     } else {
              mayor = mayor(numeros, i + 1, mayor);
		     }
 		}
		return mayor;
	}

}
