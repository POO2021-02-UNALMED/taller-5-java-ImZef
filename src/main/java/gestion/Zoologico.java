package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona> ();
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	
	public void agregarZonas(Zona zonas){
		this.zonas.add(zonas);
	}
	
	public int cantidadTotalAnimales() {
		int c = 0;
		
		for(int i = 0; i < zonas.size(); i++) {
			c += zonas.get(i).cantidadAnimales();
		}
		
		return c;
	}
	
}
