package ventas;

public class PilaVendedor {

	private NodoVendedor top;
	private int tamaño = 0;
	
	public void push (Vendedor vendedor) {
		NodoVendedor nuevoNodo = new NodoVendedor();
		nuevoNodo.vendedor = vendedor;
		
		if (top == null) {
			top = nuevoNodo;
		}
		else {
			nuevoNodo.next = top;
			top = nuevoNodo;
		}
		tamaño++;
	}
	
	public Vendedor pop() {
		if (top == null) {
			return null;
		}
		else {
			Vendedor vendedorTop = top.vendedor;
			top = top.next;
			tamaño--;
			return vendedorTop;
		}
	}

	public boolean isEmpty() {
		
		return false;
	}
}
