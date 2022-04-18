package TA_02;

import java.util.Iterator;

public class Password {

	// Attributes
	private int longitud = 8;
	private String contrasena;

	// Constructor
	public Password() {
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarContrasena(longitud);
	}

	// Setters Getters

	// longitud get set
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	// contraseña get set
	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	// Methods

	private String generarContrasena(int longitud) {
		String pass = "";
		for (int i = 0; i < longitud; i++) {
			int digito = random(0,9);
			pass+= digito;
		}
		return pass;
	}
	
	/**
	 * Generar un numero aleatorio entre un minimo y un maximo
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	private int random(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

}
