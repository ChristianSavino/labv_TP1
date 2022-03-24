package com.principal;
import java.util.Scanner;
import com.interfaces.Menu;

public class ListarEventos  implements Menu  {
	public void CargarMenu(){
		Menu.MostrarLeyenda();
		System.out.println("LISTAR EVENTOS");
		System.out.println("------------------------------------");
		Accion();
	}
	
	public void Accion() {
		try {
			System.out.println("------------------------------------");
			System.out.println("DESEAR VOLVER AL MENU PRINCIPAL? (S para SI)");
			
			String menu = "";
			Scanner scanner = new Scanner(System.in);
			while(menu.compareTo("S") != 0)
			{
					if(scanner.hasNextLine()) {
						menu = scanner.nextLine();
						if(menu.compareTo("S") == 0)
							scanner = null;
						else {
							scanner.nextLine();
							Menu.Alertar("INGRESE SOLAMENTE 'S'");
							System.out.println("DESEAR VOLVER AL MENU PRINCIPAL? (S para SI)");					
						}
					}
			}
			scanner = null;
			MainClass.menuPrincipal.CargarMenu();
						
		} 
		catch (Exception e) {
			CargarMenu();
		}
	}
}
