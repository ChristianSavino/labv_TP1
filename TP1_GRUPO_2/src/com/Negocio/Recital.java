package com.Negocio;
import com.Entidades.*;

public class Recital extends Evento {
	
	public static float precioVip = 1500f;
	public static float precioNormal = 800f;
	
	private Genero genero;

	public Recital(String nombreEvento, String fechaEvento, String localidadEvento, String generoEvento) {
		Constructor(nombreEvento,fechaEvento,localidadEvento);
		
		entrada = new Entrada[2];
		entrada[0] = new Entrada("VIP",precioVip);
		entrada[1] = new Entrada("NORMAL",precioNormal);
		
		genero = new Genero();
		genero.setNombre(generoEvento);
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
			cadena += "GENERO: " + genero.toString()+ "\n";
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

