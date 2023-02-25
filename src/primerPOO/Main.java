package primerPOO;

public class Main {

	//@SuppressWarnings("static-access") -> para suprimir los mensajes de tipo 'Warnings'
	
	public static void main(String[] args) {
		
		// Instanciar la clase: declarar 'miAnimal', 'miMascota'... como un objeto de la clase 'Animales'
		Animales miAnimal = new Animales();
		miAnimal.nombre = "Misifú";
		miAnimal.edad = 14;
		
		// Accedemos a 'iD' desde la propia clase 'Animales' al ser un atributo estático
		miAnimal.mostrarCaracteristicas(miAnimal.nombre, miAnimal.edad, Animales.iD);  
		Animales miMascota = new Animales();
		miMascota.nombre ="Guffi";
		miMascota.edad = 15;
		miMascota.mostrarCaracteristicas(miMascota.nombre, miMascota.edad, Animales.iD);
		//mostrarMenu();
		// Llamar al método constructor de solo el nombre
		Animales miMascota2 = new Animales("Candela");
		miMascota2.edad = 16;
		miMascota2.mostrarCaracteristicas(miMascota2.nombre, miMascota2.edad, Animales.iD);
		
		Animales miMascota3 = new Animales("Candela2", 15);
		System.out.println("El ID de " + miMascota3.nombre + " es " + Animales.iD);
	}

}
