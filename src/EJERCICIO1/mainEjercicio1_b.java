package EJERCICIO1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		Profesor P1 = new Profesor("Laura", 23," Preceptor ",9);
		Profesor P2 = new Profesor("Lorena", 32," ViceDirector ",20);
		Profesor P3 = new Profesor("Leonardo", 43," Profesor ",11);
		Profesor P4 = new Profesor("Lina", 34," Profesor ",5);
		Profesor P5 = new Profesor("Lucas", 53," Preceptor ",7);	
		Profesor P6 = new Profesor("Lucas", 53," Preceptor ",7);	
		
		TreeSet<Profesor> treeProfesores = new TreeSet<Profesor>();
		treeProfesores.add(P1);
		treeProfesores.add(P2);
		treeProfesores.add(P3);
		treeProfesores.add(P4);
		treeProfesores.add(P5);
		
		mostrarProfesores(treeProfesores);   
		
		System.out.println(" -------- ");
		
		compararProfesores(P5,P6);
		
		
	}
		
		private static void mostrarProfesores(TreeSet<Profesor> profesores) {
		
        Iterator<Profesor> iterador = profesores.iterator();
        while (iterador.hasNext()) {
            Profesor profesor = iterador.next();
            System.out.println(profesor);
        }		
	}
		private static void compararProfesores(Profesor p1, Profesor p2) {
	        if (p1.equals(p2)) {
	            System.out.println("Es el mismo profesor");
	        } else {
	            System.out.println("No son la misma persona");
	        }
	    }
}
