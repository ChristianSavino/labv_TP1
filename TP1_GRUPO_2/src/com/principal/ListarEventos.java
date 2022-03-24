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
			while(menu != "S")
			{
				if (scanner.hasNext())
					if(scanner.hasNext()) {
						menu = scanner.nextLine();
						if(menu == "S")
							scanner.close();
					}
					else {
						scanner.nextLine();
						Menu.Alertar("INGRESE SOLAMENTE 'S'");
						System.out.println("DESEAR VOLVER AL MENU PRINCIPAL? (S para SI)");					
					}
			}
			
			MainClass.menuPrincipal.CargarMenu();
						
		} 
		catch (Exception e) {
			CargarMenu();
		}
	}
}
