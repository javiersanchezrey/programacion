import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EntradaUsuario {

	public static void main(String[] args) throws IOException {
		  BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		  
		 //Texto
		  
		  System.out.println("Quiero que escribas tu Nombre AQUÍ ");
		  
		  	String textoUsuario = leer.readLine();
		  	
		  System.out.println(textoUsuario);
		  
		  //Numero
		  
		  System.out.println("Escribe un numero real: ");
		int NumeroReal = Integer.parseInt(leer.readLine());
		
			System.out.println(NumeroReal);
			
			//Numero Decimales
			  
			System.out.println("Escribe un numero Decimal: ");
			double numeroDecimal = Double.parseDouble(leer.readLine());
			
				System.out.println(numeroDecimal);
				
		
	}

}
