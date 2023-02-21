package primerPOO;

public class Animales {

	// Atributos
	String nombre;
	int id;
	int edad;
	
	// Métodos
	public void mostrarNombre() {
		System.out.println(nombre);
	}
	
	public void mostrarCaracteristicas(String nombre, int edad, int ID) {
		System.out.println("Mi Animal se llama " + nombre + ", tiene " + edad + " años y su ID es " + ID);
	}
	
}
