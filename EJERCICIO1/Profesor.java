package model;

public class Profesor extends Empleado{

	private string cargo;
	private int antiguedadDocente;
	
	// Getters
	string getCargo() {
		return this.cargo;
	}
	
	int getAntiguedad() {
		return this.antiguedadDocente;
	}
}
