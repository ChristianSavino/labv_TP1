package com.Entidades;

public class Evento {
	protected String nombre;
	protected Entrada[] entrada;
		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Entrada[] getEntrada() {
		return entrada;
	}
	public void setEntrada(Entrada[] entrada) {
		this.entrada = entrada;
	}
}