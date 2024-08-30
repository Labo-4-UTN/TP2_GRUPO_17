package EJERCICIO2;

public class ProductoRefrigerado extends Producto{
	
	private String codAlim;

	//Constructores
	public ProductoRefrigerado() {
		super();
		this.codAlim = "000000";
	}
	
	public ProductoRefrigerado(String fecha_de_caducidad, int numeroLote, String cod) {
		super(fecha_de_caducidad, numeroLote);
		this.codAlim = cod;
	}
	
	
	//Getters
	public String getCodAlim() {
		return codAlim;
	}

	//Setters
	public void setCodAlim(String codAlim) {
		this.codAlim = codAlim;
	}

	@Override
	public String toString() {
		return "ProductoRefrigerado [codAlim=" + codAlim + "]" + super.toString();
	}
}
