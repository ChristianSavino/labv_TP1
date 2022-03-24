package com.principal;

public class MainClass {
	
	public static final String os = System.getProperty("os.name");
	public static MenuPrincipal menuPrincipal;
	public static ListarEventos listarEventos;
	
	public static void main(String[] args){	
		IniciarClases();
		menuPrincipal.CargarMenu();
			while (true) {
		}
	}
	
	static void IniciarClases() {
		menuPrincipal = new MenuPrincipal();
		listarEventos = new ListarEventos();
	}
}

