package com.Entidades;

public class Banda {
	private String nombre;
	private boolean esPrincipal;

	public Banda(String n,boolean p)
	{
		nombre = n;
		esPrincipal = p;
	}

	@Override
	public String toString() {
		return nombre + (esPrincipal ? " (PRINCIPAL)" : " (SOPORTE)");
	}
	
	
}
