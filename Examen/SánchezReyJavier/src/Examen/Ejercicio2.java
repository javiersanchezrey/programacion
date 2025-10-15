package Examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca usuario.");
	String usuario = br.readLine();
	
		System.out.println("Introduzca contraseña.");
	String contraseña = br.readLine();
	
	String CONCURSANTE1 = "Ivan Rojo";
	String CONCURSANTE2 = "Claudia";
	
	
	int votosIvan;
	int votosClaudia;
	
		if (usuario.equals("usuario1") && contraseña.equals("contraseña12345")) {
			System.out.println("Usuario y contraseña correctos");
			
		System.out.println("Introduce los votos de "+ CONCURSANTE1);
			int votosConcursante1 = Integer.parseInt(br.readLine());
			
		System.out.println("Introduce los votos de " + CONCURSANTE2);
			int votosConcursante2 = Integer.parseInt(br.readLine());
			
			votosIvan = (votosConcursante1 * 100) / (votosConcursante1 + votosConcursante2);
			votosClaudia = (votosConcursante2 * 100) / (votosConcursante1 + votosConcursante2);
			
		System.out.println("La puntuación de Iván es de: " + votosConcursante1);
		System.out.println("La puntuación de Claudia es de: " + votosConcursante2);
		
		} else {
			System.out.println("Datos de acceso incorrectos.");
		}
	
	
	
	
	}

}
