package com.interfaces;
import java.time.format.DateTimeFormatter;
import com.principal.MainClass;
import java.time.LocalDateTime;
public interface Menu {

	
	
	public static void MostrarLeyenda() {
		LimpiarConsola();
		System.out.println("TP1_GRUPO_2 - GESTION DE EVENTOS");
		
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now) + "\n");  
	};
	public void CargarMenu();
	public void Accion();
	
	public static void Alertar(String mensaje) {
		System.out.println(mensaje);
	}
	
	static void LimpiarConsola()
	{
		try {	    	        
	        if (MainClass.os.contains("Windows"))
	        	 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	        	Runtime.getRuntime().exec("clear");
	    }
	    catch (final Exception e) {	       
	    }
	}
}
