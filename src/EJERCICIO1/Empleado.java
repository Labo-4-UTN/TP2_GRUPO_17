package EJERCICIO1;

public class Empleado {
	private final int id;
	private String nombre;
	private int edad;
	
	//Contador
	static int cont=1000;

	//Constructors
	public Empleado() {
        this.id = cont++;
        this.nombre = "sin nombre";
        this.edad = 99;
    }
    
    public Empleado(String name, int age) {
        this.id = cont++;
        this.nombre = name;
        this.edad = age;
    }
	
	// Getters
	int getId() {
		return this.id;
	}
	
	String nombre() {
		return this.nombre;
	}
	
	int edad() {
		return this.edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Método estático
		public static int devuelveProximoID()
		{
			return cont;
		}

		@Override
		public String toString() {
			return "Empleado: "+ this.nombre +", Edad: "+ this.edad + ", Legajo: "+ this.id;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Empleado other = (Empleado) obj;
			if (edad != other.edad)
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}
		
		
}

