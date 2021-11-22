package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
	public static int iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public Reptil crearIguana(String nombre, int edad, String genero, Zona zona) {
		Reptil.iguanas += 1;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setZona(zona);
		this.setHabitat("humedal");
		this.largoCola = 3;
		this.colorEscamas = "verde";
		
		return this;
	}
	
	public Reptil crearSerpiente(String nombre, int edad, String genero, Zona zona) {
		Reptil.serpientes += 1;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setZona(zona);
		this.setHabitat("jungla");
		this.largoCola = 1;
		this.colorEscamas = "blanco";
		
		return this;
		
	}
	
	public void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
	
	public ArrayList<Reptil> getListado(){
		return listado;	
		
	}
	
	public void setColorEscamas(String escamas) {
		this.colorEscamas = escamas;
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public void setLargoCola(int cola) {
		this.largoCola = cola;
	}
	
	public int getLargoCola() {
		return this.largoCola;
	}

}