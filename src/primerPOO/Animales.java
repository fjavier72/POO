package primerPOO;

public class Animales {

	// Atributos
	String nombre;
	static int iD=0;
	int edad;
	
	// Constructor por defecto
	public Animales() {
		iD++;
	}

	// Otros constructores
	public Animales(String nombre) {
		iD++;
		this.nombre = nombre;
		System.out.println("El nombre de mi mascota es " + this.nombre);
	}

	public Animales(String nombre, int edad) {  // Es un método contructor
		iD++;
		this.nombre = nombre;
		this.edad = edad;
		System.out.println("El nombre de mi mascota es " + this.nombre + ", su edad es " + this.edad + " años y su ID es " + iD);
	}
	
	// Métodos
	public void mostrarNombre() {
		System.out.println(nombre);
	}
	
	public void mostrarCaracteristicas(String nombre, int edad, int ID) {
		System.out.println("Mi Animal se llama " + nombre + ", tiene " + edad + " años y su ID es " + ID);
	}
	
}
