package com.yupa.factory;

public class FactoryPago {

	public static IPago builderPago(TypePago typoPago) {
		switch (typoPago) {
		case TARGETA:
			return new Targeta();
		case EFECTIVO:
			return new Efectivo();
		default:
			return new Targeta();
		}
	}
	
}
