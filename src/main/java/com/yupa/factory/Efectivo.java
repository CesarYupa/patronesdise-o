package com.yupa.factory;

public class Efectivo implements IPago{

	@Override
	public void pago() {
		System.out.println("Pago por ejectivo");	
	}

}
