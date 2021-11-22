package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado;
	public static int caballos = 0;
	public static int leones = 0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public Mamifero crearCaballo(String nombre, int edad, String genero, Zona zona) {
		Mamifero.caballos += 1;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setZona(zona);
		this.pelaje = true;
		this.patas = 4;
		this.setHabitat("pradera");
		
		return this;
	}
	
	public Mamifero crearLeon(String nombre, int edad, String genero, Zona zona) {
		Mamifero.leones += 1;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setZona(zona);
		this.pelaje = true;
		this.patas = 4;
		this.setHabitat("selva");
		
		return this;
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public boolean getPelaje() {
		return this.pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public int getPatas() {
		return this.patas;
	}
	
	public void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	
	public ArrayList<Mamifero> getListado(){
		return listado;
	}
}