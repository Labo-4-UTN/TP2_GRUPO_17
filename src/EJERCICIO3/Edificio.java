package EJERCICIO3;

public class Edificio implements Instalacion{
	
	private int Longitud;
	private int Ancho;
 
	//Constructores
	public Edificio(){
		this.Longitud = 0;
		this.Ancho = 0;
	}
	
	public Edificio(int longitud,int ancho) {
		this.Longitud = longitud;
		this.Ancho = ancho;
	}
	
	//Getters
	 public int getLongitud() {
		return Longitud;
	}
	 
	public void setLongitud(int longitud) {
		Longitud = longitud;
	}

	//Setters
	public int getAncho() {
		return Ancho;
	}

	public void setAncho(int ancho) {
		Ancho = ancho;
	}

	double getSuperficieEdificio() {
		double Resultado= this.Longitud * this.Ancho;
		return Resultado;
	 }

	@Override
	public String toString() {
		return "Edificio [Longitud=" + Longitud + "m, Ancho=" + Ancho + "m]";
	}

	@Override
	public String getTipoDeInstalacion() {
		
		return "Se trata de un edificio";
	}
	
}
