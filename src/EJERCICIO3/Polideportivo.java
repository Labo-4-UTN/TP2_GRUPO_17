package EJERCICIO3;

public class Polideportivo extends Edificio implements Instalacion{

	private String Nombre;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public Polideportivo() {
		super();
	}

	public Polideportivo(int longitud, int ancho, String nombre) {
		super(longitud, ancho);
		this.Nombre = nombre;
	}

	@Override
	public String toString() {
		return "Polideportivo Nombre= " + Nombre + " Longitud= " + super.getLongitud() +"m Ancho= "+ super.getAncho()+"m";
	}

	
	
	
}
