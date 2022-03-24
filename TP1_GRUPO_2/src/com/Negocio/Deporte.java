package com.Negocio;
import com.Entidades.*;

public class Deporte extends Evento {
	
	private boolean esInternacional;
	private TipoDeporte tipoDeporte;

	public Deporte(String nombreEvento,boolean internacional,TipoDeporte.tiposDeporte tipo) {
		esInternacional = internacional;
		
		tipoDeporte = new TipoDeporte();
		tipoDeporte.setTipo(tipo);
		float precioEntrada = tipoDeporte.getValorEntrada();
		
		nombre = nombreEvento;
		
		entrada = new Entrada[1];
		entrada[0] = new Entrada("General", internacional ? precioEntrada * 1.3f : precioEntrada);
		
	}
	
	public void setInternacional(boolean internacional) {
		esInternacional = internacional;
	}
	
	public boolean esInternacional() {
		return esInternacional;
	}
}
