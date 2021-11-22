package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public Pez crearSalmon(String nombre, int edad, String genero, Zona zona) {
		Pez.salmones += 1;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setZona(zona);
		this.setHabitat("oceano");
		this.cantidadAletas = 6;
		this.colorEscamas = "rojo";
		
		return this;
	}
	
	public Pez crearBacalao(String nombre, int edad, String genero, Zona zona) {
		Pez.bacalaos += 1;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setZona(zona);
		this.setHabitat("oceano");
		this.cantidadAletas = 6;
		this.colorEscamas = "gris";
		
		return this;
		
	}
	
	public void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
	
	public ArrayList<Pez> getListado(){
		return listado;	
		
	}
	
	public void setColorEscamas(String escamas) {
		this.colorEscamas = escamas;
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public void setCantidadAletas(int aletas) {
		this.cantidadAletas = aletas;
	}
	
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}

}
