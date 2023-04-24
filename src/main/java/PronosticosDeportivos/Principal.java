package PronosticosDeportivos;

import java.util.ArrayList;

import configuracion.Configuracion;
import excepciones.ExcepcionIntegridadDeDatos;
import puntuacion.Puntuacion;

public class Principal {

	public static void main(String[] args) throws ExcepcionIntegridadDeDatos {
		
		String archivo = "Partidos.csv";
		String archivoConfig = "Configuracion.csv";
		ArrayList<Partido> listaDePartidos;
		
		try {		
		Configuracion.leerConfiguracion(archivoConfig);
		listaDePartidos = Partido.ArmarListaPartidos(archivo);
		Participante.ArmarListaDeParticipantes(listaDePartidos);
		Puntuacion.imprimirPuntajes();
				      	
	    	
		}catch (ExcepcionIntegridadDeDatos e) {
			
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("ATENCION: Los goles deben ser numeros enteros y la cantidad de campos 11");
			System.out.println("Corrija los errores y vuelva a intentar");
			System.out.println("----------------------------------------------------------------------------------");
		}
	    }
	}


