package com.yupa;

import com.yupa.builder.Casa;
import com.yupa.factory.FactoryPago;
import com.yupa.factory.TypePago;
import com.yupa.observador.Periodico;
import com.yupa.observador.Usuario;
import com.yupa.singleton.Persona;

public class Main {
	
	public static void main(String[] args) {
		
		/*FABRICA
		var obj = FactoryPago.builderPago(TypePago.EFECTIVO);
		obj.pago();
		*/
		
		/*SINGLETON
		var persona1 = Persona.getINSTANCE();
		persona1.setNombre("Cesar");
		persona1.setEdad(36);
		
		var persona2 = Persona.getINSTANCE();
		System.out.println(persona2);
		
		var persona3 = Persona.getINSTANCE();
		System.out.println(persona3);
		*/
		
		/*BUILDER
		Casa casa = new Casa.CasaBuilder("Cesar")
				.pared(true)
				.buid();
		
		System.out.println(casa);
		*/
		
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		
		Periodico p = new Periodico();
		p.addSubscriptor(u1);
		p.addSubscriptor(u2);
		
		p.notifySubscriptor();
		
	}

}
