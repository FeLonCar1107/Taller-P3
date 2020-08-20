package estudiante;

public class Program {

	public static void main(String[] args) {
		
		PilaEstudiante p = new PilaEstudiante();
		
		Estudiante e1 = new Estudiante();
		e1.nombre = "Pepito";
		e1.pago = 2000;
		p.agregarEstudiante(e1);

		Estudiante e2 = new Estudiante();
		e2.nombre = "Carlitos";
		e2.pago = 500;
		p.agregarEstudiante(e2);
		
		Estudiante e3 = new Estudiante();
		e3.nombre = "Miguelito";
		e3.pago = 700;
		p.agregarEstudiante(e3);
		
		Estudiante e4 = new Estudiante();
		e4.nombre = "Natalia";
		e4.pago = 3500;
		p.agregarEstudiante(e4);
		
		Estudiante e5 = new Estudiante();
		e5.nombre = "Jose";
		e5.pago = 2000;
		p.agregarEstudiante(e5);
		
		System.out.println("La diferencia que hay entre " + p.obtenerPromedio() + " que es el promedio y " + p.obtenerMayor() + " Rque es el mayor pago es: " + p.obtenerDiferencia());
	}
	
	 

}
