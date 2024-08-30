package EJERCICIO3;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Edificio> listaEdificios = new ArrayList<Edificio>();
		listaEdificios.add(new Polideportivo(100, 90, "San Jorge"));
		listaEdificios.add(new Polideportivo(150, 100, "Recreativo "));
		listaEdificios.add(new Polideportivo(200, 150, "Litoral"));
		listaEdificios.add(new EdificioOficinas(50, 60, 130));
		listaEdificios.add(new EdificioOficinas(40, 55, 300));
		
		mostrarEdificios(listaEdificios);
	}
	
	private static void mostrarEdificios(ArrayList<Edificio> listaEdificios) {
        Iterator<Edificio> iterador = listaEdificios.iterator();
        while (iterador.hasNext()) {
            Edificio edificio = iterador.next();
            System.out.println(edificio);
        }
    }

}
