package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public Ave crearHalcon(String nombre, int edad, String genero, Zona zona) {
		Ave.halcones += 1;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setZona(zona);
		this.setHabitat("montanas");
		this.colorPlumas = "cafe glorioso";
		
		return this;
		
	}
	
	public Ave crearAguila(String nombre, int edad, String genero, Zona zona) {
		Ave.aguilas += 1;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setZona(zona);
		this.setHabitat("montanas");
		this.colorPlumas = "blanco y amarillo";
		
		return this;
		
	}
	
	public void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	
	public ArrayList<Ave> getListado(){
		return listado;	
		
	}
	
	public void setColorPlumas(String plumas) {
		this.colorPlumas = plumas;
	}
	
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	
}