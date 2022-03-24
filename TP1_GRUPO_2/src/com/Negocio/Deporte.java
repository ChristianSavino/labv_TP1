package com.Negocio;
import com.Entidades.*;

public class Deporte extends Evento {
	
	private boolean esInternacional;
	private TipoDeporte tipoDeporte;

	public Deporte(String nombreEvento, String fechaEvento, String localidadEvento ,boolean internacional,TipoDeporte.tiposDeporte tipo) {
		Constructor(nombreEvento,fechaEvento,localidadEvento);
		
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
	protected void Constructor(String nombreEvento, String fechaEvento, String localidadEvento) {
		nombre = nombreEvento;
		fecha = fechaEvento;
		localidad = localidadEvento;
	}
	
	@Override
	public String toString() {
		try {
			String cadena = "";
			cadena = "NOMBRE DEL EVENTO: " + nombre + "\n";
			cadena += "FECHA EVENTO: " + fecha + " | LOCALIDAD: " + localidad + "\n";
			cadena += "TIPO: " + tipoDeporte.toString() + " | INTERNACIONAL?: " + (esInternacional ? "SI" : "NO") + "\n";
			cadena += entrada.length > 1 ? "ENTRADAS:" : "ENTRADA:" + "\n";
			for (Entrada ent:entrada) {
				cadena += ent.toString() + "\n";					
			}
			return cadena;
		}
		catch (Exception e) {
			return "Error al generar ToString";
		}
	}
	
	
}
