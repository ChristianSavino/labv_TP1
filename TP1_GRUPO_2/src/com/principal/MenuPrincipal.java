package com.principal;
import java.util.Scanner;
import com.interfaces.*;
import javax.swing.JOptionPane;


public class MenuPrincipal implements Menu {
	
	public void CargarMenu(){
		Menu.MostrarLeyenda();
		
		System.out.println("LISTA DE EVENTOS");
		System.out.println("------------------------------------");

		Accion();
	}
	
	public void Accion() {
		try {
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
			System.exit(0);
		}
		catch(Exception e) {						
			Menu.Alertar(e.getMessage());
		}		
	}
}
