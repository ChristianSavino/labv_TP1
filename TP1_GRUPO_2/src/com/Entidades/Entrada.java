package com.Entidades;

public class Entrada {
	protected Float precio;
	protected String nombre;
	
	public Entrada(String n,Float p)
	{
		nombre = n;
		precio = p;
	}
	
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}

