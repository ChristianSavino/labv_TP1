package com.principal;
import java.util.Scanner;
import com.interfaces.*;
import javax.swing.JOptionPane;


public class MenuPrincipal implements Menu {
	
	public void CargarMenu(){
		Menu.MostrarLeyenda();
		System.out.println("MENU PRINCIPAL");
		System.out.println("------------------------------------");
		System.out.println("1 - AGREGAR EVENTO" + "\n" + "2 - LISTAR EVENTOS" + "\n" + "3 - ELIMINAR EVENTOS" + "\n" + "4 - SALIR");
		System.out.println("------------------------------------");
		Accion();
	}
	public void Accion() {
		Scanner scanner = new Scanner (System.in);		
		int numero = 0;
		
		try {
			System.out.println("INGRESE OPCION:");
			while (numero == 0) {
				if (scanner.hasNext())
					if(scanner.hasNextInt()) {
						numero = scanner.nextInt();
						scanner.close();
					}
					else {
						scanner.nextLine();
						Menu.Alertar("INGRESE SOLAMENTE NUMEROS");
						System.out.println("INGRESE OPCION:");					
					}
			}	
			scanner = null;
			switch (numero) {
			case 1:
				MainClass.listarEventos.CargarMenu();
				break;
			case 2:
				System.out.println("Test " + numero);
				CargarMenu();
				break;
			case 3:
				System.out.println("Test " + numero);
				CargarMenu();
				break;
			case 4:
				System.exit(-1);
				break;
			}			
		}
		catch(Exception e) {						
			CargarMenu();
		}		
	}
}
