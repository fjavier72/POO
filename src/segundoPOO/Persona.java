package segundoPOO;

public class Persona {

	// Atributos
	String nombre;
	byte edad;
	double estatura;
	
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
