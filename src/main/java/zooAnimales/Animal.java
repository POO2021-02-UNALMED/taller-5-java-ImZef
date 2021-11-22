package zooAnimales;
import gestion.Zona;
//import java.util.ArrayList;

public class Animal {
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {
		Animal.totalAnimales += 1;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "/nAves: "+ Ave.cantidadAves() + "/nReptiles: " + Reptil.cantidadReptiles() + "/nPeces: " + Pez.cantidadPeces() +  "/nAnfibios: " + Anfibio.cantidadAnfibios();
	}
	
	public String toString() {
		if(this.zona != null) {
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero +", la zona en la que me ubico es " + this.zona.getNombre() + ",en el zoo " + this.zona.getZoo().getNombre() ;
		}
		else {
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
		}
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getHabitat() {
		return this.habitat;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public Zona getZona() {
		return this.zona;
	}
	
}