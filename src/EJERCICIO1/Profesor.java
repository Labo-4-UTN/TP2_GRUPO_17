package EJERCICIO1;

public class Profesor extends Empleado{
	
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
	
	public Profesor() {
		super();
		this.cargo =" Sin Cargo";
		this.antiguedadDocente = 000000;
	}

	@Override
	public String toString() {
		return " ID : "+ super.getId() + " NOMBRE " + super.getNombre() + " EDAD " + super.getEdad() + " CARGO " + cargo + " ANTIGUED DOCENTE : " + antiguedadDocente;
	}
	
}
