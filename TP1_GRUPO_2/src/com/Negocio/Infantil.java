package com.Negocio;
import com.Entidades.*;

public class Infantil extends Evento {
		public static float precioMayor = 500;
		public static float precioMenor= 250;
		/*Mayor de 8 años*/
	
		public Infantil() {
		entrada = new Entrada[2];
		entrada[0] = new Entrada("Mayor",precioMayor);
		entrada[1] = new Entrada("Menor",precioMenor);
		}
	
	@Override
	protected void Constructor(String nombreEvento, String fechaEvento, String localidadEvento) {
		nombre = nombreEvento;
		fecha = fechaEvento;
		localidad = localidadEvento;
	}
	
	@Override
	public String toString() {
		try {
			String cadena = "";
			cadena = "NOMBRE DEL EVENTO: " + nombre + "\n";
			cadena += "FECHA EVENTO: " + fecha + " | LOCALIDAD: " + localidad + "\n";
			cadena += entrada.length > 1 ? "ENTRADAS:" : "ENTRADA:" + "\n";
			for (Entrada ent:entrada) {
				cadena += ent.toString() + "\n";					
			}
			return cadena;
		}
		catch (Exception e) {
			return "Error al generar ToString";
		}
	}
}
