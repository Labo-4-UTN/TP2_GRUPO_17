package EJERCICIO2;

public class ProductoCongelado extends Producto{
	
	private float tempRec;

	public float getTempRec() {
		return tempRec;
	}

	public ProductoCongelado() {
		super();
	}
	
	public ProductoCongelado(String fecha_de_caducidad, int numeroLote, float tempRec) {
		super(fecha_de_caducidad, numeroLote);
		this.tempRec = tempRec;
	}

}
