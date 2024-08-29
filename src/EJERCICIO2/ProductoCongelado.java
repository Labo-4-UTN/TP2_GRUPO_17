package EJERCICIO2;

public class ProductoCongelado extends Producto{
	
	private float tempRec;

	public float getTempRec() {
		return tempRec;
	}

	public ProductoCongelado() {
		super();
	}
	
	@Override
	public String toString() {
		return "ProductoCongelado [tempRec=" + tempRec + ", FechaCaducidad=" + FechaCaducidad + ", NumeroLote="
				+ NumeroLote + "]";
	}

	public void setTempRec(float tempRec) {
		this.tempRec = tempRec;
	}

	public ProductoCongelado(String fecha_de_caducidad, int numeroLote, float tempRec) {
		super(fecha_de_caducidad, numeroLote);
		this.tempRec = tempRec;
	}

}
