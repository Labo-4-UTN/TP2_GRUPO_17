package EJERCICIO3;

public class Edificio implements Instalacion{
 int Longitud;
 int Ancho;
 
 double getSuperficieEdificio() {
	double Resultado= this.Longitud * this.Ancho;
	return Resultado;
 }
 
 
}
