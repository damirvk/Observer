package com.damirvk;

public interface Subject {
	
	public void addObeserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObservers();

}
