package com.yupa.observador;

import java.util.ArrayList;
import java.util.List;

public class Periodico implements Subject{
	
	private List<Observer> customers = new ArrayList<>();

	@Override
	public void addSubscriptor(Observer o) {
		customers.add(o);
		
	}

	@Override
	public void removeSubscriptor(Observer o) {
		customers.remove(o);
		
	}

	@Override
	public void notifySubscriptor() {
		
		customers.forEach(o->o.update("Un nuevo cambio"));
		
	}

}
