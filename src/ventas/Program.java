package ventas;

public class Program {

	public static void main(String[] args) {
		
		Red red = new Red();
		
		Vendedor n1 = new Vendedor();
		n1.nombre = "Maria";
		n1.padre = -1;
	    red.addVendedor(n1);
	    
	    Vendedor n2 = new Vendedor();
		n2.nombre = "Luis";
		n2.padre = 0;
	    red.addVendedor(n2);
	    
	    Vendedor n3 = new Vendedor();
		n3.nombre = "Pedro";
		n3.padre = 0;
	    red.addVendedor(n3);
	    
	    Vendedor n4 = new Vendedor();
		n4.nombre = "Pepito";
		n4.padre = 2;
	    red.addVendedor(n4);
	    
	    Vendedor n5 = new Vendedor();
		n5.nombre = "Carlos";
		n5.padre = 3;
	    red.addVendedor(n5);
	    
	    Vendedor n6 = new Vendedor();
		n6.nombre = "Felipe";
		n6.padre = 2;
	    red.addVendedor(n6);
	    
	    Vendedor n7 = new Vendedor();
		n7.nombre = "Isabela";
		n7.padre = 3;
	    red.addVendedor(n7);
	    
	    Vendedor n8 = new Vendedor();
		n8.nombre = "Samuel";
		n8.padre = 5;
	    red.addVendedor(n8);
	    
	    red.obtenerSaldoVendedores();
	    float saldoTotal = red.obtenerSaldoTotal();
	    System.out.println("El saldo total es : " + saldoTotal);
	    System.out.println("El vendedor con mayor saldo es: " + red.obtenerMayor());
	    

	}

}
