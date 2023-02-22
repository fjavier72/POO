package iu;

import java.util.Scanner;

public class MiMenu {
	
	// Método
	public static void mostrarMenu() {
		int opcion;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Menú +Cotas");
			System.out.println("1. Alta");
			System.out.println("2. Baja");
			System.out.println("3. Salir");
			System.out.print("Tu opción: ");
			opcion = input.nextInt();
			switch (opcion) {
			case 1: System.out.println("Es un alta");
				break;
				
			case 2: System.out.println("Es una baja");
				break;
				
			case 3: System.out.println("Hasta luego Lucas...");
				break;
				
			default: System.out.println("Opción erronea");
				break;
			}
			
			
		} while (opcion != 3);
		
		input.close();
	
	}
	
}
