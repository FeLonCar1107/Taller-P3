package recursion;

public class SumaArray {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 4};
        int sum = suma(array , 0);
        System.out.println("El resultado de la suma es " + sum);
	}
	
	public static int suma(int [] a, int i) {
		if (i == a.length) {
			return 0;
		}
		return a[i] + suma(a, i + 1 );
	}

}
