package recursion;

public class Primo {

	public static void main(String[] args) {
		
		int numero = 18;
		System.out.println(primo(numero, 2));

	}
	
	public static String primo(int n, int d) {
		if (n/2 < d) {
			return "SI";
		}else {
			if (n%d==0) {
				return "NO";
			}else {
				return primo(n, d+1);
			}
		}
	}

}
