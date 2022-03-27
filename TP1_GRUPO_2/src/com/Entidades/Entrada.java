package com.Entidades;

public class Entrada {
	protected Float precio;
	protected String nombre;
	protected Evento evento;
	protected Integer numero;
	
	public Entrada(String n,Float p) {
		nombre = n;
		precio = p;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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
	
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena = "ENTRADA NRO. " + numero + " - " +(nombre.length() > 1 ? nombre:"") + "\nPRECIO: $" + precio + "\n" ;
		cadena += evento.toString();
		return cadena;
	}	
}

