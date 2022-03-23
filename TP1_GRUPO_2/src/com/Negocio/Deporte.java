package com.Negocio;
import com.Entidades.*;

public class Deporte extends Evento {
	
	private boolean esInternacional;

	public Deporte() {
		esInternacional = false;
	}
	
	public Deporte(boolean internacional) {
		esInternacional = internacional;
	}
	
	public void setInternacional(boolean internacional) {
		esInternacional = internacional;
	}
	
	public boolean esInternacional() {
		return esInternacional;
	}
}
