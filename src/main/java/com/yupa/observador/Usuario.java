package com.yupa.observador;

public class Usuario implements Observer{

	@Override
	public void update(String mensaje) {
		
		System.out.println(mensaje);
		
	}

}
