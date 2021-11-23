package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal{
	private static List<Anfibio> listado = new ArrayList<Anfibio> ();
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas += 1;
		Anfibio a = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		
		return a;
	}

	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras += 1;
		Anfibio a = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		
		return a;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public boolean isVenenoso() {
		return venenoso;
	}
}