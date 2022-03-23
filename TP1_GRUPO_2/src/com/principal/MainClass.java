package com.principal;

import com.Negocio.Deporte;
import com.Negocio.Futbol;
import com.Negocio.Hockey;
import com.Negocio.Rugby;

public class MainClass {
	//comentario de prueba de gihub
	public static void main(String[] args) {
		System.out.println("TP1_GRUPO_2");
		System.out.println("prueba juani");

		Deporte[] eventosDeportivos = new Deporte[4];
		
		eventosDeportivos[0] = new Futbol("Argentina vs Italia", 3, true);
		eventosDeportivos[1] = new Futbol("Boca vs River", 3, false);
		eventosDeportivos[2] = new Hockey("Argentina vs Holanda", 3, true);
		eventosDeportivos[3] = new Rugby("Argentina vs Gales", 3, true);

	}
}
