package com.Entidades;

public class TipoTeatro {
	public static final float valorEntradaTeatro = 1350.5f;
	
	public enum tiposTeatro {
		DRAMA,
		TEATRO,
		COMEDIA
	}
	
	tiposTeatro tipo;

	public tiposTeatro getTipo() {
		return tipo;
	}

	public void setTipo(tiposTeatro tipo) {
		this.tipo = tipo;
	}
	
	public float getValorEntrada()
	{
		return valorEntradaTeatro;
	}

	@Override
	public String toString() {
		return tipo.toString();
	}
	
}
