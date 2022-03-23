package com.Negocio;

import com.Entidades.Entrada;

public final class Futbol extends Deporte {
	
	public final static float PRECIO = 300f;
	
	public Futbol(String nombreEvento, int cantidad, boolean internacional) {
		
		//inicializo la Deporte
		super(internacional);
		
		///inicializo Evento
		this.setNombre(nombreEvento);
		this.setEntrada(new Entrada[cantidad <= 0 ? 1 : cantidad]);
		
		//si es internacional se agrega el recargo del 30 porciento
		float precio = this.esInternacional() ? Futbol.PRECIO * 1.3f : Futbol.PRECIO;
		
		//entrada esta en la clase Evento
		for(int i = 0; i < entrada.length; i++) {
			entrada[i] = new Entrada(this.getNombre(), precio);
		}
	}
}
