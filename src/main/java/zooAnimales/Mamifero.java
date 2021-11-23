package zooAnimales;

import java.util.ArraysList;
import java.util.List;


public class Mamifero extends Animal{
	private static List<Mamifero> listado = new ArrayList<Mamifero> ();
	public static int caballos = 0;
	public static int leones = 0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.pelaje = pelaje;
		this.patas = patas;

	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos += 1;
		Mamifero a = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		
		return a;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones += 1;
		Mamifero a = new Mamifero(nombre, edad, "selva", genero, true, 4);
		
		return a;
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public boolean isPelaje() {
		return pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public int getPatas() {
		return patas;
	}
	
}