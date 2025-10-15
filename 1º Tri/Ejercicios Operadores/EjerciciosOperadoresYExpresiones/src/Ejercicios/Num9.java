package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("¿Podrías decirme tu edad?");

		int edadPersona = Integer.parseInt(br.readLine());

		boolean edad = edadPersona >= 18;

		boolean menor65 = edadPersona <= 65;

		boolean Media = 18 > edadPersona && edadPersona < 65;

		boolean edad18 = edadPersona == 18;

		boolean noJubilado = edadPersona < 65;

		System.out.println(edad);
		System.out.println(menor65);
		System.out.println(Media);
		System.out.println(edad18);
		System.out.println(noJubilado);
					
			
			
			
			
			
			
		
		

	}

}
