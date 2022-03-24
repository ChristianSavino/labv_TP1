package com.Negocio;
import com.Entidades.*;

public class Infantil extends Evento {
@Override
	protected void Constructor(String nombreEvento, String fechaEvento, String localidadEvento) {
		nombre = nombreEvento;
		fecha = fechaEvento;
		localidad = localidadEvento;
	}
		public static float precioMayor = 500;
		public static float precioMenor= 250;
		/*Mayor de 8 años*/
	
		public Infantil() {
		entrada = new Entrada[2];
		entrada[0] = new Entrada("Mayor",precioMayor);
		entrada[1] = new Entrada("Menor",precioMenor);
		}
}
