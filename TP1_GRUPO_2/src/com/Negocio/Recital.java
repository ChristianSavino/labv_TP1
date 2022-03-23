package com.Negocio;
import com.Entidades.*;

public class Recital extends Evento {
	
	private Genero genero;

	public Recital() {
		nombre = "Silvio Soldan se pone a cantar";
		entrada = new Entrada[2];
		entrada[0] = new Entrada("VIP",1500f);
		entrada[1] = new Entrada("NORMAL",800f);
		genero = new Genero();
		genero.setNombre("Pop");
	}

}

