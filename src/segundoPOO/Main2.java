package segundoPOO;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		// Creamos el objeto de la clase 'Scanner'
		Scanner teclado = new Scanner(System.in);
		
		// Instanciamos la clase 'Persona'
		Persona p = new Persona();
		
		// Inicializamos los atributos del objeto
		p.edad = 18;
		p.nombre = "Carmen Alicia";
		p.estatura = 1.56;
		
		// Utilizamos los métodos del objeto
		p.cumplirAnios();
		p.saludar();
		System.out.println("Cuando cumplas años tendrás " + p.edad);
		System.out.println("¿Cuánto has crecido? ");
		double incremento = teclado.nextDouble();
		p.crecer(incremento);
		System.out.printf("Tu estatura ahora es: %.2f", p.estatura);
		
		Persona a = new Persona("Pepe", 15, 1.90);
		System.out.println(a.nombre + " " + a.edad + " " + a.estatura);
		
		
		
		// Cerramos el objeto 'scanner'
		teclado.close();
	}

}
