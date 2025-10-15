package Examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca el nombre completo del concursante.");
	String nombre = br.readLine();
	
		System.out.println("Introduzca la primera letra del apellido del concursante.");
	char letraApellido = br.readLine().toUpperCase().charAt(0);
	
		System.out.println("Introduce Nota Profesor 1: ");
	double nota1 = Double.parseDouble(br.readLine());
	
		System.out.println("Introduce Nota Profesor 2: ");
	double nota2 = Double.parseDouble(br.readLine());
	
	double nota3 = (Math.random() * 10) + 1;
		System.out.println("Nota aleatoria: " + nota3);

		double notaMedia = (nota1 + nota2 + nota3) / 3.0;
		
		System.out.println("La nota Media es: " + nombre + " " + letraApellido +" " + notaMedia);
		
	}

}
