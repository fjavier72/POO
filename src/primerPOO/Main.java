package primerPOO;

public class Main {

	public static void main(String[] args) {
		
		// Instanciar la clase: declarar 'miAnimal' como un objeto de la clase 'Animales'
		Animales miAnimal = new Animales();
		miAnimal.nombre = "Misifú";
		miAnimal.id = 1;
		miAnimal.edad = 14;
		miAnimal.mostrarNombre();
		miAnimal.mostrarCaracteristicas(miAnimal.nombre, miAnimal.edad, miAnimal.id);
		miAnimal.nombre = "Guffi";
		miAnimal.mostrarNombre();
	}

}
