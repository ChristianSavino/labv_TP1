package com.Negocio;
import com.Entidades.*;

public class Recital extends Evento {
	
	public static float precioVip = 1500f;
	public static float precioNormal = 800f;
	
	private Genero genero;

	public Recital() {
		nombre = "Silvio Soldan se pone a cantar";
		entrada = new Entrada[2];
		entrada[0] = new Entrada("VIP",precioVip);
		entrada[1] = new Entrada("NORMAL",precioNormal);
		genero = new Genero();
		genero.setNombre("Pop");
	}

}

