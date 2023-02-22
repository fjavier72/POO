package segundoPOO;

public class Persona {

	// Atributos
	String nombre;
	int edad;
	double estatura;
	
	// Método constructor por defecto
	public Persona() {
	}

	// Otros métodos constructores
	public Persona(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
		System.out.println("El nombre es " + this.nombre + ", la edad es " + this.edad + " y la estatura es " + this.estatura);
	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		System.out.println("El nombre es " + this.nombre + " y la edad es " + this.edad);
	}

	public Persona(String nombre) {
		this.nombre = nombre;
		System.out.println("El nombre es " + this.nombre);
	}

	// Métodos
	public void saludar() {
		System.out.println("Hola. Mi nombre es " + nombre);
		System.out.println("Encantado de conocerte");
	}
	
	public void cumplirAnios() {
		edad++;  // incrementamos la edad en 1
	}
	
	public void crecer(double incremento) {
		estatura += incremento;  // la estatura aumenta según el incremento
	}
}
