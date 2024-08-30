package EJERCICIO2;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio2 {

	public static void main(String[] args) {
		Producto Prod1 = new ProductoCongelado("2028-12-31", 10234, -10);
		Producto Prod2 = new ProductoFresco("2024-08-2", 20235, "2024-07-2", "Argentina");
		Producto Prod3 = new ProductoRefrigerado("2024-06-25", 30453, "PR012");
		
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos.add(Prod1);
		listaProductos.add(Prod2);
		listaProductos.add(Prod3);
		
		mostrarProductos(listaProductos);
	}
	
	private static void mostrarProductos(ArrayList<Producto> productos) {
		
        Iterator<Producto> iterador = productos.iterator();
        while (iterador.hasNext()) {
            Producto producto = iterador.next();
            System.out.println(producto);
        }		
	}

}
