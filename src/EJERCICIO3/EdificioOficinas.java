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

	public void setCantidadDeOficinas(int cantidadDeOficinas) {
		this.cantidadDeOficinas = cantidadDeOficinas;
	}

	@Override
	public String toString() {
		return "EdificioOficinas cantidadDeOficinas=" + cantidadDeOficinas + " Longitud " +super.getLongitud()+ " Ancho " + super.getAncho();
	}
	
	
}
