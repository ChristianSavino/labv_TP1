package com.principal;
import java.util.ArrayList;
import java.util.List;
import com.Entidades.*;
import com.Negocio.*;

public class MainClass {
	
	private static Evento eventos[];
	
	public static void main(String[] args){
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		eventos = generarEventos();
		menuPrincipal.setEntradas(generarEntradas());
		menuPrincipal.CargarMenu();
	}


	private static Evento[] generarEventos() {
		try {
			Evento eventos[] = new Evento[15];
			
			Evento evento = new Deporte("Boca Vs. River","17/07/2022 11:30",90,false,TipoDeporte.tiposDeporte.FUTBOL);
			eventos[0] = evento;
			
			evento = new Deporte("Argentina Vs. Brazil","21/11/2022 22:15",90,true,TipoDeporte.tiposDeporte.FUTBOL);
			eventos[1] = evento;
			
			evento = new Deporte("Las Leonas vs Chile","30/09/2022 12:45",60,true,TipoDeporte.tiposDeporte.HOCKEY);
			eventos[2] = evento;
			
			evento = new Deporte("Los Pumas vs All Blacks","24/12/2022 9:30",80,false,TipoDeporte.tiposDeporte.RUGBY);
			eventos[3] = evento;
			
			evento = new Recital("Guns & Roses","30/09/2022",120,TipoMusica.tipoMusica.ROCK,"Guns & Roses","Foo Fighters","Artic Monkeys");
			eventos[4] = evento;
			
			evento = new Recital("Luis Miguel: Ahora te puedes Marchar","13/05/2022",90,TipoMusica.tipoMusica.LATINOS,"Luis Miguel","Maná","Ricardo Arjona");
			eventos[5] = evento;
			
			evento = new Recital("Michael Jackson, Thriller pero real","07/06/2022",180,TipoMusica.tipoMusica.POP,"Michael Jackson","Britney Spears","Cristina Aguilera");
			eventos[6] = evento;
			
			evento = new Recital("Daddy Yankee x La Factoria returns","08/08/2022",240,TipoMusica.tipoMusica.REGGAETON,"Daddy Yankee","La Factoria","");
			eventos[7] = evento;
			
			evento = new Recital("Metallica Argentina 2022","30/04/2022",180,TipoMusica.tipoMusica.HEAVY_METAL,"Metallica","Megadeth","Judas Priest");
			eventos[8] = evento;
			
			evento = new Recital("Traperos United","02/04/2022",240,TipoMusica.tipoMusica.TRAP,"Trapero Traperin","","");
			eventos[9] = evento;			
			
			evento = new Infantil("Piñon Fijo Returns","15/07/2022 18:00",60,false);
			eventos[10] = evento;
			
			evento = new Infantil("Carlitos Bala MegaGira","25/07/2022 16:15",60,true);
			eventos[11] = evento;
			
			evento = new Teatro("La bala que dobló la Esquina","25/07/2022 16:15",60,TipoTeatro.tiposTeatro.COMEDIA,"La bala","","");
			eventos[12] = evento;
			
			evento = new Teatro("El Tango de la muerte","03/05/2022",85,TipoTeatro.tiposTeatro.DRAMA,"Ricardo Darin como Luciano","Rodrigo de la Serna como Julio","Luisiana Lopilato como 'Martita'");
			eventos[13] = evento;
			
			evento = new Teatro("Fantasma de la Opera","15/05/2022",45,TipoTeatro.tiposTeatro.TEATRO,"Gerard Butler","Emmy Rossum","");
			eventos[14] = evento;
			
			return eventos;
		}
		catch (Exception e) {
			return null;
		}
	}
	
	private static List<Entrada> generarEntradas()
	{
		try {
			int i = 0;
			int j = 0;
			int numeroEntrada = 0;
			List<Entrada> entradas = new ArrayList<Entrada>();
			for (i = 0;i<eventos.length;i++)
			{				
				for(j = 0;j < eventos[i].getEntrada().length;j++)
				{
					numeroEntrada++;
					Entrada entrada = eventos[i].getEntrada()[j];
					entrada.setEvento(eventos[i]);
					entrada.setNumero(numeroEntrada);
					entradas.add(entrada);
				}							
			}
			
			return entradas;
			
		}
		catch (Exception e) {
			return null;
		}
	}

}