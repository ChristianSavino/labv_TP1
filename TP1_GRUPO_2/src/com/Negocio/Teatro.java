package com.Negocio;
import com.Entidades.*;

public class Teatro  extends Evento {
	
	private Genero genero;
	
	public Teatro() {
		nombre = "Silvio Soldan se pone a cantar";
		entrada = new Entrada[1];
		entrada[0] = new Entrada("ENTRADA_TEATRO",1350f);
		genero = new Genero();
		genero.setNombre("Drama");
	}
	
	@Override
	protected void Constructor(String nombreEvento, String fechaEvento, String localidadEvento) {
		nombre = nombreEvento;
		fecha = fechaEvento;
		localidad = localidadEvento;
	}
}
