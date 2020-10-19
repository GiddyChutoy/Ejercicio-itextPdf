/**
 * 
 */
package com.datos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 201907
 *
 */
public class Datos {
	
	Persona p1 = new Persona("Calvaland", "Salamanca");
	Persona p2 = new Persona("Juancho", "URSS");
	Persona p3 = new Persona("Pedro", "Palmera");
	
	List<Persona> arrayPersonas = new ArrayList<>();
	
	public List<Persona> anadirPersonas() {
		arrayPersonas.add(p1);
		arrayPersonas.add(p2);
		arrayPersonas.add(p3);
		
		return arrayPersonas;
	}
}
