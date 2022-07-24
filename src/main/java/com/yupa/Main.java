package com.yupa;

import com.yupa.factory.FactoryPago;
import com.yupa.factory.TypePago;
import com.yupa.singleton.Persona;

public class Main {
	
	public static void main(String[] args) {
		
		/*Factory
		var obj = FactoryPago.builderPago(TypePago.EFECTIVO);
		obj.pago();
		*/
		
		var persona1 = Persona.getINSTANCE();
		persona1.setNombre("Cesar");
		persona1.setEdad(36);
		
		var persona2 = Persona.getINSTANCE();
		System.out.println(persona2);
		
		var persona3 = Persona.getINSTANCE();
		System.out.println(persona3);
		
	}

}
