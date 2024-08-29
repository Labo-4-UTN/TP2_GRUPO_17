package EJERCICIO1;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		
		Profesor P1 = new Profesor("Juan", 23," Preceptor ",9);
		Profesor P2 = new Profesor("Jaime", 32," ViceDirector ",20);
		Profesor P3 = new Profesor("Jacinta", 43," Profesor ",11);
		Profesor P4 = new Profesor("Jéronimo", 34," Profesor ",5);
		Profesor P5 = new Profesor("José", 53," Preceptor ",7);
		
		// Guardar dentro de un arraylist los 5 profesores:
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		profesores.add(P1);
		profesores.add(P2);
		profesores.add(P3);
		profesores.add(P4);
		profesores.add(P5);
		
		mostrarProfesores(profesores);
	}
	
	private static void mostrarProfesores(ArrayList<Profesor> profesores) {
		
        Iterator<Profesor> iterador = profesores.iterator();
        while (iterador.hasNext()) {
            Profesor profesor = iterador.next();
            System.out.println(profesor);
        }		
	}
}
