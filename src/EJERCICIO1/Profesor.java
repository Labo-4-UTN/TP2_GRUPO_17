package EJERCICIO1;

public class Profesor extends Empleado implements Comparable<Profesor>{
	
	private String cargo;
	private int antiguedadDocente;
	
	public String getCargo() {
		return cargo;
	}
	
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	
	public Profesor(String cargo, int antiguedadDocente) {
		super();
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
	public Profesor() {
		super();
		this.cargo =" Sin Cargo";
		this.antiguedadDocente = 000000;
	}

	@Override
	public String toString() {
		return "[" + super.toString() + " Profesor cargo =" + cargo + ", antiguedadDocente=" + antiguedadDocente + "]";
	}

	@Override
	public int compareTo(Profesor o) {
		
		if(o.getId() == this.getId()) {
			return 0;
		}
		if(o.getId()<this.getId()) {
			return 1;
		}
		return -1;
		
	}


	
	
}
