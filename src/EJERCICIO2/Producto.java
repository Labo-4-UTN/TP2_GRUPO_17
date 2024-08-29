package EJERCICIO2;

public class Producto {
	String FechaCaducidad;
	int NumeroLote;
	public String getFecha_de_caducidad() {
		return FechaCaducidad;
	}
	public void setFecha_de_caducidad(String fecha_de_caducidad) {
		this.FechaCaducidad = fecha_de_caducidad;
	}
	public int getNumeroLote() {
		return NumeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		NumeroLote = numeroLote;
	}
	public Producto(String fecha_de_caducidad, int numeroLote) {
		super();
		this.FechaCaducidad = fecha_de_caducidad;
		NumeroLote = numeroLote;
	}
	public Producto() {
		super();
		this.FechaCaducidad ="Sin Fecha";
		this.NumeroLote = 000000;
	}
	
	@Override
	public String toString() {
		return "Producto [FechaCaducidad=" + FechaCaducidad + ", NumeroLote=" + NumeroLote + "]";
	}
	
	
}
