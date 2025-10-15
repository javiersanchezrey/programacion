package EjerciciosSwitch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio20 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println( "Introduce un día de la semana." );
	
	int diaSemana = Integer.parseInt(br.readLine());
		
	
	
		switch (diaSemana) {
			case 1:
				System.out.println("Es Lunes.");
			break;
			
			case 2:
				System.out.println("Es Martes.");
			break;
			
			case 3:
				System.out.println("Es Miercoles.");
			break;
			
			case 4:
				System.out.println("Es Jueves.");
			break;
			
			case 5:
				System.out.println("Es Viernes.");
			break;
			
			case 6:
				System.out.println("Es Sábado.");
			break;
			
			case 7:
				System.out.println("Es Domingo.");
			break;
			
			default:
				System.out.println("Numero Incorrecto.");
		}

	}

}
