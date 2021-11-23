package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
	public static int iguanas = 0;
	public static int serpientes  = 0;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		//listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		//listado.add(this);
	}
	
	public static int cantidadReptiles() {
		 return listado.size();
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas += 1;
		Reptil a = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		
		return a;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes += 1;
		Reptil a = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		
		return a;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public int getLargoCola() {
		return largoCola;
	}

}