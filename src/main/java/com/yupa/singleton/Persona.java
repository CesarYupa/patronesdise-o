package com.yupa.singleton;

public class Persona {
	
	public static Persona INSTANCE;

	private String nombre;
	private int edad;
	
	private Persona() {
		
	}	
	
	public synchronized static Persona getINSTANCE() {
		
		if(INSTANCE == null) {
			INSTANCE = new Persona();
		}
		
		return INSTANCE;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
