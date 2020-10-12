package recursion;

public class Digito {

	public static void main(String[] args) {
		
		int n= 500;
		System.out.println("Tiene " + digito(n) + " digito(s)");
	}

	public static int digito(int numero) {
		if (numero < 10) {
			return 1;
		} else {
            return digito(numero/10) + 1;
		}
	}
}
