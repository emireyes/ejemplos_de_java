package hola;

public class Trabajador {
	public String nombre;
	public int edad;
	public int salario;
	public int manos;
	
	public Trabajador(String nombre, int edad, int salario, int manos) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.manos = manos;
	}

	public int calculaDedos () {
		return manos*5; //El programa asume que llegamos con 5 dedos por mano
	}

}
public class Trabajador;
public static void main (String[]){
	Trabajador bob = new Trabajador("Bob",98,0,2);
	System.out.println(bob.calculaDedos());
}

