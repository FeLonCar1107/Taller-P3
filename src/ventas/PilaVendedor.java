package ventas;

public class PilaVendedor {

	private NodoVendedor top;
	private int tama�o = 0;
	
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
		tama�o++;
	}
	
	public Vendedor pop() {
		if (top == null) {
			return null;
		}
		else {
			Vendedor vendedorTop = top.vendedor;
			top = top.next;
			tama�o--;
			return vendedorTop;
		}
	}

	public boolean isEmpty() {
		
		return false;
	}
}
