package com.principal;
import java.util.List;
import java.util.Scanner;
import com.Entidades.*;
import com.interfaces.*;


public class MenuPrincipal implements Menu {
	
	private List<Entrada> entradas;
	
	public List<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(List<Entrada> entradas) {
		this.entradas = entradas;
	}

	public void CargarMenu(){
		Menu.MostrarLeyenda();
		
		System.out.println("LISTA DE EVENTOS");
		System.out.println("------------------------------------");

		Accion();
	}
	 
	void ImprimirEntradas() {
		for (Entrada entrada: entradas) System.out.println(entrada.toString() + " \n---------\n");
	}
	
	public void Accion() {
		try {
			
			ImprimirEntradas();
			
			System.out.println("------------------------------------");
			
			Scanner scanner = new Scanner (System.in);		
			String salir = "";
		
			System.out.println("DESEA SALIR DEL SISTEMA? (escribe S para salir):");
			salir = scanner.nextLine().toUpperCase();
			while(salir.compareTo("S") != 0)
			{
					if(scanner.hasNextLine())
						salir = scanner.nextLine().toUpperCase();					
			}
			scanner.close();
			scanner = null;
			System.out.println("HA SALIDO DEL SISTEMA");
			System.exit(0);
		}
		catch(Exception e) {						
			Menu.Alertar(e.getMessage());
		}		
	}
}
