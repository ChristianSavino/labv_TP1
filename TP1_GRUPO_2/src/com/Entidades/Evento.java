package com.Entidades;

public abstract class Evento {
	protected String nombre;
	protected Entrada[] entrada;
	protected String fecha;
	protected String localidad;
		
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
	
	protected abstract void Constructor(String nombreEvento,String fechaEvento, String localidadEvento);
}