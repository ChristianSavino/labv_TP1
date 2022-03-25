package com.Entidades;

public class TipoMusica {
	
	public enum tipoMusica{
		ROCK,
		HEAVY_METAL,
		REGGAETON,
		TRAP,
		LATINOS,
		POP
	}
	
	tipoMusica tipo;
	
	public tipoMusica getTipo() {
		return tipo;
	}

	public void setTipo(tipoMusica tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return tipo.toString();
	}
	
}
