package com.principal;

public class MainClass {
	
	public static final String os = System.getProperty("os.name");
	
	public static void main(String[] args){	
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.CargarMenu();
	}
}

