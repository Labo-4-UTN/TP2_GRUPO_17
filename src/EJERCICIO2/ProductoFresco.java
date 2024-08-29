package EJERCICIO2;

public class ProductoFresco extends Producto {

	String FechaEnvasado;
	String PaisOrigen;
	
	
	public String getFechaEnvasado() {
		return FechaEnvasado;
	}

	public String getPaisOrigen() {
		return PaisOrigen;
	}

	@Override
	public String toString() {
		return "ProductoFresco [FechaEnvasado=" + FechaEnvasado + ", PaisOrigen=" + PaisOrigen + ", FechaCaducidad="
				+ FechaCaducidad + ", NumeroLote=" + NumeroLote + "]";
	}

	public void setFechaEnvasado(String FechaEnvasado) {
		this.FechaEnvasado = FechaEnvasado;
	}

	public void setPaisOrigen(String PaisOrigen) {
		this.PaisOrigen = PaisOrigen;
	}

	public ProductoFresco() {
		super();
	}

	public ProductoFresco(String fecha_de_caducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
		super(fecha_de_caducidad, numeroLote);
		FechaEnvasado = fechaEnvasado;
		PaisOrigen = paisOrigen;
	}
	
}
