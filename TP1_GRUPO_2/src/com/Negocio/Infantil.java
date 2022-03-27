package com.Negocio;
import com.Entidades.*;

public class Infantil extends Evento {
		public static float precioMayor = 500;
		public static float precioMenor= 250;
		
		private boolean souvenir;
		/*Mayor de 8 años*/
	
		public Infantil(String nombreEvento, String fechaEvento, Integer duracionEvento,boolean tieneSouvenir) {
			Constructor(nombreEvento,fechaEvento,duracionEvento);
			souvenir = tieneSouvenir;
			entrada = new Entrada[2];
			entrada[0] = new Entrada("Mayor",precioMayor);
			entrada[1] = new Entrada("Menor",precioMenor);		
		}
	
	@Override
	protected void Constructor(String nombreEvento, String fechaEvento, Integer duracionEvento) {
		nombre = nombreEvento;
		fecha = fechaEvento;
		duracion = duracionEvento;
	}
	
	@Override
	public String toString() {
		try {
			String cadena = "";
			cadena = "NOMBRE DEL EVENTO: " + nombre + "\n";
			cadena += "FECHA EVENTO: " + fecha + " | DURACION: " + duracion + " Minutos \n";
			cadena += "TIPO: INFANTIL | INCLUYE SOUVENIR: " + (souvenir ? "Si" : "No") + " \n";
			return cadena;
		}
		catch (Exception e) {
			return "Error al generar ToString";
		}
	}
}
