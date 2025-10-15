package EjerciciosSwitch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio21 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Introduce un numero del 1 al 12 para saber la estación del mes.");
	
		int mes = Integer.parseInt(br.readLine());
		
		switch (mes) {
			case 12 , 1 , 2:
				System.out.println("Estos meses son de Invierno.");
			break;
			
			case 3 , 4 , 5:
				System.out.println("Estos meses son de Primavera.");
			break;
			
			case 6 , 7 , 8:
				System.out.println("Estos meses son de Verano.");
			break;
			
			case 9 , 10 , 11:
				System.out.println("Estos meses son de Otoño.");
			break;
		}
		
	}

}
