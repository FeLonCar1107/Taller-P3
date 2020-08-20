package estudiante;

public class PilaEstudiante {
	
	int capacidad = 6;
	int cant = 0;
	
	Estudiante[] estudiantes = new Estudiante[capacidad];
	
	void agregarEstudiante(Estudiante estudiante) {
		estudiantes[cant] = estudiante;
		cant++;
	}
	
	public float obtenerSuma() {
		float respuesta = 0;
		for (int i = 0; i < cant ; i++) {
			respuesta = respuesta + estudiantes[i].pago;
		}
		return respuesta;
	}
	
	public float obtenerMayor() {
		float mayor = 0;
		for (int i = 0; i < cant; i++) {
			if (estudiantes[i].pago > mayor) {
				mayor = estudiantes[i].pago;
			}
		}
		return mayor;
	}
	
	public float obtenerPromedio() {
		float respuesta = 0;
	    respuesta = obtenerSuma() / cant;
	    return respuesta;
	}
	
	public float obtenerDiferencia() {
		float respuesta = 0;
		respuesta = obtenerMayor() - obtenerPromedio();
		return respuesta;
	}
}
