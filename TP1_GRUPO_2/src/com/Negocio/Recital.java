package com.Negocio;
import java.util.ArrayList;
import java.util.List;

import com.Entidades.*;
import com.Tipos.TipoMusica;

public class Recital extends Evento {
	
	public static float precioVip = 1500f;
	public static float precioNormal = 800f;
	
	private TipoMusica genero;
	List<Banda> bandas;

	public Recital(String nombreEvento, String fechaEvento, Integer duracionEvento,  TipoMusica tipo,String nombreBandaPrincipal, String nombreBandaSoporte1, String nombreBandaSoporte2) {
		Constructor(nombreEvento,fechaEvento,duracionEvento);
		
		entrada = new Entrada[2];
		entrada[0] = new Entrada("VIP",precioVip);
		entrada[1] = new Entrada("NORMAL",precioNormal);
		
		genero = tipo;
		
		bandas = new ArrayList<Banda>();
		Banda banda = new Banda(nombreBandaPrincipal, true);
		bandas.add(banda);
		if (nombreBandaSoporte1.length() > 1)
		{
			banda = new Banda(nombreBandaSoporte1, false);
			bandas.add(banda);
		}
		if (nombreBandaSoporte2.length() > 1)
		{
			banda = new Banda(nombreBandaSoporte2, false);
			bandas.add(banda);
		}

		
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
			cadena += "TIPO: RECITAL(" + genero.name()+ ") \n";
			cadena += (bandas.size() > 1 ? "BANDAS: " : "BANDA:") + " \n";
			for (Banda banda: bandas) cadena += "- " + banda.toString() + " \n";
			return cadena;
		}
		catch (Exception e) {
			return "Error al generar ToString";
		}
	}

}

