package com.Entidades;

public class TipoDeporte {
	
	public static final float valorEntradaFutbol = 300;
	public static final float valorEntradaRugby = 450;
	public static final float valorEntradaHockey = 380;
	
	public enum tiposDeporte {
		RUGBY,
		FUTBOL,
		HOCKEY
	}
	
	tiposDeporte tipo;

	public tiposDeporte getTipo() {
		return tipo;
	}

	public void setTipo(tiposDeporte tipo) {
		this.tipo = tipo;
	}
	
	public float getValorEntrada()
	{
		switch (tipo) {
		case RUGBY:
			return valorEntradaRugby;
		case FUTBOL:
			return valorEntradaFutbol;
		case HOCKEY:
			return valorEntradaHockey;
		}	
		return 0f;
	}
}
