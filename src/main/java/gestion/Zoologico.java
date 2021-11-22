package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico() {
		
	}

	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
		
	}
	
	public void agregarZonas(Zona zona) {
		
		this.zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int c = 0;
		for(int i = 0; i < this.zonas.size(); i++) {
			c += this.zonas.get(i).cantidadAnimales();
		}
		return c;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion; 
	}
	
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas; 
	}
	
	public ArrayList<Zona> getZonas() {
		return this.zonas;
	}
	
}