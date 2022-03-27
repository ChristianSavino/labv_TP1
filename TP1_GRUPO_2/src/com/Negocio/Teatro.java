package com.Negocio;
import java.util.ArrayList;
import java.util.List;

import com.Entidades.*;

public class Teatro  extends Evento {

	private TipoTeatro tipoTeatro;
	private List<Actor> actores;

	public Teatro(String nombreEvento, String fechaEvento, Integer duracionEvento, TipoTeatro.tiposTeatro tipo,String nombreActor1, String nombreActor2,String nombreActor3) {
		Constructor(nombreEvento,fechaEvento,duracionEvento);
		
		tipoTeatro = new TipoTeatro();
		tipoTeatro.setTipo(tipo);
		float precioEntrada = tipoTeatro.getValorEntrada();
				
		entrada = new Entrada[1];
		entrada[0] = new Entrada("General", precioEntrada);
		
		actores = new ArrayList<Actor>();
		
		Actor actor = new Actor();
		actor.setNombre(nombreActor1);
		actores.add(actor);
		
		if (nombreActor2.length() > 1)
		{
			actor = new Actor();
			actor.setNombre(nombreActor2);
			actores.add(actor);
		}
		
		if(nombreActor3.length() > 1)
		{
			actor = new Actor();
			actor.setNombre(nombreActor3);
			actores.add(actor);
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
			cadena += "TIPO: TEATRO(" + tipoTeatro.toString()+ ") \n";
			cadena += "CASTING: \n";
			for (Actor actor: actores) cadena += "- " + actor.toString() + " \n";
			return cadena;
		}
		catch (Exception e) {
			return "Error al generar ToString";
		}
	}
}
