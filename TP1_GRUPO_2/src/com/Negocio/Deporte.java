package com.Negocio;
import com.Entidades.*;
import com.Tipos.TipoDeporte;

public class Deporte extends Evento {
	
	public static final float valorEntradaFutbol = 300;
	public static final float valorEntradaRugby = 450;
	public static final float valorEntradaHockey = 380;
	
	private boolean esInternacional;
	private TipoDeporte tipoDeporte;

	public Deporte(String nombreEvento, String fechaEvento, Integer duracionEvento ,boolean internacional,TipoDeporte tipo) {
		Constructor(nombreEvento,fechaEvento,duracionEvento);
		
		esInternacional = internacional;
		
		tipoDeporte = tipo;
		float precioEntrada = this.getValorEntrada();
				
		entrada = new Entrada[1];
		entrada[0] = new Entrada("General", internacional ? precioEntrada * 1.3f : precioEntrada);
		
	}
	
	public void setInternacional(boolean internacional) {
		esInternacional = internacional;
	}
	
	public boolean esInternacional() {
		return esInternacional;
	}

	@Override
	protected void Constructor(String nombreEvento, String fechaEvento, Integer duracionEvento) {
		nombre = nombreEvento;
		fecha = fechaEvento;
		duracion = duracionEvento;
	}
	
	@Override
	public String toString() {
		try {
			String cadena = "";
			cadena = "NOMBRE DEL EVENTO: " + nombre + "\n";
			cadena += "FECHA EVENTO: " + fecha + " | DURACION: " + duracion + " Minutos \n";
			cadena += "TIPO: DEPORTE(" + tipoDeporte.name() + ") | INTERNACIONAL?: " + (esInternacional ? "INTERNACIONAL" : "NACIONAL") + "\n";
			return cadena;
		}
		catch (Exception e) {
			return "Error al generar ToString";
		}
	}
	//Esto es lo unico raro que vas a ver hoy
	private float getValorEntrada() {
		float ret = 0.0f;
		switch(this.tipoDeporte.name()) {
			case "RUGBY": ret = valorEntradaFutbol; break;
			case "FUTBOL": ret = valorEntradaRugby; break;
			case "HOCKEY": ret = valorEntradaHockey; break;
		}
		
		return ret;
	}
	
	
}
