package com.principal;
import com.Entidades.*;
import com.Negocio.*;

public class MainClass {
	
	public static final String os = System.getProperty("os.name");
	private static Evento eventos[];
	
	public static void main(String[] args){
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		eventos = generarEventos();
		menuPrincipal.setEntradas(generarEntradas());
		menuPrincipal.CargarMenu();
	}


	private static Evento[] generarEventos() {
		try {
			Evento eventos[] = new Evento[2];
			
			Evento evento = new Deporte("Boca Vs. River","17/07/2022 11:30",90,false,TipoDeporte.tiposDeporte.FUTBOL);
			eventos[0] = evento;
			
			evento = new Deporte("Argentina Vs. Brazil","21/11/2022 22:15",90,true,TipoDeporte.tiposDeporte.FUTBOL);
			eventos[1] = evento;
			
			return eventos;
			
		}
		catch (Exception e) {
			return null;
		}
	}
	
	private static Entrada[] generarEntradas()
	{
		try {
			int i = 1;
			Entrada entradas[] = new Entrada[2];
			Entrada entrada = eventos[0].getEntrada()[0];
			entrada.setEvento(eventos[0]);
			entrada.setNumero(i);
			entradas[0] = entrada;
			i++;
			
			entrada = eventos[1].getEntrada()[0];
			entrada.setEvento(eventos[1]);
			entrada.setNumero(i);
			entradas[1] = entrada;
			i++;
			
			
			return entradas;
			
		}
		catch (Exception e) {
			return null;
		}
	}

}