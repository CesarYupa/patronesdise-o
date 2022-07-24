package com.yupa;

import com.yupa.factory.FactoryPago;
import com.yupa.factory.TypePago;

public class Main {
	
	public static void main(String[] args) {
		
		var obj = FactoryPago.builderPago(TypePago.EFECTIVO);
		obj.pago();
		
	}

}
