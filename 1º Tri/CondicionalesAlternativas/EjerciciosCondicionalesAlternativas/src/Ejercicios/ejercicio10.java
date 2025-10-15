package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("¿Podrías indicar la hora exacta en la que estás ahora mismo? Hora, Minuto y Segundo.");
	
	int hora = Integer.parseInt(br.readLine());
	int minuto = Integer.parseInt(br.readLine());
	int segundo = Integer.parseInt(br.readLine());
	
	String horaExacta = hora + ":" + minuto + ":" + segundo;
	
		 
			
		if (hora < 0 || hora > 23) {
			System.out.println("La hora es incorrecta, porque las horas no son correctas");
			
		} else if (minuto < 0 || minuto > 59){
			System.out.println("La hora es incorrecta, porque los minutos no son correctos");
			
		} else if (segundo < 0 || segundo > 59){
			System.out.println("La hora es incorrecta, porque los segundos no son correctos");
			
		} else if ((hora >= 0 && hora <=23) && (minuto >= 0 && minuto <= 59) && (segundo >= 0 && segundo <= 59)) {
			System.out.println("La hora es válida: " + horaExacta);
		}
	
	}

}
