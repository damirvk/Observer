package com.damirvk;

import java.util.ArrayList;

public class Kladionica implements Subject {
	
	ArrayList<Observer> observers; 
	
	public Kladionica(){
		observers= new ArrayList<Observer>();
	};

	private Integer promjena;
	
	public Integer getPromjena() {
		return promjena;
	}

	public void setPromjena(Integer promjena) {
		this.promjena = promjena;
		notifyObservers();
	}

	@Override
	public void addObeserver(Observer o) {
		observers.add(o);		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		
		for (Observer o:observers) {
			System.out.println("......................");

			o.onUpdate(promjena);
		}		
		
	}

}
