package com.Negocio;
import com.Entidades.*;

public class Deporte extends Evento {
	
	private boolean esInternacional;
	private TipoDeporte tipoDeporte;

	public Deporte(String nombreEvento, String fechaEvento, Integer duracionEvento ,boolean internacional,TipoDeporte.tiposDeporte tipo) {
		Constructor(nombreEvento,fechaEvento,duracionEvento);
		
		esInternacional = internacional;
		
		tipoDeporte = new TipoDeporte();
		tipoDeporte.setTipo(tipo);
		float precioEntrada = tipoDeporte.getValorEntrada();
				
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
			cadena += "TIPO: DEPORTE(" + tipoDeporte.toString() + ") | INTERNACIONAL?: " + (esInternacional ? "INTERNACIONAL" : "NACIONAL") + "\n";
			return cadena;
		}
		catch (Exception e) {
			return "Error al generar ToString";
		}
	}
	
	
}
