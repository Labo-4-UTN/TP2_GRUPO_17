package EJERCICIO3;

public class EdificioOficinas extends Edificio {

	int cantidadDeOficinas;
	
	public EdificioOficinas() {
		super();
	}	
	
	public EdificioOficinas(int cantidadDeOficinas) {
		super();
		this.cantidadDeOficinas = cantidadDeOficinas;
	}

	public EdificioOficinas(int longitud, int ancho, int cantidadDeOficinas) {
		super(longitud, ancho);
		this.cantidadDeOficinas = cantidadDeOficinas;
	}

	public int getCantidadDeOficinas() {
		return this.cantidadDeOficinas;
	}
}
