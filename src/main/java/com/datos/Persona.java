/**
 * 
 */
package com.datos;

/**
 * @author 201907
 *
 */
public class Persona {
	private String nombre;
	private String ciudad;

	/**
	 * @param nombre
	 * @param ciudad
	 */
	public Persona(String nombre, String ciudad) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

}
