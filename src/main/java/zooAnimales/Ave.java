package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<Ave> ();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
		
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones += 1;
		Ave a = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		
		return a;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas += 1;
		Ave a = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		
		return a;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}

}