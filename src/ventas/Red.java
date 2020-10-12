package ventas;

public class Red {
	
	private Vendedor[] vendedores = new Vendedor[10];
	private int cant = 0;
	
	public float obtenerDescuento() {
		float total = 0;
	    total = 1000 - (1000 * (10 / 100));
	    return total;
	}
	
	public void addVendedor (Vendedor vendedor) {
		vendedor.saldo = obtenerDescuento();
		vendedores[cant] = vendedor;
		cant++;
	}
	
	public void obtenerSaldoVendedores() {
		PilaVendedor pilaVendedores = new PilaVendedor();
		
		for (int i = 0; i < cant; i++) {
			pilaVendedores.push(vendedores[i]);
		}
		
		Vendedor vendedor;
		while(pilaVendedores.isEmpty()) {
			vendedor = pilaVendedores.pop();
			if (vendedor.padre != -1) {
				float comision = vendedor.saldo * (25/100);
				vendedores[vendedor.padre].saldo = vendedores[vendedor.padre].saldo * comision;
			}
		}
	}
	
	public float obtenerSaldoTotal() {
		float total = 0;
		 for (int i = 0; i < cant; i++) {
			total = total + vendedores[i].saldo;
		}
		return total;
	}
	
	public float obtenerMayor() {
		float mayor = 0;
		for (int i = 0; i < cant; i++) {
			if (vendedores[i].saldo > mayor) {
				mayor = vendedores[i].saldo;
			}
		}
		return mayor;
	}
	
	public float obtenerMenor() {
		float menor = 0;
		for (int i = 0; i < cant; i++) {
			if (vendedores[i].saldo < menor) {
				menor = vendedores[i].saldo;
			}
		}
		return menor;
	}
	
	
	
	
}
