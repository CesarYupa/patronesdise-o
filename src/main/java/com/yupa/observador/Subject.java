package com.yupa.observador;

public interface Subject {

	void addSubscriptor(Observer o);
	
	void removeSubscriptor(Observer o);
	
	void notifySubscriptor();
	
}
