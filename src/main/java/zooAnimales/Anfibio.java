package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
		Anfibio.ranas += 1;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setZona(zona);
		this.setHabitat("selva");
		this.venenoso = true;
		this.colorPiel = "rojo";
		
		return this;
	}
	
	public Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona) {
		Anfibio.salamandras += 1;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setZona(zona);
		this.setHabitat("selva");
		this.venenoso = false;
		this.colorPiel = "negro y amarillo";
		
		return this;
		
	}
	
	public void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	
	public ArrayList<Anfibio> getListado(){
		return listado;	
		
	}
	
	public void setColorPiel(String piel) {
		this.colorPiel = piel;
	}
	
	public String getColorPiel() {
		return this.colorPiel;
	}
	
	public void setVenenoso(boolean veneno) {
		this.venenoso = veneno;
	}
	
	public boolean getVenenoso() {
		return this.venenoso;
	}

}