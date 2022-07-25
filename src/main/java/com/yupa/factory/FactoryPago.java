package com.yupa.factory;

public class FactoryPago {

	public static IPago builderPago(TypePago typoPago) {
		return switch (typoPago) {
			case TARGETA -> new Targeta();
			case EFECTIVO ->new Efectivo();
			default->new Targeta();
		};
	}
	
}
