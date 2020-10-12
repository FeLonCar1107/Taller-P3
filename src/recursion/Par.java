package recursion;

public class Par {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5};
        int sum = par(array , 0);
        System.out.println("El resultado de la suma de los pares es " + sum);
	}
	
	public static int par(int [] a, int i) {
		if (i == a.length) {
			return 0;
		}
		if (a[i]%2 == 0) {
			
			return a[i] + par(a, i + 1 );	
		}
		return i;
		
	}

}
