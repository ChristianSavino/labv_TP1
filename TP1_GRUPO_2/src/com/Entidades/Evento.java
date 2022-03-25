package com.Entidades;

public abstract class Evento {
	protected String nombre;
	protected Entrada[] entrada;
	protected String fecha;
	protected Integer duracion;
		
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
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
	
	protected abstract void Constructor(String nombreEvento,String fechaEvento, Integer duracionEvento);
	
	public abstract String toString();
}