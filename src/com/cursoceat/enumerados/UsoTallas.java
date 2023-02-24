package com.cursoceat.enumerados;

import java.util.Scanner;

public class UsoTallas {

	enum Talla {
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		private String abreviatura;
		
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}

		public String getAbreviatura() {
			return abreviatura;
		}
		
	}
	
	
	public static void main(String[] args) {

		// Declaración del objeto de la clase 'Scanner'
		Scanner input = new Scanner(System.in);
		
		// input...
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		String entradaDatos = input.next().toUpperCase();
		Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);
		
		// output...
		System.out.println("Talla: " + laTalla);
		System.out.println("Abreviatura: " + laTalla.getAbreviatura());
		
		input.close();
	}

}
