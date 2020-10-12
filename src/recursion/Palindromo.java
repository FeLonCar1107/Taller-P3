package recursion;

public class Palindromo {

	public static void main(String[] args) {
	
       int[] elementos = {2,3,7,3,2};
       System.out.println(palindromo(elementos,0,elementos.length - 1,elementos.length));
	}
	
	public static int palindromo(int[] numeros, int i, int ultimo, int tamaño) {
		if (numeros[i] == numeros[ultimo]) {
			if (tamaño < 3) {
				return 1;
			} else {
                return palindromo(numeros, i + 1, ultimo - 1, tamaño - 1);
			}
		}else {
			return 0;
		}
	}

}

